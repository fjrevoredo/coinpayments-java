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
import org.brunocvcunha.coinpayments.model.RateResponse;
import org.brunocvcunha.coinpayments.model.ResponseWrapper;
import org.brunocvcunha.coinpayments.requests.base.CoinPaymentsPostRequest;

import java.io.IOException;
import java.util.Map;

/**
 * Search GIFs Request
 * 
 * @author Bruno Candido Volpato da Cunha
 *
 */
public class CoinPaymentsRatesRequest extends CoinPaymentsPostRequest<ResponseWrapper<Map<String, RateResponse>>> {


    private boolean onlyShort = false;

    public CoinPaymentsRatesRequest() {
    }

    public CoinPaymentsRatesRequest(boolean onlyShort) {
        this.onlyShort = onlyShort;
    }

    public static CoinPaymentsRatesRequestBuilder builder() {
        return new CoinPaymentsRatesRequestBuilder();
    }

    @Override
    public String getUrl() {
        return "";
    }
    
    @Override
    
    public String getPayload() {
        return "cmd=rates&accepted=1" + "&short=" + (onlyShort ? "1" : "0");
    }


    @Override
    
    public ResponseWrapper<Map<String, RateResponse>> parseResult(int statusCode, String content) throws IOException {
        ResponseWrapper<Map<String, RateResponse>> wrapper = parseJson(content, new TypeReference<ResponseWrapper<Map<String, RateResponse>>>() {});
        return wrapper;
    }


    public boolean isOnlyShort() {
        return this.onlyShort;
    }


    public void setOnlyShort(boolean onlyShort) {
        this.onlyShort = onlyShort;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CoinPaymentsRatesRequest)) return false;
        final CoinPaymentsRatesRequest other = (CoinPaymentsRatesRequest) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isOnlyShort() != other.isOnlyShort()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CoinPaymentsRatesRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isOnlyShort() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "CoinPaymentsRatesRequest(onlyShort=" + this.isOnlyShort() + ")";
    }

    public static class CoinPaymentsRatesRequestBuilder {
        private boolean onlyShort;

        CoinPaymentsRatesRequestBuilder() {
        }


        public CoinPaymentsRatesRequestBuilder onlyShort(boolean onlyShort) {
            this.onlyShort = onlyShort;
            return this;
        }

        public CoinPaymentsRatesRequest build() {
            return new CoinPaymentsRatesRequest(onlyShort);
        }

        public String toString() {
            return "CoinPaymentsRatesRequest.CoinPaymentsRatesRequestBuilder(onlyShort=" + this.onlyShort + ")";
        }
    }
}
