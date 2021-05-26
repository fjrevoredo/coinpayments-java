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
import org.brunocvcunha.coinpayments.model.ConversionLimitsResponse;
import org.brunocvcunha.coinpayments.model.ResponseWrapper;
import org.brunocvcunha.coinpayments.requests.base.CoinPaymentsPostRequest;

import java.io.IOException;

public class CoinPaymentsConversionLimitsRequest extends CoinPaymentsPostRequest<ResponseWrapper<ConversionLimitsResponse>> {

    @NonNull
    private String from;

    @NonNull
    private String to;

    public CoinPaymentsConversionLimitsRequest(@NonNull String from, @NonNull String to) {
        this.from = from;
        this.to = to;
    }

    public static CoinPaymentsConversionLimitsRequestBuilder builder() {
        return new CoinPaymentsConversionLimitsRequestBuilder();
    }

    @Override
	public String getUrl() {
		return "";
	}

    @Override
    public String getPayload () {
        return "cmd=convert_limits" + "&from=" + from + "&to=" + to;
    }

	@Override
	public ResponseWrapper<ConversionLimitsResponse> parseResult(int resultCode, String content) throws IOException {
		ResponseWrapper<ConversionLimitsResponse> wrapper = parseJson( content, new TypeReference<ResponseWrapper<ConversionLimitsResponse>>() {} );
        return wrapper;
	}

    @NonNull
    public String getFrom() {
        return this.from;
    }

    @NonNull
    public String getTo() {
        return this.to;
    }

    public void setFrom(@NonNull String from) {
        this.from = from;
    }

    public void setTo(@NonNull String to) {
        this.to = to;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CoinPaymentsConversionLimitsRequest)) return false;
        final CoinPaymentsConversionLimitsRequest other = (CoinPaymentsConversionLimitsRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$from = this.getFrom();
        final Object other$from = other.getFrom();
        if (this$from == null ? other$from != null : !this$from.equals(other$from)) return false;
        final Object this$to = this.getTo();
        final Object other$to = other.getTo();
        if (this$to == null ? other$to != null : !this$to.equals(other$to)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CoinPaymentsConversionLimitsRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $from = this.getFrom();
        result = result * PRIME + ($from == null ? 43 : $from.hashCode());
        final Object $to = this.getTo();
        result = result * PRIME + ($to == null ? 43 : $to.hashCode());
        return result;
    }

    public String toString() {
        return "CoinPaymentsConversionLimitsRequest(from=" + this.getFrom() + ", to=" + this.getTo() + ")";
    }

    public static class CoinPaymentsConversionLimitsRequestBuilder {
        private String from;
        private String to;

        CoinPaymentsConversionLimitsRequestBuilder() {
        }

        public CoinPaymentsConversionLimitsRequestBuilder from(String from) {
            this.from = from;
            return this;
        }

        public CoinPaymentsConversionLimitsRequestBuilder to(String to) {
            this.to = to;
            return this;
        }

        public CoinPaymentsConversionLimitsRequest build() {
            return new CoinPaymentsConversionLimitsRequest(from, to);
        }

        public String toString() {
            return "CoinPaymentsConversionLimitsRequest.CoinPaymentsConversionLimitsRequestBuilder(from=" + this.from + ", to=" + this.to + ")";
        }
    }
}
