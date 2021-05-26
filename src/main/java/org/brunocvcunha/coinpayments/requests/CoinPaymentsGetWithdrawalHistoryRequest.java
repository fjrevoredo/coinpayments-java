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
import org.brunocvcunha.coinpayments.model.WithdrawalHistoryResponse;
import org.brunocvcunha.coinpayments.requests.base.CoinPaymentsPostRequest;

import java.io.IOException;
import java.util.Map;

public class CoinPaymentsGetWithdrawalHistoryRequest extends CoinPaymentsPostRequest<ResponseWrapper<Map<String, WithdrawalHistoryResponse>>>  {
	
	private int limit = 25;
	
	private int start = 0;
	
	private long newer = 0;

	CoinPaymentsGetWithdrawalHistoryRequest(int limit, int start, long newer) {
		this.limit = limit;
		this.start = start;
		this.newer = newer;
	}

	private static int $default$limit() {
		return 25;
	}

	private static int $default$start() {
		return 0;
	}

	private static long $default$newer() {
		return 0;
	}

	public static CoinPaymentsGetWithdrawalHistoryRequestBuilder builder() {
		return new CoinPaymentsGetWithdrawalHistoryRequestBuilder();
	}

	@Override
	public String getUrl() {
		return "";
	}
	
	@Override
    public String getPayload() {
        return "cmd=get_withdrawal_history" + "&limit=" + limit + "&start=" + start + "&newer=" + newer ;
    }

	@Override
	public ResponseWrapper<Map<String, WithdrawalHistoryResponse>> parseResult (int resultCode, String content ) throws IOException {
        ResponseWrapper<Map<String, WithdrawalHistoryResponse>> wrapper = parseJson(content, new TypeReference<ResponseWrapper<Map<String, WithdrawalHistoryResponse>>>() {});
        return wrapper;
	}

	public static class CoinPaymentsGetWithdrawalHistoryRequestBuilder {
		private int limit$value;
		private boolean limit$set;
		private int start$value;
		private boolean start$set;
		private long newer$value;
		private boolean newer$set;

		CoinPaymentsGetWithdrawalHistoryRequestBuilder() {
		}

		public CoinPaymentsGetWithdrawalHistoryRequestBuilder limit(int limit) {
			this.limit$value = limit;
			this.limit$set = true;
			return this;
		}

		public CoinPaymentsGetWithdrawalHistoryRequestBuilder start(int start) {
			this.start$value = start;
			this.start$set = true;
			return this;
		}

		public CoinPaymentsGetWithdrawalHistoryRequestBuilder newer(long newer) {
			this.newer$value = newer;
			this.newer$set = true;
			return this;
		}

		public CoinPaymentsGetWithdrawalHistoryRequest build() {
			int limit$value = this.limit$value;
			if (!this.limit$set) {
				limit$value = CoinPaymentsGetWithdrawalHistoryRequest.$default$limit();
			}
			int start$value = this.start$value;
			if (!this.start$set) {
				start$value = CoinPaymentsGetWithdrawalHistoryRequest.$default$start();
			}
			long newer$value = this.newer$value;
			if (!this.newer$set) {
				newer$value = CoinPaymentsGetWithdrawalHistoryRequest.$default$newer();
			}
			return new CoinPaymentsGetWithdrawalHistoryRequest(limit$value, start$value, newer$value);
		}

		public String toString() {
			return "CoinPaymentsGetWithdrawalHistoryRequest.CoinPaymentsGetWithdrawalHistoryRequestBuilder(limit$value=" + this.limit$value + ", start$value=" + this.start$value + ", newer$value=" + this.newer$value + ")";
		}
	}
}
