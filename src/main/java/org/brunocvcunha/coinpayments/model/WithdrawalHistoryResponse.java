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
public class WithdrawalHistoryResponse extends WithdrawalInfoResponse {

    @JsonProperty("send_dest_tag")
    private String sendDestTag;

    public WithdrawalHistoryResponse() {
    }

    public String getSendDestTag() {
        return this.sendDestTag;
    }

    @JsonProperty("send_dest_tag")
    public void setSendDestTag(String sendDestTag) {
        this.sendDestTag = sendDestTag;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WithdrawalHistoryResponse)) return false;
        final WithdrawalHistoryResponse other = (WithdrawalHistoryResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$sendDestTag = this.getSendDestTag();
        final Object other$sendDestTag = other.getSendDestTag();
        if (this$sendDestTag == null ? other$sendDestTag != null : !this$sendDestTag.equals(other$sendDestTag))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WithdrawalHistoryResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $sendDestTag = this.getSendDestTag();
        result = result * PRIME + ($sendDestTag == null ? 43 : $sendDestTag.hashCode());
        return result;
    }

    public String toString() {
        return "WithdrawalHistoryResponse(sendDestTag=" + this.getSendDestTag() + ")";
    }
}
