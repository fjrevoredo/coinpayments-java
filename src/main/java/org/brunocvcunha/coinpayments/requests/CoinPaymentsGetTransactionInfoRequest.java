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
import org.brunocvcunha.coinpayments.model.ResponseWrapper;
import org.brunocvcunha.coinpayments.model.TransactionDetailsResponse;
import org.brunocvcunha.coinpayments.requests.base.CoinPaymentsPostRequest;

import java.io.IOException;

/**
 * CoinPaymentsCreateTransactionRequest
 * 
 * @author Bruno Candido Volpato da Cunha
 *
 */
public class CoinPaymentsGetTransactionInfoRequest
        extends CoinPaymentsPostRequest<ResponseWrapper<TransactionDetailsResponse>> {

    private String txid;

    public CoinPaymentsGetTransactionInfoRequest() {
    }

    public CoinPaymentsGetTransactionInfoRequest(String txid) {
        this.txid = txid;
    }

    public static CoinPaymentsGetTransactionInfoRequestBuilder builder() {
        return new CoinPaymentsGetTransactionInfoRequestBuilder();
    }

    @Override
    public String getUrl() {
        return "";
    }

    @Override
    
    public String getPayload() {
        return "cmd=get_tx_info&txid=" + txid + "&full=1";
    }

    @Override
    
    public ResponseWrapper<TransactionDetailsResponse> parseResult(int statusCode, String content) throws IOException {
        ResponseWrapper<TransactionDetailsResponse> wrapper = parseJson(content,
                new TypeReference<ResponseWrapper<TransactionDetailsResponse>>() {
                });
        return wrapper;
    }

    public String getTxid() {
        return this.txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CoinPaymentsGetTransactionInfoRequest)) return false;
        final CoinPaymentsGetTransactionInfoRequest other = (CoinPaymentsGetTransactionInfoRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$txid = this.getTxid();
        final Object other$txid = other.getTxid();
        if (this$txid == null ? other$txid != null : !this$txid.equals(other$txid)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CoinPaymentsGetTransactionInfoRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $txid = this.getTxid();
        result = result * PRIME + ($txid == null ? 43 : $txid.hashCode());
        return result;
    }

    public String toString() {
        return "CoinPaymentsGetTransactionInfoRequest(txid=" + this.getTxid() + ")";
    }

    public static class CoinPaymentsGetTransactionInfoRequestBuilder {
        private String txid;

        CoinPaymentsGetTransactionInfoRequestBuilder() {
        }

        public CoinPaymentsGetTransactionInfoRequestBuilder txid(String txid) {
            this.txid = txid;
            return this;
        }

        public CoinPaymentsGetTransactionInfoRequest build() {
            return new CoinPaymentsGetTransactionInfoRequest(txid);
        }

        public String toString() {
            return "CoinPaymentsGetTransactionInfoRequest.CoinPaymentsGetTransactionInfoRequestBuilder(txid=" + this.txid + ")";
        }
    }
}
