// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.HeroSignal;
import io.herosignal.RequestOptions;
import io.herosignal.core.Operation;
import io.herosignal.core.PageIterable;
import io.herosignal.models.*;
import io.herosignal.params.*;

/**
 * dataFeeds kaynağı.
 */
public final class DataFeedsResource {
    private final HeroSignal client;

    public DataFeedsResource(HeroSignal client) {
        this.client = client;
    }

    private static final TypeReference<DataFeedList> TYPE_0 = new TypeReference<DataFeedList>() {};

    /**
     * Data feed listesi
     *
     * {@code GET /v1/apps/{appId}/data-feeds}
     */
    public DataFeedList listFeeds() {
        return listFeeds(null);
    }

    /**
     * Data feed listesi
     *
     * {@code GET /v1/apps/{appId}/data-feeds}
     */
    public DataFeedList listFeeds(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/data-feeds");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<DataFeed> TYPE_1 = new TypeReference<DataFeed>() {};

    /**
     * Data feed oluştur
     *
     * {@code POST /v1/apps/{appId}/data-feeds}
     *
     * URL şablonu Liquid ile kişiselleştirilir (ör. `https://api.ornek.com/u/{{ user.external_id }}`); şablonda `{{ feed.&lt;ad&gt;.alan }}`.
     */
    public DataFeed createFeed(CreateDataFeedDto body) {
        return createFeed(body, null);
    }

    /**
     * Data feed oluştur
     *
     * {@code POST /v1/apps/{appId}/data-feeds}
     *
     * URL şablonu Liquid ile kişiselleştirilir (ör. `https://api.ornek.com/u/{{ user.external_id }}`); şablonda `{{ feed.&lt;ad&gt;.alan }}`.
     */
    public DataFeed createFeed(CreateDataFeedDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/data-feeds");
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<DataFeed> TYPE_2 = new TypeReference<DataFeed>() {};

    /**
     * Data feed ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/data-feeds/{feedId}}
     */
    public DataFeed getFeed(String feedId) {
        return getFeed(feedId, null);
    }

    /**
     * Data feed ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/data-feeds/{feedId}}
     */
    public DataFeed getFeed(String feedId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/data-feeds/{feedId}");
        op.pathParam("feedId", feedId);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<DataFeed> TYPE_3 = new TypeReference<DataFeed>() {};

    /**
     * Data feed güncelle
     *
     * {@code PATCH /v1/apps/{appId}/data-feeds/{feedId}}
     */
    public DataFeed updateFeed(String feedId, UpdateDataFeedDto body) {
        return updateFeed(feedId, body, null);
    }

    /**
     * Data feed güncelle
     *
     * {@code PATCH /v1/apps/{appId}/data-feeds/{feedId}}
     */
    public DataFeed updateFeed(String feedId, UpdateDataFeedDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/data-feeds/{feedId}");
        op.pathParam("feedId", feedId);
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Ok> TYPE_4 = new TypeReference<Ok>() {};

    /**
     * Data feed sil
     *
     * {@code DELETE /v1/apps/{appId}/data-feeds/{feedId}}
     */
    public Ok deleteFeed(String feedId) {
        return deleteFeed(feedId, null);
    }

    /**
     * Data feed sil
     *
     * {@code DELETE /v1/apps/{appId}/data-feeds/{feedId}}
     */
    public Ok deleteFeed(String feedId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/data-feeds/{feedId}");
        op.pathParam("feedId", feedId);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<DataFeedTestResult> TYPE_5 = new TypeReference<DataFeedTestResult>() {};

    /**
     * Data feed'i örnek kullanıcıyla dene
     *
     * {@code POST /v1/apps/{appId}/data-feeds/{feedId}/test}
     */
    public DataFeedTestResult testFeed(String feedId, TestDataFeedDto body) {
        return testFeed(feedId, body, null);
    }

    /**
     * Data feed'i örnek kullanıcıyla dene
     *
     * {@code POST /v1/apps/{appId}/data-feeds/{feedId}/test}
     */
    public DataFeedTestResult testFeed(String feedId, TestDataFeedDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/data-feeds/{feedId}/test");
        op.pathParam("feedId", feedId);
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_5);
    }
}
