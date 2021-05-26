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
import org.brunocvcunha.coinpayments.model.CreateWithdrawalResponse;
import org.brunocvcunha.coinpayments.model.ResponseWrapper;
import org.brunocvcunha.coinpayments.requests.base.CoinPaymentsPostRequest;

import java.io.IOException;

public class CoinPaymentsCreateWithdrawalRequest extends CoinPaymentsPostRequest<ResponseWrapper<CreateWithdrawalResponse>> {

    @NonNull
    private double amount;

    private boolean addTransactionFee = false;

    @NonNull
    private String currency;

    private String withdrawCurrency = "";

    @NonNull
    private String address;

    private String destinationTag = "";
    private String ipnURL = "";
    private boolean autoConfirm = true;
    private String note = "";

    public CoinPaymentsCreateWithdrawalRequest(@NonNull double amount, @NonNull String currency, @NonNull String address) {
        this.amount = amount;
        this.currency = currency;
        this.address = address;
    }

    public CoinPaymentsCreateWithdrawalRequest(@NonNull double amount, boolean addTransactionFee, @NonNull String currency, String withdrawCurrency, @NonNull String address, String destinationTag, String ipnURL, boolean autoConfirm, String note) {
        this.amount = amount;
        this.addTransactionFee = addTransactionFee;
        this.currency = currency;
        this.withdrawCurrency = withdrawCurrency;
        this.address = address;
        this.destinationTag = destinationTag;
        this.ipnURL = ipnURL;
        this.autoConfirm = autoConfirm;
        this.note = note;
    }

    private static boolean $default$addTransactionFee() {
        return false;
    }

    private static String $default$withdrawCurrency() {
        return "";
    }

    private static String $default$destinationTag() {
        return "";
    }

    private static String $default$ipnURL() {
        return "";
    }

    private static boolean $default$autoConfirm() {
        return true;
    }

    private static String $default$note() {
        return "";
    }

    public static CoinPaymentsCreateWithdrawalRequestBuilder builder() {
        return new CoinPaymentsCreateWithdrawalRequestBuilder();
    }

    @Override
    public String getUrl () {
        return "";
    }

    @Override
    public String getPayload () {
        return "cmd=create_withdrawal" + "&amount=" + amount + "&add_tx_fee=" + ( addTransactionFee ? 1 : 0 ) + "&currency=" + currency + "&currency2=" + withdrawCurrency + "&address=" + address + "&dest_tag=" + destinationTag + "&ipn_url=" + ipnURL + "&auto_confirm=" + ( autoConfirm ? 1 : 0 ) + "&note=" + note;
    }

    @Override
    public ResponseWrapper<CreateWithdrawalResponse> parseResult ( int resultCode, String content ) throws IOException {
        ResponseWrapper<CreateWithdrawalResponse> wrapper = parseJson( content, new TypeReference<ResponseWrapper<CreateWithdrawalResponse>>() {} );
        return wrapper;
    }

    @NonNull
    public double getAmount() {
        return this.amount;
    }

    public boolean isAddTransactionFee() {
        return this.addTransactionFee;
    }

    @NonNull
    public String getCurrency() {
        return this.currency;
    }

    public String getWithdrawCurrency() {
        return this.withdrawCurrency;
    }

    @NonNull
    public String getAddress() {
        return this.address;
    }

    public String getDestinationTag() {
        return this.destinationTag;
    }

    public String getIpnURL() {
        return this.ipnURL;
    }

    public boolean isAutoConfirm() {
        return this.autoConfirm;
    }

    public String getNote() {
        return this.note;
    }

    public void setAmount(@NonNull double amount) {
        this.amount = amount;
    }

    public void setAddTransactionFee(boolean addTransactionFee) {
        this.addTransactionFee = addTransactionFee;
    }

    public void setCurrency(@NonNull String currency) {
        this.currency = currency;
    }

