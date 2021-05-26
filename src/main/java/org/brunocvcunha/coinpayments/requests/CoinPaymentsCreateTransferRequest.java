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
import org.brunocvcunha.coinpayments.model.CreateTransferResponse;
import org.brunocvcunha.coinpayments.model.ResponseWrapper;
import org.brunocvcunha.coinpayments.requests.base.CoinPaymentsPostRequest;

import java.io.IOException;

public class CoinPaymentsCreateTransferRequest extends CoinPaymentsPostRequest<ResponseWrapper<CreateTransferResponse>>  {
	
    @NonNull
    private double amount;

    @NonNull
    private String currency;

    private String merchant = "";
    
    private String pbntag = "";

    private boolean autoConfirm = true;

    public CoinPaymentsCreateTransferRequest(@NonNull double amount, @NonNull String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public CoinPaymentsCreateTransferRequest(@NonNull double amount, @NonNull String currency, String merchant, String pbntag, boolean autoConfirm) {
        this.amount = amount;
        this.currency = currency;
        this.merchant = merchant;
        this.pbntag = pbntag;
        this.autoConfirm = autoConfirm;
    }

    private static String $default$merchant() {
        return "";
    }

    private static String $default$pbntag() {
        return "";
    }

    private static boolean $default$autoConfirm() {
        return true;
    }

    public static CoinPaymentsCreateTransferRequestBuilder builder() {
        return new CoinPaymentsCreateTransferRequestBuilder();
    }


    @Override
	public String getUrl() {
		return "";
	}

    @Override
    public String getPayload() {
    	String p = (!merchant.isEmpty()) ? "&merchant=" + merchant : "&pbntag" + pbntag;
        return "cmd=create_transfer" + "&amount=" + amount + p + "&currency=" + currency + "&auto_confirm=" + ( autoConfirm ? 1 : 0 );
    }

	@Override
	public ResponseWrapper<CreateTransferResponse> parseResult(int resultCode, String content) throws IOException {
        ResponseWrapper<CreateTransferResponse> wrapper = parseJson( content, new TypeReference<ResponseWrapper<CreateTransferResponse>>() {} );
        return wrapper;
	}

    @NonNull
    public double getAmount() {
        return this.amount;
    }

    @NonNull
    public String getCurrency() {
        return this.currency;
    }

    public String getMerchant() {
        return this.merchant;
    }

    public String getPbntag() {
        return this.pbntag;
    }

    public boolean isAutoConfirm() {
        return this.autoConfirm;
    }

    public void setAmount(@NonNull double amount) {
        this.amount = amount;
    }

    public void setCurrency(@NonNull String currency) {
        this.currency = currency;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public void setPbntag(String pbntag) {
        this.pbntag = pbntag;
    }

    public void setAutoConfirm(boolean autoConfirm) {
        this.autoConfirm = autoConfirm;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CoinPaymentsCreateTransferRequest)) return false;
        final CoinPaymentsCreateTransferRequest other = (CoinPaymentsCreateTransferRequest) o;
        if (!other.canEqual((Object) this)) return false;
        if (Double.compare(this.getAmount(), other.getAmount()) != 0) return false;
        final Object this$currency = this.getCurrency();
        final Object other$currency = other.getCurrency();
        if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) return false;
        final Object this$merchant = this.getMerchant();
        final Object other$merchant = other.getMerchant();
        if (this$merchant == null ? other$merchant != null : !this$merchant.equals(other$merchant)) return false;
        final Object this$pbntag = this.getPbntag();
        final Object other$pbntag = other.getPbntag();
        if (this$pbntag == null ? other$pbntag != null : !this$pbntag.equals(other$pbntag)) return false;
        if (this.isAutoConfirm() != other.isAutoConfirm()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CoinPaymentsCreateTransferRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $amount = Double.doubleToLongBits(this.getAmount());
        result = result * PRIME + (int) ($amount >>> 32 ^ $amount);
        final Object $currency = this.getCurrency();
        result = result * PRIME + ($currency == null ? 43 : $currency.hashCode());
        final Object $merchant = this.getMerchant();
        result = result * PRIME + ($merchant == null ? 43 : $merchant.hashCode());
        final Object $pbntag = this.getPbntag();
        result = result * PRIME + ($pbntag == null ? 43 : $pbntag.hashCode());
        result = result * PRIME + (this.isAutoConfirm() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "CoinPaymentsCreateTransferRequest(amount=" + this.getAmount() + ", currency=" + this.getCurrency() + ", merchant=" + this.getMerchant() + ", pbntag=" + this.getPbntag() + ", autoConfirm=" + this.isAutoConfirm() + ")";
    }

    public static class CoinPaymentsCreateTransferRequestBuilder {
        private double amount;
        private String currency;
        private String merchant$value;
        private boolean merchant$set;
        private String pbntag$value;
        private boolean pbntag$set;
        private boolean autoConfirm$value;
        private boolean autoConfirm$set;

        CoinPaymentsCreateTransferRequestBuilder() {
        }

        public CoinPaymentsCreateTransferRequestBuilder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public CoinPaymentsCreateTransferRequestBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public CoinPaymentsCreateTransferRequestBuilder merchant(String merchant) {
            this.merchant$value = merchant;
            this.merchant$set = true;
            return this;
        }

        public CoinPaymentsCreateTransferRequestBuilder pbntag(String pbntag) {
            this.pbntag$value = pbntag;
            this.pbntag$set = true;
            return this;
        }

        public CoinPaymentsCreateTransferRequestBuilder autoConfirm(boolean autoConfirm) {
            this.autoConfirm$value = autoConfirm;
            this.autoConfirm$set = true;
            return this;
        }

        public CoinPaymentsCreateTransferRequest build() {
            String merchant$value = this.merchant$value;
            if (!this.merchant$set) {
                merchant$value = CoinPaymentsCreateTransferRequest.$default$merchant();
            }
            String pbntag$value = this.pbntag$value;
            if (!this.pbntag$set) {
                pbntag$value = CoinPaymentsCreateTransferRequest.$default$pbntag();
            }
            boolean autoConfirm$value = this.autoConfirm$value;
            if (!this.autoConfirm$set) {
                autoConfirm$value = CoinPaymentsCreateTransferRequest.$default$autoConfirm();
            }
            return new CoinPaymentsCreateTransferRequest(amount, currency, merchant$value, pbntag$value, autoConfirm$value);
        }

        public String toString() {
            return "CoinPaymentsCreateTransferRequest.CoinPaymentsCreateTransferRequestBuilder(amount=" + this.amount + ", currency=" + this.currency + ", merchant$value=" + this.merchant$value + ", pbntag$value=" + this.pbntag$value + ", autoConfirm$value=" + this.autoConfirm$value + ")";
        }
    }
}
