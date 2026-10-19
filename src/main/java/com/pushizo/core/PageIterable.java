package com.pushizo.core;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Cursor sayfalama yardımcısı: {@code data} / {@code next_cursor} / {@code has_more} zarfını tembel yükleyerek dolaşır.
 *
 * <pre>{@code
 * for (Segment s : hs.segments().listAll()) { ... }
 * hs.segments().listAll().stream().limit(100).forEach(...);
 * }</pre>
 */
public final class PageIterable<T> implements Iterable<T> {
    /** Tek bir sayfa. */
    public record Page<T>(List<T> data, String nextCursor, boolean hasMore) {
    }

    private final Function<String, Page<T>> fetch;

    public PageIterable(Function<String, Page<T>> fetch) {
        this.fetch = fetch;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Iterator<T> current = Collections.emptyIterator();
            private String cursor;
            private boolean started;
            private boolean done;

            @Override
            public boolean hasNext() {
                while (!current.hasNext()) {
                    if (done) {
                        return false;
                    }
                    Page<T> page = fetch.apply(started ? cursor : null);
                    started = true;
                    List<T> data = page.data() == null ? List.of() : page.data();
                    current = data.iterator();
                    cursor = page.nextCursor();
                    if (!page.hasMore() || cursor == null || cursor.isEmpty()) {
                        done = true;
                    }
                }
                return true;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return current.next();
            }
        };
    }

    public Stream<T> stream() {
        return StreamSupport.stream(spliterator(), false);
    }
}
