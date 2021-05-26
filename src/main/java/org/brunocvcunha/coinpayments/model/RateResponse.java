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

import java.util.List;

/**
 * Search Result
 * 
 * @author Bruno Candido Volpato da Cunha
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RateResponse {
    private String name;
    
    @JsonProperty("is_fiat")
    private String fiat;
    
    @JsonProperty("rate_btc")
    private String rateBtc;
    
    @JsonProperty("last_update")
    private long lastUpdate;
    
    private int confirms;
    
    @JsonProperty("tx_fee")
    private double txFee;

    private boolean accepted;

    @JsonProperty("can_convert")
    private boolean canConvert;

    private String explorer;

    private List<String> capabilities;

    public RateResponse() {
    }

    public String getName() {
        return this.name;
    }

    public String getFiat() {
        return this.fiat;
    }

    public String getRateBtc() {
        return this.rateBtc;
    }

    public long getLastUpdate() {
        return this.lastUpdate;
    }

    public int getConfirms() {
        return this.confirms;
    }

    public double getTxFee() {
        return this.txFee;
    }

    public List<String> getCapabilities() {
        return this.capabilities;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("is_fiat")
    public void setFiat(String fiat) {
        this.fiat = fiat;
    }

    @JsonProperty("rate_btc")
    public void setRateBtc(String rateBtc) {
        this.rateBtc = rateBtc;
    }

    @JsonProperty("last_update")
    public void setLastUpdate(long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void setConfirms(int confirms) {
        this.confirms = confirms;
    }

    @JsonProperty("tx_fee")
    public void setTxFee(double txFee) {
        this.txFee = txFee;
    }

    public void setCapabilities(List<String> capabilities) {
        this.capabilities = capabilities;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public boolean isCanConvert() {
        return canConvert;
    }

    public void setCanConvert(boolean canConvert) {
        this.canConvert = canConvert;
    }

    public String getExplorer() {
        return explorer;
    }

    public void setExplorer(String explorer) {
        this.explorer = explorer;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RateResponse)) return false;
        final RateResponse other = (RateResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$fiat = this.getFiat();
        final Object other$fiat = other.getFiat();
        if (this$fiat == null ? other$fiat != null : !this$fiat.equals(other$fiat)) return false;
        final Object this$rateBtc = this.getRateBtc();
        final Object other$rateBtc = other.getRateBtc();
        if (this$rateBtc == null ? other$rateBtc != null : !this$rateBtc.equals(other$rateBtc)) return false;
        if (this.getLastUpdate() != other.getLastUpdate()) return false;
        if (this.getConfirms() != other.getConfirms()) return false;
        if (Double.compare(this.getTxFee(), other.getTxFee()) != 0) return false;
        final Object this$capabilities = this.getCapabilities();
        final Object other$capabilities = other.getCapabilities();
        if (this$capabilities == null ? other$capabilities != null : !this$capabilities.equals(other$capabilities))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RateResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $fiat = this.getFiat();
        result = result * PRIME + ($fiat == null ? 43 : $fiat.hashCode());
        final Object $rateBtc = this.getRateBtc();
        result = result * PRIME + ($rateBtc == null ? 43 : $rateBtc.hashCode());
        final long $lastUpdate = this.getLastUpdate();
        result = result * PRIME + (int) ($lastUpdate >>> 32 ^ $lastUpdate);
        result = result * PRIME + this.getConfirms();
        final long $txFee = Double.doubleToLongBits(this.getTxFee());
        result = result * PRIME + (int) ($txFee >>> 32 ^ $txFee);
        final Object $capabilities = this.getCapabilities();
        result = result * PRIME + ($capabilities == null ? 43 : $capabilities.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "RateResponse{" +
                "name='" + name + '\'' +
                ", fiat='" + fiat + '\'' +
                ", rateBtc='" + rateBtc + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", confirms=" + confirms +
                ", txFee=" + txFee +
                ", accepted=" + accepted +
                ", canConvert=" + canConvert +
                ", explorer='" + explorer + '\'' +
                ", capabilities=" + capabilities +
                '}';
    }
}