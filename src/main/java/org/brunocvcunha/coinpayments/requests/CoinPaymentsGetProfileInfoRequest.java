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
import org.brunocvcunha.coinpayments.model.GetProfileInfoResponse;
import org.brunocvcunha.coinpayments.model.ResponseWrapper;
import org.brunocvcunha.coinpayments.requests.base.CoinPaymentsPostRequest;

import java.io.IOException;

public class CoinPaymentsGetProfileInfoRequest extends CoinPaymentsPostRequest<ResponseWrapper<GetProfileInfoResponse>> {
	
	private String pbntag;

	public CoinPaymentsGetProfileInfoRequest() {
	}

	public CoinPaymentsGetProfileInfoRequest(String pbntag) {
		this.pbntag = pbntag;
	}

	public static CoinPaymentsGetProfileInfoRequestBuilder builder() {
		return new CoinPaymentsGetProfileInfoRequestBuilder();
	}

	@Override
	public String getUrl() {
		return "";
	}
	
    @Override
    public String getPayload() {
        return "cmd=get_pbn_info&pbntag=" + pbntag;
    }

	@Override
	public ResponseWrapper<GetProfileInfoResponse> parseResult(int resultCode, String content) throws IOException {
        ResponseWrapper<GetProfileInfoResponse> wrapper = parseJson(content, new TypeReference<ResponseWrapper<GetProfileInfoResponse>>() {});
        return wrapper;
	}

	public String getPbntag() {
		return this.pbntag;
	}

	public void setPbntag(String pbntag) {
		this.pbntag = pbntag;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof CoinPaymentsGetProfileInfoRequest)) return false;
		final CoinPaymentsGetProfileInfoRequest other = (CoinPaymentsGetProfileInfoRequest) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$pbntag = this.getPbntag();
		final Object other$pbntag = other.getPbntag();
		if (this$pbntag == null ? other$pbntag != null : !this$pbntag.equals(other$pbntag)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof CoinPaymentsGetProfileInfoRequest;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $pbntag = this.getPbntag();
		result = result * PRIME + ($pbntag == null ? 43 : $pbntag.hashCode());
		return result;
	}

	public String toString() {
		return "CoinPaymentsGetProfileInfoRequest(pbntag=" + this.getPbntag() + ")";
	}

	public static class CoinPaymentsGetProfileInfoRequestBuilder {
		private String pbntag;

		CoinPaymentsGetProfileInfoRequestBuilder() {
		}

		public CoinPaymentsGetProfileInfoRequestBuilder pbntag(String pbntag) {
			this.pbntag = pbntag;
			return this;
		}

		public CoinPaymentsGetProfileInfoRequest build() {
			return new CoinPaymentsGetProfileInfoRequest(pbntag);
		}

		public String toString() {
			return "CoinPaymentsGetProfileInfoRequest.CoinPaymentsGetProfileInfoRequestBuilder(pbntag=" + this.pbntag + ")";
		}
	}
}
