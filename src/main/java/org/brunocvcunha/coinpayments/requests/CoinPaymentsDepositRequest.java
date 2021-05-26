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
import org.brunocvcunha.coinpayments.model.AddressResponse;
import org.brunocvcunha.coinpayments.model.ResponseWrapper;
import org.brunocvcunha.coinpayments.requests.base.CoinPaymentsPostRequest;

import java.io.IOException;

public class CoinPaymentsDepositRequest extends CoinPaymentsPostRequest<ResponseWrapper<AddressResponse>> {

    private String currency;

    public CoinPaymentsDepositRequest(String currency) {
        this.currency = currency;
    }

    public static CoinPaymentsDepositRequestBuilder builder() {
        return new CoinPaymentsDepositRequestBuilder();
    }

    @Override
    public String getUrl () {
        return "";
    }

    @Override
    public String getPayload () {
        return "cmd=get_deposit_address" + "&currency=" + currency;
    }

    @Override
    public ResponseWrapper<AddressResponse> parseResult ( int resultCode, String content ) throws IOException {
        ResponseWrapper<AddressResponse> wrapper = parseJson( content, new TypeReference<ResponseWrapper<AddressResponse>>() {} );
        return wrapper;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CoinPaymentsDepositRequest)) return false;
        final CoinPaymentsDepositRequest other = (CoinPaymentsDepositRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$currency = this.getCurrency();
        final Object other$currency = other.getCurrency();
        if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CoinPaymentsDepositRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $currency = this.getCurrency();
        result = result * PRIME + ($currency == null ? 43 : $currency.hashCode());
        return result;
    }

    public String toString() {
        return "CoinPaymentsDepositRequest(currency=" + this.getCurrency() + ")";
    }

    public static class CoinPaymentsDepositRequestBuilder {
        private String currency;

        CoinPaymentsDepositRequestBuilder() {
        }

        public CoinPaymentsDepositRequestBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public CoinPaymentsDepositRequest build() {
            return new CoinPaymentsDepositRequest(currency);
        }

        public String toString() {
            return "CoinPaymentsDepositRequest.CoinPaymentsDepositRequestBuilder(currency=" + this.currency + ")";
        }
    }
}
