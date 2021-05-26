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

/**
 * 
 * @author Bruno Candido Volpato da Cunha
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetConversionInfoResponse {

    @JsonProperty("time_created")
    private long timeCreated;
    
    private int status;

    @JsonProperty("status_text")
    private String statusText;
    
    private String coin1;

    private String coin2;
    
    @JsonProperty("amount_sent")
    private BigInteger amountSent;
    
    @JsonProperty("amount_sentf")
    private double amountSentf;
    
    private BigInteger received;
    
    private double receivedf;

    public GetConversionInfoResponse() {
    }

    public long getTimeCreated() {
        return this.timeCreated;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStatusText() {
        return this.statusText;
    }

    public String getCoin1() {
        return this.coin1;
    }

    public String getCoin2() {
        return this.coin2;
    }

    public BigInteger getAmountSent() {
        return this.amountSent;
    }

    public double getAmountSentf() {
        return this.amountSentf;
    }

    public BigInteger getReceived() {
        return this.received;
    }

    public double getReceivedf() {
        return this.receivedf;
    }

    @JsonProperty("time_created")
    public void setTimeCreated(long timeCreated) {
        this.timeCreated = timeCreated;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @JsonProperty("status_text")
    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public void setCoin1(String coin1) {
        this.coin1 = coin1;
    }

    public void setCoin2(String coin2) {
        this.coin2 = coin2;
    }

    @JsonProperty("amount_sent")
    public void setAmountSent(BigInteger amountSent) {
        this.amountSent = amountSent;
    }

    @JsonProperty("amount_sentf")
    public void setAmountSentf(double amountSentf) {
        this.amountSentf = amountSentf;
    }

    public void setReceived(BigInteger received) {
        this.received = received;
    }

    public void setReceivedf(double receivedf) {
        this.receivedf = receivedf;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GetConversionInfoResponse)) return false;
        final GetConversionInfoResponse other = (GetConversionInfoResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getTimeCreated() != other.getTimeCreated()) return false;
        if (this.getStatus() != other.getStatus()) return false;
        final Object this$statusText = this.getStatusText();
        final Object other$statusText = other.getStatusText();
        if (this$statusText == null ? other$statusText != null : !this$statusText.equals(other$statusText))
            return false;
        final Object this$coin1 = this.getCoin1();
        final Object other$coin1 = other.getCoin1();
        if (this$coin1 == null ? other$coin1 != null : !this$coin1.equals(other$coin1)) return false;
        final Object this$coin2 = this.getCoin2();
        final Object other$coin2 = other.getCoin2();
        if (this$coin2 == null ? other$coin2 != null : !this$coin2.equals(other$coin2)) return false;
        final Object this$amountSent = this.getAmountSent();
        final Object other$amountSent = other.getAmountSent();
        if (this$amountSent == null ? other$amountSent != null : !this$amountSent.equals(other$amountSent))
            return false;
        if (Double.compare(this.getAmountSentf(), other.getAmountSentf()) != 0) return false;
        final Object this$received = this.getReceived();
        final Object other$received = other.getReceived();
        if (this$received == null ? other$received != null : !this$received.equals(other$received)) return false;
        if (Double.compare(this.getReceivedf(), other.getReceivedf()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GetConversionInfoResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $timeCreated = this.getTimeCreated();
        result = result * PRIME + (int) ($timeCreated >>> 32 ^ $timeCreated);
        result = result * PRIME + this.getStatus();
        final Object $statusText = this.getStatusText();
        result = result * PRIME + ($statusText == null ? 43 : $statusText.hashCode());
        final Object $coin1 = this.getCoin1();
        result = result * PRIME + ($coin1 == null ? 43 : $coin1.hashCode());
        final Object $coin2 = this.getCoin2();
        result = result * PRIME + ($coin2 == null ? 43 : $coin2.hashCode());
        final Object $amountSent = this.getAmountSent();
        result = result * PRIME + ($amountSent == null ? 43 : $amountSent.hashCode());
        final long $amountSentf = Double.doubleToLongBits(this.getAmountSentf());
        result = result * PRIME + (int) ($amountSentf >>> 32 ^ $amountSentf);
        final Object $received = this.getReceived();
        result = result * PRIME + ($received == null ? 43 : $received.hashCode());
        final long $receivedf = Double.doubleToLongBits(this.getReceivedf());
        result = result * PRIME + (int) ($receivedf >>> 32 ^ $receivedf);
        return result;
    }

    public String toString() {
        return "GetConversionInfoResponse(timeCreated=" + this.getTimeCreated() + ", status=" + this.getStatus() + ", statusText=" + this.getStatusText() + ", coin1=" + this.getCoin1() + ", coin2=" + this.getCoin2() + ", amountSent=" + this.getAmountSent() + ", amountSentf=" + this.getAmountSentf() + ", received=" + this.getReceived() + ", receivedf=" + this.getReceivedf() + ")";
    }
}