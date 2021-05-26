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

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetTagListResponse {
	
    private String tagid;

    private String pbntag;

    @JsonProperty("time_expires")
    private long timeExpires;

    public GetTagListResponse() {
    }

    public String getTagid() {
        return this.tagid;
    }

    public String getPbntag() {
        return this.pbntag;
    }

    public long getTimeExpires() {
        return this.timeExpires;
    }

    public void setTagid(String tagid) {
        this.tagid = tagid;
    }

    public void setPbntag(String pbntag) {
        this.pbntag = pbntag;
    }

    @JsonProperty("time_expires")
    public void setTimeExpires(long timeExpires) {
        this.timeExpires = timeExpires;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GetTagListResponse)) return false;
        final GetTagListResponse other = (GetTagListResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$tagid = this.getTagid();
        final Object other$tagid = other.getTagid();
        if (this$tagid == null ? other$tagid != null : !this$tagid.equals(other$tagid)) return false;
        final Object this$pbntag = this.getPbntag();
        final Object other$pbntag = other.getPbntag();
        if (this$pbntag == null ? other$pbntag != null : !this$pbntag.equals(other$pbntag)) return false;
        if (this.getTimeExpires() != other.getTimeExpires()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GetTagListResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $tagid = this.getTagid();
        result = result * PRIME + ($tagid == null ? 43 : $tagid.hashCode());
        final Object $pbntag = this.getPbntag();
        result = result * PRIME + ($pbntag == null ? 43 : $pbntag.hashCode());
        final long $timeExpires = this.getTimeExpires();
        result = result * PRIME + (int) ($timeExpires >>> 32 ^ $timeExpires);
        return result;
    }

    public String toString() {
        return "GetTagListResponse(tagid=" + this.getTagid() + ", pbntag=" + this.getPbntag() + ", timeExpires=" + this.getTimeExpires() + ")";
    }
}
