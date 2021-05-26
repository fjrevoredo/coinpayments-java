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
public class GetTransactionListResponse {

    @JsonProperty( value = "txid" )
    private String txId;

    @JsonProperty( value = "user_is" )
    private String userIs;

    public GetTransactionListResponse() {
    }

    public String getTxId() {
        return this.txId;
    }

    public String getUserIs() {
        return this.userIs;
    }

    @JsonProperty("txid")
    public void setTxId(String txId) {
        this.txId = txId;
    }

    @JsonProperty("user_is")
    public void setUserIs(String userIs) {
        this.userIs = userIs;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GetTransactionListResponse)) return false;
        final GetTransactionListResponse other = (GetTransactionListResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$txId = this.getTxId();
        final Object other$txId = other.getTxId();
        if (this$txId == null ? other$txId != null : !this$txId.equals(other$txId)) return false;
        final Object this$userIs = this.getUserIs();
        final Object other$userIs = other.getUserIs();
        if (this$userIs == null ? other$userIs != null : !this$userIs.equals(other$userIs)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GetTransactionListResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $txId = this.getTxId();
        result = result * PRIME + ($txId == null ? 43 : $txId.hashCode());
        final Object $userIs = this.getUserIs();
        result = result * PRIME + ($userIs == null ? 43 : $userIs.hashCode());
        return result;
    }

    public String toString() {
        return "GetTransactionListResponse(txId=" + this.getTxId() + ", userIs=" + this.getUserIs() + ")";
    }
}
