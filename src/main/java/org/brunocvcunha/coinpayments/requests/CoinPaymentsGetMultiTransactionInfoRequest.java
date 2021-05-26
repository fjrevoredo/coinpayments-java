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
import java.util.Arrays;
import java.util.List;

public class CoinPaymentsGetMultiTransactionInfoRequest extends CoinPaymentsPostRequest<ResponseWrapper<List<TransactionDetailsResponse>>> {
	
	private List<String> txid = Arrays.asList(new String[25]);

    public CoinPaymentsGetMultiTransactionInfoRequest() {
    }

    public CoinPaymentsGetMultiTransactionInfoRequest(List<String> txid) {
        this.txid = txid;
    }

    public static CoinPaymentsGetMultiTransactionInfoRequestBuilder builder() {
        return new CoinPaymentsGetMultiTransactionInfoRequestBuilder();
    }

    @Override
	public String getUrl() {
        return "";
	}
	
    @Override
    
    public String getPayload() {
    	String p = String.join("|", txid);
        return "cmd=get_tx_info_multi&txid=" + p + "&full=1";
    }

	@Override
	public ResponseWrapper<List<TransactionDetailsResponse>> parseResult(int resultCode, String content) throws IOException {
        ResponseWrapper<List<TransactionDetailsResponse>> wrapper = parseJson(content,
                new TypeReference<ResponseWrapper<List<TransactionDetailsResponse>>>() {
                });
        return wrapper;
	}

    public List<String> getTxid() {
        return this.txid;
    }

    public void setTxid(List<String> txid) {
        this.txid = txid;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CoinPaymentsGetMultiTransactionInfoRequest))
            return false;
        final CoinPaymentsGetMultiTransactionInfoRequest other = (CoinPaymentsGetMultiTransactionInfoRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$txid = this.getTxid();
        final Object other$txid = other.getTxid();
        if (this$txid == null ? other$txid != null : !this$txid.equals(other$txid)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CoinPaymentsGetMultiTransactionInfoRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $txid = this.getTxid();
        result = result * PRIME + ($txid == null ? 43 : $txid.hashCode());
        return result;
    }

    public String toString() {
        return "CoinPaymentsGetMultiTransactionInfoRequest(txid=" + this.getTxid() + ")";
    }

    public static class CoinPaymentsGetMultiTransactionInfoRequestBuilder {
        private List<String> txid;

        CoinPaymentsGetMultiTransactionInfoRequestBuilder() {
        }

        public CoinPaymentsGetMultiTransactionInfoRequestBuilder txid(List<String> txid) {
            this.txid = txid;
            return this;
        }

        public CoinPaymentsGetMultiTransactionInfoRequest build() {
            return new CoinPaymentsGetMultiTransactionInfoRequest(txid);
        }

        public String toString() {
            return "CoinPaymentsGetMultiTransactionInfoRequest.CoinPaymentsGetMultiTransactionInfoRequestBuilder(txid=" + this.txid + ")";
        }
    }
}
