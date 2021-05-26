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
import org.brunocvcunha.coinpayments.model.GetConversionInfoResponse;
import org.brunocvcunha.coinpayments.model.ResponseWrapper;
import org.brunocvcunha.coinpayments.requests.base.CoinPaymentsPostRequest;

import java.io.IOException;

public class CoinPaymentsGetConversionInfoRequest
		extends CoinPaymentsPostRequest<ResponseWrapper<GetConversionInfoResponse>> {
	
	private String id;

	public CoinPaymentsGetConversionInfoRequest() {
	}

	public CoinPaymentsGetConversionInfoRequest(String id) {
		this.id = id;
	}

	public static CoinPaymentsGetConversionInfoRequestBuilder builder() {
		return new CoinPaymentsGetConversionInfoRequestBuilder();
	}

	@Override
	public String getUrl() {
		return "";
	}

    @Override
    public String getPayload() {
        return "cmd=get_conversion_info&id=" + id;
    }

	@Override
	public ResponseWrapper<GetConversionInfoResponse> parseResult(int resultCode, String content) throws IOException {
        ResponseWrapper<GetConversionInfoResponse> wrapper = parseJson(content,
                new TypeReference<ResponseWrapper<GetConversionInfoResponse>>() {
                });
        return wrapper;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof CoinPaymentsGetConversionInfoRequest)) return false;
		final CoinPaymentsGetConversionInfoRequest other = (CoinPaymentsGetConversionInfoRequest) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$id = this.getId();
		final Object other$id = other.getId();
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof CoinPaymentsGetConversionInfoRequest;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $id = this.getId();
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		return result;
	}

	public String toString() {
		return "CoinPaymentsGetConversionInfoRequest(id=" + this.getId() + ")";
	}

	public static class CoinPaymentsGetConversionInfoRequestBuilder {
		private String id;

		CoinPaymentsGetConversionInfoRequestBuilder() {
		}

		public CoinPaymentsGetConversionInfoRequestBuilder id(String id) {
			this.id = id;
			return this;
		}

		public CoinPaymentsGetConversionInfoRequest build() {
			return new CoinPaymentsGetConversionInfoRequest(id);
		}

		public String toString() {
			return "CoinPaymentsGetConversionInfoRequest.CoinPaymentsGetConversionInfoRequestBuilder(id=" + this.id + ")";
		}
	}
}