    public void setWithdrawCurrency(String withdrawCurrency) {
        this.withdrawCurrency = withdrawCurrency;
    }

    public void setAddress(@NonNull String address) {
        this.address = address;
    }

    public void setDestinationTag(String destinationTag) {
        this.destinationTag = destinationTag;
    }

    public void setIpnURL(String ipnURL) {
        this.ipnURL = ipnURL;
    }

    public void setAutoConfirm(boolean autoConfirm) {
        this.autoConfirm = autoConfirm;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CoinPaymentsCreateWithdrawalRequest)) return false;
        final CoinPaymentsCreateWithdrawalRequest other = (CoinPaymentsCreateWithdrawalRequest) o;
        if (!other.canEqual((Object) this)) return false;
        if (Double.compare(this.getAmount(), other.getAmount()) != 0) return false;
        if (this.isAddTransactionFee() != other.isAddTransactionFee()) return false;
        final Object this$currency = this.getCurrency();
        final Object other$currency = other.getCurrency();
        if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) return false;
        final Object this$withdrawCurrency = this.getWithdrawCurrency();
        final Object other$withdrawCurrency = other.getWithdrawCurrency();
        if (this$withdrawCurrency == null ? other$withdrawCurrency != null : !this$withdrawCurrency.equals(other$withdrawCurrency))
            return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        final Object this$destinationTag = this.getDestinationTag();
        final Object other$destinationTag = other.getDestinationTag();
        if (this$destinationTag == null ? other$destinationTag != null : !this$destinationTag.equals(other$destinationTag))
            return false;
        final Object this$ipnURL = this.getIpnURL();
        final Object other$ipnURL = other.getIpnURL();
        if (this$ipnURL == null ? other$ipnURL != null : !this$ipnURL.equals(other$ipnURL)) return false;
        if (this.isAutoConfirm() != other.isAutoConfirm()) return false;
        final Object this$note = this.getNote();
        final Object other$note = other.getNote();
        if (this$note == null ? other$note != null : !this$note.equals(other$note)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CoinPaymentsCreateWithdrawalRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $amount = Double.doubleToLongBits(this.getAmount());
        result = result * PRIME + (int) ($amount >>> 32 ^ $amount);
        result = result * PRIME + (this.isAddTransactionFee() ? 79 : 97);
        final Object $currency = this.getCurrency();
        result = result * PRIME + ($currency == null ? 43 : $currency.hashCode());
        final Object $withdrawCurrency = this.getWithdrawCurrency();
        result = result * PRIME + ($withdrawCurrency == null ? 43 : $withdrawCurrency.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $destinationTag = this.getDestinationTag();
        result = result * PRIME + ($destinationTag == null ? 43 : $destinationTag.hashCode());
        final Object $ipnURL = this.getIpnURL();
        result = result * PRIME + ($ipnURL == null ? 43 : $ipnURL.hashCode());
        result = result * PRIME + (this.isAutoConfirm() ? 79 : 97);
        final Object $note = this.getNote();
        result = result * PRIME + ($note == null ? 43 : $note.hashCode());
        return result;
    }

    public String toString() {
        return "CoinPaymentsCreateWithdrawalRequest(amount=" + this.getAmount() + ", addTransactionFee=" + this.isAddTransactionFee() + ", currency=" + this.getCurrency() + ", withdrawCurrency=" + this.getWithdrawCurrency() + ", address=" + this.getAddress() + ", destinationTag=" + this.getDestinationTag() + ", ipnURL=" + this.getIpnURL() + ", autoConfirm=" + this.isAutoConfirm() + ", note=" + this.getNote() + ")";
    }

    public static class CoinPaymentsCreateWithdrawalRequestBuilder {
        private double amount;
        private boolean addTransactionFee$value;
        private boolean addTransactionFee$set;
        private String currency;
        private String withdrawCurrency$value;
        private boolean withdrawCurrency$set;
        private String address;
        private String destinationTag$value;
        private boolean destinationTag$set;
        private String ipnURL$value;
        private boolean ipnURL$set;
        private boolean autoConfirm$value;
        private boolean autoConfirm$set;
        private String note$value;
        private boolean note$set;

        CoinPaymentsCreateWithdrawalRequestBuilder() {
        }

        public CoinPaymentsCreateWithdrawalRequestBuilder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public CoinPaymentsCreateWithdrawalRequestBuilder addTransactionFee(boolean addTransactionFee) {
            this.addTransactionFee$value = addTransactionFee;
            this.addTransactionFee$set = true;
            return this;
        }

        public CoinPaymentsCreateWithdrawalRequestBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public CoinPaymentsCreateWithdrawalRequestBuilder withdrawCurrency(String withdrawCurrency) {
            this.withdrawCurrency$value = withdrawCurrency;
            this.withdrawCurrency$set = true;
            return this;
        }

        public CoinPaymentsCreateWithdrawalRequestBuilder address(String address) {
            this.address = address;
            return this;
        }

        public CoinPaymentsCreateWithdrawalRequestBuilder destinationTag(String destinationTag) {
            this.destinationTag$value = destinationTag;
            this.destinationTag$set = true;
            return this;
        }

        public CoinPaymentsCreateWithdrawalRequestBuilder ipnURL(String ipnURL) {
            this.ipnURL$value = ipnURL;
            this.ipnURL$set = true;
            return this;
        }

        public CoinPaymentsCreateWithdrawalRequestBuilder autoConfirm(boolean autoConfirm) {
            this.autoConfirm$value = autoConfirm;
            this.autoConfirm$set = true;
            return this;
        }

        public CoinPaymentsCreateWithdrawalRequestBuilder note(String note) {
            this.note$value = note;
            this.note$set = true;
            return this;
        }

        public CoinPaymentsCreateWithdrawalRequest build() {
            boolean addTransactionFee$value = this.addTransactionFee$value;
            if (!this.addTransactionFee$set) {
                addTransactionFee$value = CoinPaymentsCreateWithdrawalRequest.$default$addTransactionFee();
            }
            String withdrawCurrency$value = this.withdrawCurrency$value;
            if (!this.withdrawCurrency$set) {
                withdrawCurrency$value = CoinPaymentsCreateWithdrawalRequest.$default$withdrawCurrency();
            }
            String destinationTag$value = this.destinationTag$value;
            if (!this.destinationTag$set) {
                destinationTag$value = CoinPaymentsCreateWithdrawalRequest.$default$destinationTag();
            }
            String ipnURL$value = this.ipnURL$value;
            if (!this.ipnURL$set) {
                ipnURL$value = CoinPaymentsCreateWithdrawalRequest.$default$ipnURL();
            }
            boolean autoConfirm$value = this.autoConfirm$value;
            if (!this.autoConfirm$set) {
                autoConfirm$value = CoinPaymentsCreateWithdrawalRequest.$default$autoConfirm();
            }
            String note$value = this.note$value;
            if (!this.note$set) {
                note$value = CoinPaymentsCreateWithdrawalRequest.$default$note();
            }
            return new CoinPaymentsCreateWithdrawalRequest(amount, addTransactionFee$value, currency, withdrawCurrency$value, address, destinationTag$value, ipnURL$value, autoConfirm$value, note$value);
        }

        public String toString() {
            return "CoinPaymentsCreateWithdrawalRequest.CoinPaymentsCreateWithdrawalRequestBuilder(amount=" + this.amount + ", addTransactionFee$value=" + this.addTransactionFee$value + ", currency=" + this.currency + ", withdrawCurrency$value=" + this.withdrawCurrency$value + ", address=" + this.address + ", destinationTag$value=" + this.destinationTag$value + ", ipnURL$value=" + this.ipnURL$value + ", autoConfirm$value=" + this.autoConfirm$value + ", note$value=" + this.note$value + ")";
        }
    }
}
