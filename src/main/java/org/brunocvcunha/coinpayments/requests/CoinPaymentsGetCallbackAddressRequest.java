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
import lombok.NonNull;
import org.brunocvcunha.coinpayments.model.AddressResponse;
import org.brunocvcunha.coinpayments.model.ResponseWrapper;
import org.brunocvcunha.coinpayments.requests.base.CoinPaymentsPostRequest;

import java.io.IOException;

public class CoinPaymentsGetCallbackAddressRequest extends CoinPaymentsPostRequest<ResponseWrapper<AddressResponse>> {

    @NonNull
    private String currency;

    private String IPNUrl = "";

    public CoinPaymentsGetCallbackAddressRequest(@NonNull String currency) {
        this.currency = currency;
    }

    public CoinPaymentsGetCallbackAddressRequest(@NonNull String currency, String IPNUrl) {
        this.currency = currency;
        this.IPNUrl = IPNUrl;
    }

    private static String $default$IPNUrl() {
        return "";
    }

    public static CoinPaymentsGetCallbackAddressRequestBuilder builder() {
        return new CoinPaymentsGetCallbackAddressRequestBuilder();
    }

    @Override
    public String getUrl () {
        return "";
    }

    @Override
    public String getPayload () {
        return "cmd=get_callback_address" + "&currency=" + currency + "&ipn_url=" + IPNUrl;
    }

    @Override
    public ResponseWrapper<AddressResponse> parseResult ( int resultCode, String content ) throws IOException {
        ResponseWrapper<AddressResponse> wrapper = parseJson( content, new TypeReference<ResponseWrapper<AddressResponse>>() {} );
        return wrapper;
    }

    @NonNull
    public String getCurrency() {
        return this.currency;
    }

    public String getIPNUrl() {
        return this.IPNUrl;
    }

    public void setCurrency(@NonNull String currency) {
        this.currency = currency;
    }

    public void setIPNUrl(String IPNUrl) {
        this.IPNUrl = IPNUrl;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CoinPaymentsGetCallbackAddressRequest)) return false;
        final CoinPaymentsGetCallbackAddressRequest other = (CoinPaymentsGetCallbackAddressRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$currency = this.getCurrency();
        final Object other$currency = other.getCurrency();
        if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) return false;
        final Object this$IPNUrl = this.getIPNUrl();
        final Object other$IPNUrl = other.getIPNUrl();
        if (this$IPNUrl == null ? other$IPNUrl != null : !this$IPNUrl.equals(other$IPNUrl)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CoinPaymentsGetCallbackAddressRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $currency = this.getCurrency();
        result = result * PRIME + ($currency == null ? 43 : $currency.hashCode());
        final Object $IPNUrl = this.getIPNUrl();
        result = result * PRIME + ($IPNUrl == null ? 43 : $IPNUrl.hashCode());
        return result;
    }

    public String toString() {
        return "CoinPaymentsGetCallbackAddressRequest(currency=" + this.getCurrency() + ", IPNUrl=" + this.getIPNUrl() + ")";
    }

    public static class CoinPaymentsGetCallbackAddressRequestBuilder {
        private String currency;
        private String IPNUrl$value;
        private boolean IPNUrl$set;

        CoinPaymentsGetCallbackAddressRequestBuilder() {
        }

        public CoinPaymentsGetCallbackAddressRequestBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public CoinPaymentsGetCallbackAddressRequestBuilder IPNUrl(String IPNUrl) {
            this.IPNUrl$value = IPNUrl;
            this.IPNUrl$set = true;
            return this;
        }

        public CoinPaymentsGetCallbackAddressRequest build() {
            String IPNUrl$value = this.IPNUrl$value;
            if (!this.IPNUrl$set) {
                IPNUrl$value = CoinPaymentsGetCallbackAddressRequest.$default$IPNUrl();
            }
            return new CoinPaymentsGetCallbackAddressRequest(currency, IPNUrl$value);
        }

        public String toString() {
            return "CoinPaymentsGetCallbackAddressRequest.CoinPaymentsGetCallbackAddressRequestBuilder(currency=" + this.currency + ", IPNUrl$value=" + this.IPNUrl$value + ")";
        }
    }
}
