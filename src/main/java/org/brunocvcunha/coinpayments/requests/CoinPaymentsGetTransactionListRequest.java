/**
 * Copyright (C) 2018 Bruno Candido Volpato da Cunha (brunocvcunha@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.brunocvcunha.coinpayments.requests;

import com.fasterxml.jackson.core.type.TypeReference;
import org.brunocvcunha.coinpayments.model.ResponseWrapper;
import org.brunocvcunha.coinpayments.requests.base.CoinPaymentsPostRequest;

import java.io.IOException;
import java.util.List;

public class CoinPaymentsGetTransactionListRequest extends CoinPaymentsPostRequest<ResponseWrapper<List<String>>> {

    private int limit = 25;

    private long start = 0;

    private int newer = 0;

    private int all = 0;

    public CoinPaymentsGetTransactionListRequest(int limit, long start, int newer, int all) {
        this.limit = limit;
        this.start = start;
        this.newer = newer;
        this.all = all;
    }

    public CoinPaymentsGetTransactionListRequest() {
    }

    private static int $default$limit() {
        return 25;
    }

    private static long $default$start() {
        return 0;
    }

    private static int $default$newer() {
        return 0;
    }

    private static int $default$all() {
        return 0;
    }

    public static CoinPaymentsGetTransactionListRequestBuilder builder() {
        return new CoinPaymentsGetTransactionListRequestBuilder();
    }

    @Override
    public String getUrl () {
        return "";
    }

    @Override
    public String getPayload () {
        return "cmd=get_tx_ids" + "&limit=" + limit + "&start=" + start + "&newer=" + newer + "&all=" + all;
    }

    @Override
    public ResponseWrapper<List<String>> parseResult ( int resultCode, String content ) throws IOException {
        ResponseWrapper<List<String>> wrapper = parseJson( content, new TypeReference<ResponseWrapper<List<String>>>() {} );
        return wrapper;
    }

    public int getLimit() {
        return this.limit;
    }

    public long getStart() {
        return this.start;
    }

    public int getNewer() {
        return this.newer;
    }

    public int getAll() {
        return this.all;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public void setNewer(int newer) {
        this.newer = newer;
    }

    public void setAll(int all) {
        this.all = all;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CoinPaymentsGetTransactionListRequest)) return false;
        final CoinPaymentsGetTransactionListRequest other = (CoinPaymentsGetTransactionListRequest) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getLimit() != other.getLimit()) return false;
        if (this.getStart() != other.getStart()) return false;
        if (this.getNewer() != other.getNewer()) return false;
        if (this.getAll() != other.getAll()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CoinPaymentsGetTransactionListRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getLimit();
        final long $start = this.getStart();
        result = result * PRIME + (int) ($start >>> 32 ^ $start);
        result = result * PRIME + this.getNewer();
        result = result * PRIME + this.getAll();
        return result;
    }

    public String toString() {
        return "CoinPaymentsGetTransactionListRequest(limit=" + this.getLimit() + ", start=" + this.getStart() + ", newer=" + this.getNewer() + ", all=" + this.getAll() + ")";
    }

    public static class CoinPaymentsGetTransactionListRequestBuilder {
        private int limit$value;
        private boolean limit$set;
        private long start$value;
        private boolean start$set;
        private int newer$value;
        private boolean newer$set;
        private int all$value;
        private boolean all$set;

        CoinPaymentsGetTransactionListRequestBuilder() {
        }

        public CoinPaymentsGetTransactionListRequestBuilder limit(int limit) {
            this.limit$value = limit;
            this.limit$set = true;
            return this;
        }

        public CoinPaymentsGetTransactionListRequestBuilder start(long start) {
            this.start$value = start;
            this.start$set = true;
            return this;
        }

        public CoinPaymentsGetTransactionListRequestBuilder newer(int newer) {
            this.newer$value = newer;
            this.newer$set = true;
            return this;
        }

        public CoinPaymentsGetTransactionListRequestBuilder all(int all) {
            this.all$value = all;
            this.all$set = true;
            return this;
        }

        public CoinPaymentsGetTransactionListRequest build() {
            int limit$value = this.limit$value;
            if (!this.limit$set) {
                limit$value = CoinPaymentsGetTransactionListRequest.$default$limit();
            }
            long start$value = this.start$value;
            if (!this.start$set) {
                start$value = CoinPaymentsGetTransactionListRequest.$default$start();
            }
            int newer$value = this.newer$value;
            if (!this.newer$set) {
                newer$value = CoinPaymentsGetTransactionListRequest.$default$newer();
            }
            int all$value = this.all$value;
            if (!this.all$set) {
                all$value = CoinPaymentsGetTransactionListRequest.$default$all();
            }
            return new CoinPaymentsGetTransactionListRequest(limit$value, start$value, newer$value, all$value);
        }

        public String toString() {
            return "CoinPaymentsGetTransactionListRequest.CoinPaymentsGetTransactionListRequestBuilder(limit$value=" + this.limit$value + ", start$value=" + this.start$value + ", newer$value=" + this.newer$value + ", all$value=" + this.all$value + ")";
        }
    }
}
