// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import com.pushizo.Pushizo;
import com.pushizo.RequestOptions;
import com.pushizo.core.Operation;
import com.pushizo.core.PageIterable;
import com.pushizo.models.*;
import com.pushizo.params.*;

/**
 * companies kaynağı.
 */
public final class CompaniesResource {
    private final Pushizo client;

    public CompaniesResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<CompanyList> TYPE_0 = new TypeReference<CompanyList>() {};

    /**
     * Şirket listesi
     *
     * {@code GET /v1/apps/{appId}/companies}
     *
     * Ad, harici kimlik veya alan adında arama; en yeni önce.
     */
    public CompanyList list() {
        return list(null, null);
    }

    /**
     * Şirket listesi
     *
     * {@code GET /v1/apps/{appId}/companies}
     *
     * Ad, harici kimlik veya alan adında arama; en yeni önce.
     */
    public CompanyList list(CompaniesListParams params) {
        return list(params, null);
    }

    /**
     * Şirket listesi
     *
     * {@code GET /v1/apps/{appId}/companies}
     *
     * Ad, harici kimlik veya alan adında arama; en yeni önce.
     */
    public CompanyList list(CompaniesListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/companies");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Company> listAll() {
        return listAll(null, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Company> listAll(CompaniesListParams params) {
        return listAll(params, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Company> listAll(CompaniesListParams params, RequestOptions options) {
        CompaniesListParams base = params == null ? new CompaniesListParams() : params.copy();
        return new PageIterable<>(cursor -> {
            CompaniesListParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            CompanyList page = list(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<Company> TYPE_1 = new TypeReference<Company>() {};

    /**
     * Şirket oluştur/güncelle (external_id ile)
     *
     * {@code POST /v1/apps/{appId}/companies}
     *
     * Aynı external_id varsa ad, alan adı ve özellikler güncellenir; özellikler merge-patch (null siler).
     */
    public Company upsert(UpsertCompanyDto body) {
        return upsert(body, null);
    }

    /**
     * Şirket oluştur/güncelle (external_id ile)
     *
     * {@code POST /v1/apps/{appId}/companies}
     *
     * Aynı external_id varsa ad, alan adı ve özellikler güncellenir; özellikler merge-patch (null siler).
     */
    public Company upsert(UpsertCompanyDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/companies");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<CompanyBatchResult> TYPE_2 = new TypeReference<CompanyBatchResult>() {};

    /**
     * Şirketleri toplu oluştur/güncelle
     *
     * {@code POST /v1/apps/{appId}/companies/batch}
     *
     * İstek başına en çok 1000 şirket; her biri external_id ile upsert edilir.
     */
    public CompanyBatchResult batch(BatchUpsertCompaniesDto body) {
        return batch(body, null);
    }

    /**
     * Şirketleri toplu oluştur/güncelle
     *
     * {@code POST /v1/apps/{appId}/companies/batch}
     *
     * İstek başına en çok 1000 şirket; her biri external_id ile upsert edilir.
     */
    public CompanyBatchResult batch(BatchUpsertCompaniesDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/companies/batch");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<Company> TYPE_3 = new TypeReference<Company>() {};

    /**
     * Şirket detayı
     *
     * {@code GET /v1/apps/{appId}/companies/{companyId}}
     */
    public Company get(String companyId) {
        return get(companyId, null);
    }

    /**
     * Şirket detayı
     *
     * {@code GET /v1/apps/{appId}/companies/{companyId}}
     */
    public Company get(String companyId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/companies/{companyId}");
        op.pathParam("companyId", companyId);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Company> TYPE_4 = new TypeReference<Company>() {};

    /**
     * Şirketi güncelle
     *
     * {@code PATCH /v1/apps/{appId}/companies/{companyId}}
     */
    public Company update(String companyId, UpdateCompanyDto body) {
        return update(companyId, body, null);
    }

    /**
     * Şirketi güncelle
     *
     * {@code PATCH /v1/apps/{appId}/companies/{companyId}}
     */
    public Company update(String companyId, UpdateCompanyDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/companies/{companyId}");
        op.pathParam("companyId", companyId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<Ok> TYPE_5 = new TypeReference<Ok>() {};

    /**
     * Şirketi sil
     *
     * {@code DELETE /v1/apps/{appId}/companies/{companyId}}
     *
     * Üyelikler silinir; kişiler kalır.
     */
    public Ok delete(String companyId) {
        return delete(companyId, null);
    }

    /**
     * Şirketi sil
     *
     * {@code DELETE /v1/apps/{appId}/companies/{companyId}}
     *
     * Üyelikler silinir; kişiler kalır.
     */
    public Ok delete(String companyId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/companies/{companyId}");
        op.pathParam("companyId", companyId);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<CompanyMemberList> TYPE_6 = new TypeReference<CompanyMemberList>() {};

    /**
     * Şirketin kişileri
     *
     * {@code GET /v1/apps/{appId}/companies/{companyId}/members}
     */
    public CompanyMemberList members(String companyId) {
        return members(companyId, null, null);
    }

    /**
     * Şirketin kişileri
     *
     * {@code GET /v1/apps/{appId}/companies/{companyId}/members}
     */
    public CompanyMemberList members(String companyId, CompaniesMembersParams params) {
        return members(companyId, params, null);
    }

    /**
     * Şirketin kişileri
     *
     * {@code GET /v1/apps/{appId}/companies/{companyId}/members}
     */
    public CompanyMemberList members(String companyId, CompaniesMembersParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/companies/{companyId}/members");
        op.pathParam("companyId", companyId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_6);
    }

    /**
     * members sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<CompanyMember> membersAll(String companyId) {
        return membersAll(companyId, null, null);
    }

    /**
     * members sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<CompanyMember> membersAll(String companyId, CompaniesMembersParams params) {
        return membersAll(companyId, params, null);
    }

    /**
     * members sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<CompanyMember> membersAll(String companyId, CompaniesMembersParams params, RequestOptions options) {
        CompaniesMembersParams base = params == null ? new CompaniesMembersParams() : params.copy();
        return new PageIterable<>(cursor -> {
            CompaniesMembersParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            CompanyMemberList page = members(companyId, p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<CompanyMemberBatchResult> TYPE_7 = new TypeReference<CompanyMemberBatchResult>() {};

    /**
     * Şirkete toplu kişi ekle
     *
     * {@code POST /v1/apps/{appId}/companies/{companyId}/members/batch}
     *
     * Kişi user_id veya kişinin external_id değeriyle verilir; bulunamayanlar yanıtta listelenir.
     */
    public CompanyMemberBatchResult batchMembers(String companyId, BatchMembersDto body) {
        return batchMembers(companyId, body, null);
    }

    /**
     * Şirkete toplu kişi ekle
     *
     * {@code POST /v1/apps/{appId}/companies/{companyId}/members/batch}
     *
     * Kişi user_id veya kişinin external_id değeriyle verilir; bulunamayanlar yanıtta listelenir.
     */
    public CompanyMemberBatchResult batchMembers(String companyId, BatchMembersDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/companies/{companyId}/members/batch");
        op.pathParam("companyId", companyId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<CompanyMember> TYPE_8 = new TypeReference<CompanyMember>() {};

    /**
     * Kişiyi şirkete bağla veya rolünü değiştir
     *
     * {@code PUT /v1/apps/{appId}/companies/{companyId}/members/{userId}}
     *
     * Rol verilmezse yeni üyelik member olur, mevcut üyelik rolünü korur.
     */
    public CompanyMember setMember(String companyId, String userId, SetMemberDto body) {
        return setMember(companyId, userId, body, null);
    }

    /**
     * Kişiyi şirkete bağla veya rolünü değiştir
     *
     * {@code PUT /v1/apps/{appId}/companies/{companyId}/members/{userId}}
     *
     * Rol verilmezse yeni üyelik member olur, mevcut üyelik rolünü korur.
     */
    public CompanyMember setMember(String companyId, String userId, SetMemberDto body, RequestOptions options) {
        Operation op = new Operation("PUT", "/v1/apps/{appId}/companies/{companyId}/members/{userId}");
        op.pathParam("companyId", companyId);
        op.pathParam("userId", userId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_8);
    }

    private static final TypeReference<Ok> TYPE_9 = new TypeReference<Ok>() {};

    /**
     * Kişiyi şirketten çıkar
     *
     * {@code DELETE /v1/apps/{appId}/companies/{companyId}/members/{userId}}
     */
    public Ok removeMember(String companyId, String userId) {
        return removeMember(companyId, userId, null);
    }

    /**
     * Kişiyi şirketten çıkar
     *
     * {@code DELETE /v1/apps/{appId}/companies/{companyId}/members/{userId}}
     */
    public Ok removeMember(String companyId, String userId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/companies/{companyId}/members/{userId}");
        op.pathParam("companyId", companyId);
        op.pathParam("userId", userId);
        return client.execute(op, options, TYPE_9);
    }
}
