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
import org.brunocvcunha.coinpayments.model.BalanceResponse;
import org.brunocvcunha.coinpayments.model.ResponseWrapper;
import org.brunocvcunha.coinpayments.requests.base.CoinPaymentsPostRequest;

import java.io.IOException;
import java.util.Map;

/**
 * Balance Request
 * 
 * @author Bruno Candido Volpato da Cunha
 *
 */
public class CoinPaymentsBalancesRequest extends CoinPaymentsPostRequest<ResponseWrapper<Map<String, BalanceResponse>>> {
	
	private boolean ifAll = false;

	CoinPaymentsBalancesRequest(boolean ifAll) {
		this.ifAll = ifAll;
	}

	public static CoinPaymentsBalancesRequestBuilder builder() {
		return new CoinPaymentsBalancesRequestBuilder();
	}

	@Override
	public String getUrl() {
		return "";
	}
	
    
    @Override
    
    public String getPayload() {
        return "cmd=balances&all=" + (ifAll ? "1" : "0");
    }

	@Override
	public ResponseWrapper<Map<String, BalanceResponse>> parseResult(int resultCode, String content) throws IOException {
		System.out.println(content);
        ResponseWrapper<Map<String, BalanceResponse>> wrapper = parseJson(content, new TypeReference<ResponseWrapper<Map<String, BalanceResponse>>>() {});
        return wrapper;
	}

	public boolean isIfAll() {
		return this.ifAll;
	}

	public void setIfAll(boolean ifAll) {
		this.ifAll = ifAll;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof CoinPaymentsBalancesRequest)) return false;
		final CoinPaymentsBalancesRequest other = (CoinPaymentsBalancesRequest) o;
		if (!other.canEqual((Object) this)) return false;
		if (this.isIfAll() != other.isIfAll()) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof CoinPaymentsBalancesRequest;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + (this.isIfAll() ? 79 : 97);
		return result;
	}

	public String toString() {
		return "CoinPaymentsBalancesRequest(ifAll=" + this.isIfAll() + ")";
	}

	public static class CoinPaymentsBalancesRequestBuilder {
		private boolean ifAll;

		CoinPaymentsBalancesRequestBuilder() {
		}

		public CoinPaymentsBalancesRequestBuilder ifAll(boolean ifAll) {
			this.ifAll = ifAll;
			return this;
		}

		public CoinPaymentsBalancesRequest build() {
			return new CoinPaymentsBalancesRequest(ifAll);
		}

		public String toString() {
			return "CoinPaymentsBalancesRequest.CoinPaymentsBalancesRequestBuilder(ifAll=" + this.ifAll + ")";
		}
	}
}
