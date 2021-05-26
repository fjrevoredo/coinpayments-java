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

/**
 * Search Result
 * 
 * @author Bruno Candido Volpato da Cunha
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateTransactionResponse {
    private double amount;
    private String address;

    @JsonProperty("txn_id")
    private String transactionId;

    @JsonProperty("confirms_needed")
    private int confirmsNeeded;

    private long timeout;
    @JsonProperty("status_url")
    private String statusUrl;

    @JsonProperty("qrcode_url")
    private String qrcodeUrl;

    @JsonProperty("dest_tag")
    private String destinationTag;

    public CreateTransactionResponse() {
    }

    public double getAmount() {
        return this.amount;
    }

    public String getAddress() {
        return this.address;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public int getConfirmsNeeded() {
        return this.confirmsNeeded;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public String getStatusUrl() {
        return this.statusUrl;
    }

    public String getQrcodeUrl() {
        return this.qrcodeUrl;
    }

    public String getDestinationTag() {
        return this.destinationTag;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("txn_id")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @JsonProperty("confirms_needed")
    public void setConfirmsNeeded(int confirmsNeeded) {
        this.confirmsNeeded = confirmsNeeded;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    @JsonProperty("status_url")
    public void setStatusUrl(String statusUrl) {
        this.statusUrl = statusUrl;
    }

    @JsonProperty("qrcode_url")
    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
    }

    @JsonProperty("dest_tag")
    public void setDestinationTag(String destinationTag) {
        this.destinationTag = destinationTag;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CreateTransactionResponse)) return false;
        final CreateTransactionResponse other = (CreateTransactionResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (Double.compare(this.getAmount(), other.getAmount()) != 0) return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        final Object this$transactionId = this.getTransactionId();
        final Object other$transactionId = other.getTransactionId();
        if (this$transactionId == null ? other$transactionId != null : !this$transactionId.equals(other$transactionId))
            return false;
        if (this.getConfirmsNeeded() != other.getConfirmsNeeded()) return false;
        if (this.getTimeout() != other.getTimeout()) return false;
        final Object this$statusUrl = this.getStatusUrl();
        final Object other$statusUrl = other.getStatusUrl();
        if (this$statusUrl == null ? other$statusUrl != null : !this$statusUrl.equals(other$statusUrl)) return false;
        final Object this$qrcodeUrl = this.getQrcodeUrl();
        final Object other$qrcodeUrl = other.getQrcodeUrl();
        if (this$qrcodeUrl == null ? other$qrcodeUrl != null : !this$qrcodeUrl.equals(other$qrcodeUrl)) return false;
        final Object this$destinationTag = this.getDestinationTag();
        final Object other$destinationTag = other.getDestinationTag();
        if (this$destinationTag == null ? other$destinationTag != null : !this$destinationTag.equals(other$destinationTag))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CreateTransactionResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $amount = Double.doubleToLongBits(this.getAmount());
        result = result * PRIME + (int) ($amount >>> 32 ^ $amount);
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $transactionId = this.getTransactionId();
        result = result * PRIME + ($transactionId == null ? 43 : $transactionId.hashCode());
        result = result * PRIME + this.getConfirmsNeeded();
        final long $timeout = this.getTimeout();
        result = result * PRIME + (int) ($timeout >>> 32 ^ $timeout);
        final Object $statusUrl = this.getStatusUrl();
        result = result * PRIME + ($statusUrl == null ? 43 : $statusUrl.hashCode());
        final Object $qrcodeUrl = this.getQrcodeUrl();
        result = result * PRIME + ($qrcodeUrl == null ? 43 : $qrcodeUrl.hashCode());
        final Object $destinationTag = this.getDestinationTag();
        result = result * PRIME + ($destinationTag == null ? 43 : $destinationTag.hashCode());
        return result;
    }

    public String toString() {
        return "CreateTransactionResponse(amount=" + this.getAmount() + ", address=" + this.getAddress() + ", transactionId=" + this.getTransactionId() + ", confirmsNeeded=" + this.getConfirmsNeeded() + ", timeout=" + this.getTimeout() + ", statusUrl=" + this.getStatusUrl() + ", qrcodeUrl=" + this.getQrcodeUrl() + ", destinationTag=" + this.getDestinationTag() + ")";
    }
}
