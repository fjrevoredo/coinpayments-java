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

@JsonIgnoreProperties(ignoreUnknown = true)
public class WithdrawalInfoResponse {
    
    @JsonProperty("time_created")
    private String timeCreated;
    
    private String status;
    
    @JsonProperty("status_text")
    private String statusText;
    
    private String coin;
    
    private BigInteger amount;
    
    private double amountf;
    
    @JsonProperty("send_address")
    private String sendAddress;

    @JsonProperty("send_txid")
    private String sendTxid;

    public WithdrawalInfoResponse() {
    }

    public String getTimeCreated() {
        return this.timeCreated;
    }

    public String getStatus() {
        return this.status;
    }

    public String getStatusText() {
        return this.statusText;
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

    public String getSendAddress() {
        return this.sendAddress;
    }

    public String getSendTxid() {
        return this.sendTxid;
    }

    @JsonProperty("time_created")
    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("status_text")
    public void setStatusText(String statusText) {
        this.statusText = statusText;
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

    @JsonProperty("send_address")
    public void setSendAddress(String sendAddress) {
        this.sendAddress = sendAddress;
    }

    @JsonProperty("send_txid")
    public void setSendTxid(String sendTxid) {
        this.sendTxid = sendTxid;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WithdrawalInfoResponse)) return false;
        final WithdrawalInfoResponse other = (WithdrawalInfoResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$timeCreated = this.getTimeCreated();
        final Object other$timeCreated = other.getTimeCreated();
        if (this$timeCreated == null ? other$timeCreated != null : !this$timeCreated.equals(other$timeCreated))
            return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$statusText = this.getStatusText();
        final Object other$statusText = other.getStatusText();
        if (this$statusText == null ? other$statusText != null : !this$statusText.equals(other$statusText))
            return false;
        final Object this$coin = this.getCoin();
        final Object other$coin = other.getCoin();
        if (this$coin == null ? other$coin != null : !this$coin.equals(other$coin)) return false;
        final Object this$amount = this.getAmount();
        final Object other$amount = other.getAmount();
        if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
        if (Double.compare(this.getAmountf(), other.getAmountf()) != 0) return false;
        final Object this$sendAddress = this.getSendAddress();
        final Object other$sendAddress = other.getSendAddress();
        if (this$sendAddress == null ? other$sendAddress != null : !this$sendAddress.equals(other$sendAddress))
            return false;
        final Object this$sendTxid = this.getSendTxid();
        final Object other$sendTxid = other.getSendTxid();
        if (this$sendTxid == null ? other$sendTxid != null : !this$sendTxid.equals(other$sendTxid)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WithdrawalInfoResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $timeCreated = this.getTimeCreated();
        result = result * PRIME + ($timeCreated == null ? 43 : $timeCreated.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $statusText = this.getStatusText();
        result = result * PRIME + ($statusText == null ? 43 : $statusText.hashCode());
        final Object $coin = this.getCoin();
        result = result * PRIME + ($coin == null ? 43 : $coin.hashCode());
        final Object $amount = this.getAmount();
        result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
        final long $amountf = Double.doubleToLongBits(this.getAmountf());
        result = result * PRIME + (int) ($amountf >>> 32 ^ $amountf);
        final Object $sendAddress = this.getSendAddress();
        result = result * PRIME + ($sendAddress == null ? 43 : $sendAddress.hashCode());
        final Object $sendTxid = this.getSendTxid();
        result = result * PRIME + ($sendTxid == null ? 43 : $sendTxid.hashCode());
        return result;
    }

    public String toString() {
        return "WithdrawalInfoResponse(timeCreated=" + this.getTimeCreated() + ", status=" + this.getStatus() + ", statusText=" + this.getStatusText() + ", coin=" + this.getCoin() + ", amount=" + this.getAmount() + ", amountf=" + this.getAmountf() + ", sendAddress=" + this.getSendAddress() + ", sendTxid=" + this.getSendTxid() + ")";
    }
}
