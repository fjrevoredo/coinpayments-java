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
import org.apache.log4j.Logger;
import org.brunocvcunha.coinpayments.model.CreateTransactionResponse;
import org.brunocvcunha.coinpayments.model.ResponseWrapper;
import org.brunocvcunha.coinpayments.requests.base.CoinPaymentsPostRequest;

import java.io.IOException;

/**
 * CoinPaymentsCreateTransactionRequest
 * 
 * @author Bruno Candido Volpato da Cunha
 *
 */
public class CoinPaymentsCreateTransactionRequest
        extends CoinPaymentsPostRequest<ResponseWrapper<CreateTransactionResponse>> {

    private static final Logger log = Logger.getLogger(CoinPaymentsCreateTransactionRequest.class);
    @NonNull
    private double amount;

    @NonNull
    private String currencyPrice;

    @NonNull
    private String currencyTransfer;

    private String address = "";

    private String buyerEmail = "";
    private String buyerName = "";
    private String itemName = "";
    private String itemCode = "";
    private String invoice = "";
    private String custom = "";
    private String callbackUrl = "";
    private long timeout = 7200;           //expiration of transaction in seconds

    public CoinPaymentsCreateTransactionRequest(@NonNull double amount, @NonNull String currencyPrice, @NonNull String currencyTransfer) {
        this.amount = amount;
        this.currencyPrice = currencyPrice;
        this.currencyTransfer = currencyTransfer;
    }

    public CoinPaymentsCreateTransactionRequest(@NonNull double amount, @NonNull String currencyPrice, @NonNull String currencyTransfer, String address, String buyerEmail, String buyerName, String itemName, String itemCode, String invoice, String custom, String callbackUrl, long timeout) {
        this.amount = amount;
        this.currencyPrice = currencyPrice;
        this.currencyTransfer = currencyTransfer;
        this.address = address;
        this.buyerEmail = buyerEmail;
        this.buyerName = buyerName;
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.invoice = invoice;
        this.custom = custom;
        this.callbackUrl = callbackUrl;
        this.timeout = timeout;
    }

    private static String $default$address() {
        return "";
    }

    private static String $default$buyerEmail() {
        return "";
    }

    private static String $default$buyerName() {
        return "";
    }

    private static String $default$itemName() {
        return "";
    }

    private static String $default$itemCode() {
        return "";
    }

    private static String $default$invoice() {
        return "";
    }

    private static String $default$custom() {
        return "";
    }

    private static String $default$callbackUrl() {
        return "";
    }

    private static long $default$timeout() {
        return 7200;
    }

    public static CoinPaymentsCreateTransactionRequestBuilder builder() {
        return new CoinPaymentsCreateTransactionRequestBuilder();
    }

    @Override
    public String getUrl() {
        return "";
    }

    @Override
    
    public String getPayload() {
        return "cmd=create_transaction" + "&amount=" + amount + "" + "&currency1=" + currencyPrice + "&currency2="
                + currencyTransfer + "&address=" + address + "&buyer_email=" + buyerEmail + "&buyer_name=" + buyerName
                + "&item_name=" + itemName + "&item_number=" + itemCode + "&invoice=" + invoice + "&custom=" + custom
                + "&ipn_url=" + callbackUrl + "&timeout=" + timeout;
    }

    @Override
    
    public ResponseWrapper<CreateTransactionResponse> parseResult(int statusCode, String content) throws IOException {
        log.debug("parsing CreateTransactionResponse:  "+ content + ", statusCode: " + statusCode);
        ResponseWrapper<CreateTransactionResponse> wrapper = parseJson(content,
                new TypeReference<ResponseWrapper<CreateTransactionResponse>>() {
                });
        return wrapper;
    }

    @NonNull
    public double getAmount() {
        return this.amount;
    }

    @NonNull
    public String getCurrencyPrice() {
        return this.currencyPrice;
    }

    @NonNull
    public String getCurrencyTransfer() {
        return this.currencyTransfer;
    }

    public String getAddress() {
        return this.address;
    }

    public String getBuyerEmail() {
        return this.buyerEmail;
    }

    public String getBuyerName() {
        return this.buyerName;
    }

    public String getItemName() {
        return this.itemName;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public String getInvoice() {
        return this.invoice;
    }

    public String getCustom() {
        return this.custom;
    }

    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public void setAmount(@NonNull double amount) {
        this.amount = amount;
    }

    public void setCurrencyPrice(@NonNull String currencyPrice) {
        this.currencyPrice = currencyPrice;
    }

    public void setCurrencyTransfer(@NonNull String currencyTransfer) {
        this.currencyTransfer = currencyTransfer;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CoinPaymentsCreateTransactionRequest)) return false;
        final CoinPaymentsCreateTransactionRequest other = (CoinPaymentsCreateTransactionRequest) o;
        if (!other.canEqual((Object) this)) return false;
        if (Double.compare(this.getAmount(), other.getAmount()) != 0) return false;
        final Object this$currencyPrice = this.getCurrencyPrice();
        final Object other$currencyPrice = other.getCurrencyPrice();
        if (this$currencyPrice == null ? other$currencyPrice != null : !this$currencyPrice.equals(other$currencyPrice))
            return false;
        final Object this$currencyTransfer = this.getCurrencyTransfer();
        final Object other$currencyTransfer = other.getCurrencyTransfer();
        if (this$currencyTransfer == null ? other$currencyTransfer != null : !this$currencyTransfer.equals(other$currencyTransfer))
            return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        final Object this$buyerEmail = this.getBuyerEmail();
        final Object other$buyerEmail = other.getBuyerEmail();
        if (this$buyerEmail == null ? other$buyerEmail != null : !this$buyerEmail.equals(other$buyerEmail))
            return false;
        final Object this$buyerName = this.getBuyerName();
        final Object other$buyerName = other.getBuyerName();
        if (this$buyerName == null ? other$buyerName != null : !this$buyerName.equals(other$buyerName)) return false;
        final Object this$itemName = this.getItemName();
        final Object other$itemName = other.getItemName();
        if (this$itemName == null ? other$itemName != null : !this$itemName.equals(other$itemName)) return false;
        final Object this$itemCode = this.getItemCode();
        final Object other$itemCode = other.getItemCode();
        if (this$itemCode == null ? other$itemCode != null : !this$itemCode.equals(other$itemCode)) return false;
        final Object this$invoice = this.getInvoice();
        final Object other$invoice = other.getInvoice();
        if (this$invoice == null ? other$invoice != null : !this$invoice.equals(other$invoice)) return false;
        final Object this$custom = this.getCustom();
        final Object other$custom = other.getCustom();
        if (this$custom == null ? other$custom != null : !this$custom.equals(other$custom)) return false;
        final Object this$callbackUrl = this.getCallbackUrl();
        final Object other$callbackUrl = other.getCallbackUrl();
        if (this$callbackUrl == null ? other$callbackUrl != null : !this$callbackUrl.equals(other$callbackUrl))
            return false;
        if (this.getTimeout() != other.getTimeout()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CoinPaymentsCreateTransactionRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $amount = Double.doubleToLongBits(this.getAmount());
        result = result * PRIME + (int) ($amount >>> 32 ^ $amount);
        final Object $currencyPrice = this.getCurrencyPrice();
        result = result * PRIME + ($currencyPrice == null ? 43 : $currencyPrice.hashCode());
        final Object $currencyTransfer = this.getCurrencyTransfer();
        result = result * PRIME + ($currencyTransfer == null ? 43 : $currencyTransfer.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $buyerEmail = this.getBuyerEmail();
        result = result * PRIME + ($buyerEmail == null ? 43 : $buyerEmail.hashCode());
        final Object $buyerName = this.getBuyerName();
        result = result * PRIME + ($buyerName == null ? 43 : $buyerName.hashCode());
        final Object $itemName = this.getItemName();
        result = result * PRIME + ($itemName == null ? 43 : $itemName.hashCode());
        final Object $itemCode = this.getItemCode();
        result = result * PRIME + ($itemCode == null ? 43 : $itemCode.hashCode());
        final Object $invoice = this.getInvoice();
        result = result * PRIME + ($invoice == null ? 43 : $invoice.hashCode());
        final Object $custom = this.getCustom();
        result = result * PRIME + ($custom == null ? 43 : $custom.hashCode());
        final Object $callbackUrl = this.getCallbackUrl();
        result = result * PRIME + ($callbackUrl == null ? 43 : $callbackUrl.hashCode());
        final long $timeout = this.getTimeout();
        result = result * PRIME + (int) ($timeout >>> 32 ^ $timeout);
        return result;
    }

    public String toString() {
        return "CoinPaymentsCreateTransactionRequest(amount=" + this.getAmount() + ", currencyPrice=" + this.getCurrencyPrice() + ", currencyTransfer=" + this.getCurrencyTransfer() + ", address=" + this.getAddress() + ", buyerEmail=" + this.getBuyerEmail() + ", buyerName=" + this.getBuyerName() + ", itemName=" + this.getItemName() + ", itemCode=" + this.getItemCode() + ", invoice=" + this.getInvoice() + ", custom=" + this.getCustom() + ", callbackUrl=" + this.getCallbackUrl() + ", timeout=" + this.getTimeout() + ")";
    }

    public static class CoinPaymentsCreateTransactionRequestBuilder {
        private double amount;
        private String currencyPrice;
        private String currencyTransfer;
        private String address$value;
        private boolean address$set;
        private String buyerEmail$value;
        private boolean buyerEmail$set;
        private String buyerName$value;
        private boolean buyerName$set;
        private String itemName$value;
        private boolean itemName$set;
        private String itemCode$value;
        private boolean itemCode$set;
        private String invoice$value;
        private boolean invoice$set;
        private String custom$value;
        private boolean custom$set;
        private String callbackUrl$value;
        private boolean callbackUrl$set;
        private long timeout$value;
        private boolean timeout$set;

        CoinPaymentsCreateTransactionRequestBuilder() {
        }

        public CoinPaymentsCreateTransactionRequestBuilder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public CoinPaymentsCreateTransactionRequestBuilder currencyPrice(String currencyPrice) {
            this.currencyPrice = currencyPrice;
            return this;
        }

        public CoinPaymentsCreateTransactionRequestBuilder currencyTransfer(String currencyTransfer) {
            this.currencyTransfer = currencyTransfer;
            return this;
        }

        public CoinPaymentsCreateTransactionRequestBuilder address(String address) {
            this.address$value = address;
            this.address$set = true;
            return this;
        }

        public CoinPaymentsCreateTransactionRequestBuilder buyerEmail(String buyerEmail) {
            this.buyerEmail$value = buyerEmail;
            this.buyerEmail$set = true;
            return this;
        }

        public CoinPaymentsCreateTransactionRequestBuilder buyerName(String buyerName) {
            this.buyerName$value = buyerName;
            this.buyerName$set = true;
            return this;
        }

        public CoinPaymentsCreateTransactionRequestBuilder itemName(String itemName) {
            this.itemName$value = itemName;
            this.itemName$set = true;
            return this;
        }

        public CoinPaymentsCreateTransactionRequestBuilder itemCode(String itemCode) {
            this.itemCode$value = itemCode;
            this.itemCode$set = true;
            return this;
        }

        public CoinPaymentsCreateTransactionRequestBuilder invoice(String invoice) {
            this.invoice$value = invoice;
            this.invoice$set = true;
            return this;
        }

        public CoinPaymentsCreateTransactionRequestBuilder custom(String custom) {
            this.custom$value = custom;
            this.custom$set = true;
            return this;
        }

        public CoinPaymentsCreateTransactionRequestBuilder callbackUrl(String callbackUrl) {
            this.callbackUrl$value = callbackUrl;
            this.callbackUrl$set = true;
            return this;
        }

        public CoinPaymentsCreateTransactionRequestBuilder timeout(long timeout) {
            this.timeout$value = timeout;
            this.timeout$set = true;
            return this;
        }

        public CoinPaymentsCreateTransactionRequest build() {
            String address$value = this.address$value;
            if (!this.address$set) {
                address$value = CoinPaymentsCreateTransactionRequest.$default$address();
            }
            String buyerEmail$value = this.buyerEmail$value;
            if (!this.buyerEmail$set) {
                buyerEmail$value = CoinPaymentsCreateTransactionRequest.$default$buyerEmail();
            }
            String buyerName$value = this.buyerName$value;
            if (!this.buyerName$set) {
                buyerName$value = CoinPaymentsCreateTransactionRequest.$default$buyerName();
            }
            String itemName$value = this.itemName$value;
            if (!this.itemName$set) {
                itemName$value = CoinPaymentsCreateTransactionRequest.$default$itemName();
            }
            String itemCode$value = this.itemCode$value;
            if (!this.itemCode$set) {
                itemCode$value = CoinPaymentsCreateTransactionRequest.$default$itemCode();
            }
            String invoice$value = this.invoice$value;
            if (!this.invoice$set) {
                invoice$value = CoinPaymentsCreateTransactionRequest.$default$invoice();
            }
            String custom$value = this.custom$value;
            if (!this.custom$set) {
                custom$value = CoinPaymentsCreateTransactionRequest.$default$custom();
            }
            String callbackUrl$value = this.callbackUrl$value;
            if (!this.callbackUrl$set) {
                callbackUrl$value = CoinPaymentsCreateTransactionRequest.$default$callbackUrl();
            }
            long timeout$value = this.timeout$value;
            if (!this.timeout$set) {
                timeout$value = CoinPaymentsCreateTransactionRequest.$default$timeout();
            }
            return new CoinPaymentsCreateTransactionRequest(amount, currencyPrice, currencyTransfer, address$value, buyerEmail$value, buyerName$value, itemName$value, itemCode$value, invoice$value, custom$value, callbackUrl$value, timeout$value);
        }

        public String toString() {
            return "CoinPaymentsCreateTransactionRequest.CoinPaymentsCreateTransactionRequestBuilder(amount=" + this.amount + ", currencyPrice=" + this.currencyPrice + ", currencyTransfer=" + this.currencyTransfer + ", address$value=" + this.address$value + ", buyerEmail$value=" + this.buyerEmail$value + ", buyerName$value=" + this.buyerName$value + ", itemName$value=" + this.itemName$value + ", itemCode$value=" + this.itemCode$value + ", invoice$value=" + this.invoice$value + ", custom$value=" + this.custom$value + ", callbackUrl$value=" + this.callbackUrl$value + ", timeout$value=" + this.timeout$value + ")";
        }
    }
}
