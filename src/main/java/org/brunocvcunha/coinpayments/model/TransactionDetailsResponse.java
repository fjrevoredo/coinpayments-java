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
package org.brunocvcunha.coinpayments.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;
import java.util.Map;

/**
 * Search Result
 * 
 * @author Bruno Candido Volpato da Cunha
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionDetailsResponse {

    @JsonProperty("time_created")
    private long timeCreated;

    @JsonProperty("time_expires")
    private long timeExpires;
    
    private int status;

    @JsonProperty("status_text")
    private String statusText;
    
    private String type;
    
    private String coin;
    
    private BigInteger amount;
    
    private double amountf;
    
    private BigInteger received;
    
    private double receivedf;

    @JsonProperty("recv_confirms")
    private int confirmations;
    
    @JsonProperty("payment_address")
    private String paymentAddress;
    
    private Map<String, Object> checkout;

    public TransactionDetailsResponse() {
    }

    public long getTimeCreated() {
        return this.timeCreated;
    }

    public long getTimeExpires() {
        return this.timeExpires;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStatusText() {
        return this.statusText;
    }

    public String getType() {
        return this.type;
    }

    public String getCoin() {
        return this.coin;
    }

    public BigInteger getAmount() {
        return this.amount;
    }

    public double getAmountf() {
        return this.amountf;
    }

    public BigInteger getReceived() {
        return this.received;
    }

    public double getReceivedf() {
        return this.receivedf;
    }

    public int getConfirmations() {
        return this.confirmations;
    }

    public String getPaymentAddress() {
        return this.paymentAddress;
    }

    public Map<String, Object> getCheckout() {
        return this.checkout;
    }

    @JsonProperty("time_created")
    public void setTimeCreated(long timeCreated) {
        this.timeCreated = timeCreated;
    }

    @JsonProperty("time_expires")
    public void setTimeExpires(long timeExpires) {
        this.timeExpires = timeExpires;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @JsonProperty("status_text")
    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }

    public void setAmountf(double amountf) {
        this.amountf = amountf;
    }

    public void setReceived(BigInteger received) {
        this.received = received;
    }

    public void setReceivedf(double receivedf) {
        this.receivedf = receivedf;
    }

    @JsonProperty("recv_confirms")
    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    @JsonProperty("payment_address")
    public void setPaymentAddress(String paymentAddress) {
        this.paymentAddress = paymentAddress;
    }

    public void setCheckout(Map<String, Object> checkout) {
        this.checkout = checkout;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TransactionDetailsResponse)) return false;
        final TransactionDetailsResponse other = (TransactionDetailsResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getTimeCreated() != other.getTimeCreated()) return false;
        if (this.getTimeExpires() != other.getTimeExpires()) return false;
        if (this.getStatus() != other.getStatus()) return false;
        final Object this$statusText = this.getStatusText();
        final Object other$statusText = other.getStatusText();
        if (this$statusText == null ? other$statusText != null : !this$statusText.equals(other$statusText))
            return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$coin = this.getCoin();
        final Object other$coin = other.getCoin();
        if (this$coin == null ? other$coin != null : !this$coin.equals(other$coin)) return false;
        final Object this$amount = this.getAmount();
        final Object other$amount = other.getAmount();
        if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
        if (Double.compare(this.getAmountf(), other.getAmountf()) != 0) return false;
        final Object this$received = this.getReceived();
        final Object other$received = other.getReceived();
        if (this$received == null ? other$received != null : !this$received.equals(other$received)) return false;
        if (Double.compare(this.getReceivedf(), other.getReceivedf()) != 0) return false;
        if (this.getConfirmations() != other.getConfirmations()) return false;
        final Object this$paymentAddress = this.getPaymentAddress();
        final Object other$paymentAddress = other.getPaymentAddress();
        if (this$paymentAddress == null ? other$paymentAddress != null : !this$paymentAddress.equals(other$paymentAddress))
            return false;
        final Object this$checkout = this.getCheckout();
        final Object other$checkout = other.getCheckout();
        if (this$checkout == null ? other$checkout != null : !this$checkout.equals(other$checkout)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TransactionDetailsResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $timeCreated = this.getTimeCreated();
        result = result * PRIME + (int) ($timeCreated >>> 32 ^ $timeCreated);
        final long $timeExpires = this.getTimeExpires();
        result = result * PRIME + (int) ($timeExpires >>> 32 ^ $timeExpires);
        result = result * PRIME + this.getStatus();
        final Object $statusText = this.getStatusText();
        result = result * PRIME + ($statusText == null ? 43 : $statusText.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $coin = this.getCoin();
        result = result * PRIME + ($coin == null ? 43 : $coin.hashCode());
        final Object $amount = this.getAmount();
        result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
        final long $amountf = Double.doubleToLongBits(this.getAmountf());
        result = result * PRIME + (int) ($amountf >>> 32 ^ $amountf);
        final Object $received = this.getReceived();
        result = result * PRIME + ($received == null ? 43 : $received.hashCode());
        final long $receivedf = Double.doubleToLongBits(this.getReceivedf());
        result = result * PRIME + (int) ($receivedf >>> 32 ^ $receivedf);
        result = result * PRIME + this.getConfirmations();
        final Object $paymentAddress = this.getPaymentAddress();
        result = result * PRIME + ($paymentAddress == null ? 43 : $paymentAddress.hashCode());
        final Object $checkout = this.getCheckout();
        result = result * PRIME + ($checkout == null ? 43 : $checkout.hashCode());
        return result;
    }

    public String toString() {
        return "TransactionDetailsResponse(timeCreated=" + this.getTimeCreated() + ", timeExpires=" + this.getTimeExpires() + ", status=" + this.getStatus() + ", statusText=" + this.getStatusText() + ", type=" + this.getType() + ", coin=" + this.getCoin() + ", amount=" + this.getAmount() + ", amountf=" + this.getAmountf() + ", received=" + this.getReceived() + ", receivedf=" + this.getReceivedf() + ", confirmations=" + this.getConfirmations() + ", paymentAddress=" + this.getPaymentAddress() + ", checkout=" + this.getCheckout() + ")";
    }
}