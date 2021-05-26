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
import org.brunocvcunha.coinpayments.model.ConvertCoinResponse;
import org.brunocvcunha.coinpayments.model.ResponseWrapper;
import org.brunocvcunha.coinpayments.requests.base.CoinPaymentsPostRequest;

import java.io.IOException;

public class CoinPaymentsConvertCoinsRequest extends CoinPaymentsPostRequest<ResponseWrapper<ConvertCoinResponse>>  {
	
    @NonNull
    private double amount;
    
    @NonNull
    private String from;
    
    @NonNull
    private String to;
    
    private String address = "";
    
    private String destinationTag = "";

    public CoinPaymentsConvertCoinsRequest(@NonNull double amount, @NonNull String from, @NonNull String to, String address, String destinationTag) {
        this.amount = amount;
        this.from = from;
        this.to = to;
        this.address = address;
        this.destinationTag = destinationTag;
    }

    private static String $default$address() {
        return "";
    }

    private static String $default$destinationTag() {
        return "";
    }

    public static CoinPaymentsConvertCoinsRequestBuilder builder() {
        return new CoinPaymentsConvertCoinsRequestBuilder();
    }

    @Override
	public String getUrl() {
		return "";
	}
	
    @Override
    public String getPayload () {
        return "cmd=convert" + "&amount=" + amount + "&from=" + from + "&to=" + to + "&address=" + address + "&destinationTag" + destinationTag;
    }

	@Override
	public ResponseWrapper<ConvertCoinResponse> parseResult ( int resultCode, String content ) throws IOException {
		ResponseWrapper<ConvertCoinResponse> wrapper = parseJson( content, new TypeReference<ResponseWrapper<ConvertCoinResponse>>() {} );
        return wrapper;
	}

    @NonNull
    public double getAmount() {
        return this.amount;
    }

    @NonNull
    public String getFrom() {
        return this.from;
    }

    @NonNull
    public String getTo() {
        return this.to;
    }

    public String getAddress() {
        return this.address;
    }

    public String getDestinationTag() {
        return this.destinationTag;
    }

    public void setAmount(@NonNull double amount) {
        this.amount = amount;
    }

    public void setFrom(@NonNull String from) {
        this.from = from;
    }

    public void setTo(@NonNull String to) {
        this.to = to;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDestinationTag(String destinationTag) {
        this.destinationTag = destinationTag;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CoinPaymentsConvertCoinsRequest)) return false;
        final CoinPaymentsConvertCoinsRequest other = (CoinPaymentsConvertCoinsRequest) o;
        if (!other.canEqual((Object) this)) return false;
        if (Double.compare(this.getAmount(), other.getAmount()) != 0) return false;
        final Object this$from = this.getFrom();
        final Object other$from = other.getFrom();
        if (this$from == null ? other$from != null : !this$from.equals(other$from)) return false;
        final Object this$to = this.getTo();
        final Object other$to = other.getTo();
        if (this$to == null ? other$to != null : !this$to.equals(other$to)) return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        final Object this$destinationTag = this.getDestinationTag();
        final Object other$destinationTag = other.getDestinationTag();
        if (this$destinationTag == null ? other$destinationTag != null : !this$destinationTag.equals(other$destinationTag))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CoinPaymentsConvertCoinsRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $amount = Double.doubleToLongBits(this.getAmount());
        result = result * PRIME + (int) ($amount >>> 32 ^ $amount);
        final Object $from = this.getFrom();
        result = result * PRIME + ($from == null ? 43 : $from.hashCode());
        final Object $to = this.getTo();
        result = result * PRIME + ($to == null ? 43 : $to.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $destinationTag = this.getDestinationTag();
        result = result * PRIME + ($destinationTag == null ? 43 : $destinationTag.hashCode());
        return result;
    }

    public String toString() {
        return "CoinPaymentsConvertCoinsRequest(amount=" + this.getAmount() + ", from=" + this.getFrom() + ", to=" + this.getTo() + ", address=" + this.getAddress() + ", destinationTag=" + this.getDestinationTag() + ")";
    }

    public static class CoinPaymentsConvertCoinsRequestBuilder {
        private double amount;
        private String from;
        private String to;
        private String address$value;
        private boolean address$set;
        private String destinationTag$value;
        private boolean destinationTag$set;

        CoinPaymentsConvertCoinsRequestBuilder() {
        }

        public CoinPaymentsConvertCoinsRequestBuilder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public CoinPaymentsConvertCoinsRequestBuilder from(String from) {
            this.from = from;
            return this;
        }

        public CoinPaymentsConvertCoinsRequestBuilder to(String to) {
            this.to = to;
            return this;
        }

        public CoinPaymentsConvertCoinsRequestBuilder address(String address) {
            this.address$value = address;
            this.address$set = true;
            return this;
        }

        public CoinPaymentsConvertCoinsRequestBuilder destinationTag(String destinationTag) {
            this.destinationTag$value = destinationTag;
            this.destinationTag$set = true;
            return this;
        }

        public CoinPaymentsConvertCoinsRequest build() {
            String address$value = this.address$value;
            if (!this.address$set) {
                address$value = CoinPaymentsConvertCoinsRequest.$default$address();
            }
            String destinationTag$value = this.destinationTag$value;
            if (!this.destinationTag$set) {
                destinationTag$value = CoinPaymentsConvertCoinsRequest.$default$destinationTag();
            }
            return new CoinPaymentsConvertCoinsRequest(amount, from, to, address$value, destinationTag$value);
        }

        public String toString() {
            return "CoinPaymentsConvertCoinsRequest.CoinPaymentsConvertCoinsRequestBuilder(amount=" + this.amount + ", from=" + this.from + ", to=" + this.to + ", address$value=" + this.address$value + ", destinationTag$value=" + this.destinationTag$value + ")";
        }
    }
}
