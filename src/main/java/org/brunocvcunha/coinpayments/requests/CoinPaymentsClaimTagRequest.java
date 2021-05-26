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
import org.brunocvcunha.coinpayments.model.ClaimTagResponse;
import org.brunocvcunha.coinpayments.model.ResponseWrapper;
import org.brunocvcunha.coinpayments.requests.base.CoinPaymentsPostRequest;

import java.io.IOException;
import java.util.List;

public class CoinPaymentsClaimTagRequest extends CoinPaymentsPostRequest<ResponseWrapper<List<ClaimTagResponse>>> {
	
	@NonNull
	private String tagId;
	
	@NonNull
	private String name;

	public CoinPaymentsClaimTagRequest(@NonNull String tagId, @NonNull String name) {
		this.tagId = tagId;
		this.name = name;
	}

	public static CoinPaymentsClaimTagRequestBuilder builder() {
		return new CoinPaymentsClaimTagRequestBuilder();
	}


	@Override
	public String getUrl() {
		return "";
	}
	
    @Override
    public String getPayload() {
        return "cmd=claim_pbn_tag&tagid=" + tagId + "&name=" + name;
    }

	@Override
	public ResponseWrapper<List<ClaimTagResponse>> parseResult(int resultCode, String content) throws IOException {
        ResponseWrapper<List<ClaimTagResponse>> wrapper = parseJson(content, new TypeReference<ResponseWrapper<List<ClaimTagResponse>>>() {});
        return wrapper;
	}

	@NonNull
	public String getTagId() {
		return this.tagId;
	}

	@NonNull
	public String getName() {
		return this.name;
	}

	public void setTagId(@NonNull String tagId) {
		this.tagId = tagId;
	}

	public void setName(@NonNull String name) {
		this.name = name;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof CoinPaymentsClaimTagRequest)) return false;
		final CoinPaymentsClaimTagRequest other = (CoinPaymentsClaimTagRequest) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$tagId = this.getTagId();
		final Object other$tagId = other.getTagId();
		if (this$tagId == null ? other$tagId != null : !this$tagId.equals(other$tagId)) return false;
		final Object this$name = this.getName();
		final Object other$name = other.getName();
		if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof CoinPaymentsClaimTagRequest;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $tagId = this.getTagId();
		result = result * PRIME + ($tagId == null ? 43 : $tagId.hashCode());
		final Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		return result;
	}

	public String toString() {
		return "CoinPaymentsClaimTagRequest(tagId=" + this.getTagId() + ", name=" + this.getName() + ")";
	}

	public static class CoinPaymentsClaimTagRequestBuilder {
		private String tagId;
		private String name;

		CoinPaymentsClaimTagRequestBuilder() {
		}

		public CoinPaymentsClaimTagRequestBuilder tagId(String tagId) {
			this.tagId = tagId;
			return this;
		}

		public CoinPaymentsClaimTagRequestBuilder name(String name) {
			this.name = name;
			return this;
		}

		public CoinPaymentsClaimTagRequest build() {
			return new CoinPaymentsClaimTagRequest(tagId, name);
		}

		public String toString() {
			return "CoinPaymentsClaimTagRequest.CoinPaymentsClaimTagRequestBuilder(tagId=" + this.tagId + ", name=" + this.name + ")";
		}
	}
}
