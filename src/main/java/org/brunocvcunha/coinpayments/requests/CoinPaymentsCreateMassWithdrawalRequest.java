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
import java.util.List;
import java.util.Map;

public class CoinPaymentsCreateMassWithdrawalRequest extends CoinPaymentsPostRequest<ResponseWrapper<Map<String, CreateWithdrawalResponse>>> {

    @NonNull
    private List<Map<String, String>> wd;

    public CoinPaymentsCreateMassWithdrawalRequest(@NonNull List<Map<String, String>> wd) {
        this.wd = wd;
    }

    public static CoinPaymentsCreateMassWithdrawalRequestBuilder builder() {
        return new CoinPaymentsCreateMassWithdrawalRequestBuilder();
    }

    @Override
    public String getUrl () {
        return "";
    }

    @Override
    public String getPayload () {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < wd.size(); i++){
            Map<String, String> entries = wd.get(i);
            for(Map.Entry<String, String> entry : entries.entrySet()) {
                sb.append("&wd[wd").append(i).append("][").append(entry.getKey()).append("]").append("=").append(entry.getValue());
            }
        }
        return "cmd=create_mass_withdrawal" + sb.toString();
    }

    @Override
    public ResponseWrapper<Map<String, CreateWithdrawalResponse>> parseResult ( int resultCode, String content ) throws IOException {
    	ResponseWrapper<Map<String, CreateWithdrawalResponse>> wrapper = parseJson( content, new TypeReference<ResponseWrapper<Map<String, CreateWithdrawalResponse>>>() {});
        return wrapper;
    }

    @NonNull
    public List<Map<String, String>> getWd() {
        return this.wd;
    }

    public void setWd(@NonNull List<Map<String, String>> wd) {
        this.wd = wd;
    }

    public String toString() {
        return "CoinPaymentsCreateMassWithdrawalRequest(wd=" + this.getWd() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CoinPaymentsCreateMassWithdrawalRequest))
            return false;
        final CoinPaymentsCreateMassWithdrawalRequest other = (CoinPaymentsCreateMassWithdrawalRequest) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$wd = this.getWd();
        final Object other$wd = other.getWd();
        if (this$wd == null ? other$wd != null : !this$wd.equals(other$wd)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CoinPaymentsCreateMassWithdrawalRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $wd = this.getWd();
        result = result * PRIME + ($wd == null ? 43 : $wd.hashCode());
        return result;
    }

    public static class CoinPaymentsCreateMassWithdrawalRequestBuilder {
        private List<Map<String, String>> wd;

        CoinPaymentsCreateMassWithdrawalRequestBuilder() {
        }

        public CoinPaymentsCreateMassWithdrawalRequestBuilder wd(List<Map<String, String>> wd) {
            this.wd = wd;
            return this;
        }

        public CoinPaymentsCreateMassWithdrawalRequest build() {
            return new CoinPaymentsCreateMassWithdrawalRequest(wd);
        }

        public String toString() {
            return "CoinPaymentsCreateMassWithdrawalRequest.CoinPaymentsCreateMassWithdrawalRequestBuilder(wd=" + this.wd + ")";
        }
    }
}
