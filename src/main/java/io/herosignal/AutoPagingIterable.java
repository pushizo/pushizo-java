package io.herosignal;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

/**
 * Cursor tabanlı sayfalı listeleri ({@code data} / {@code next_cursor} / {@code has_more}) tek tek dolaşan tembel
 * yinelenebilir. Her {@link #iterator()} çağrısı baştan başlar; sayfalar ihtiyaç oldukça istenir.
 *
 * @param <T> öğe tipi
 */
public final class AutoPagingIterable<T> implements Iterable<T> {
    private final String startCursor;
    private final Function<String, Page<T>> fetcher;

    /**
     * @param startCursor ilk cursor (null ise baştan)
     * @param fetcher cursor alıp sayfa döndüren işlev
     */
    public AutoPagingIterable(String startCursor, Function<String, Page<T>> fetcher) {
        this.startCursor = startCursor;
        this.fetcher = fetcher;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private String cursor = startCursor;
            private Iterator<T> current = Collections.emptyIterator();
            private boolean done;

            @Override
            public boolean hasNext() {
                while (!current.hasNext()) {
                    if (done) return false;
                    Page<T> page = fetcher.apply(cursor);
                    current = page.items == null ? Collections.<T>emptyIterator() : page.items.iterator();
                    cursor = page.nextCursor;
                    if (!page.hasMore || cursor == null || cursor.isEmpty()) done = true;
                }
                return true;
            }

            @Override
            public T next() {
                if (!hasNext()) throw new NoSuchElementException();
                return current.next();
            }
        };
    }

    /**
     * Tek sayfa.
     *
     * @param <T> öğe tipi
     */
    public static final class Page<T> {
        final List<T> items;
        final String nextCursor;
        final boolean hasMore;

        /**
         * @param items sayfadaki öğeler
         * @param nextCursor sonraki sayfanın cursor'ı
         * @param hasMore başka sayfa var mı
         */
        public Page(List<T> items, String nextCursor, boolean hasMore) {
            this.items = items;
            this.nextCursor = nextCursor;
            this.hasMore = hasMore;
        }
    }
}
