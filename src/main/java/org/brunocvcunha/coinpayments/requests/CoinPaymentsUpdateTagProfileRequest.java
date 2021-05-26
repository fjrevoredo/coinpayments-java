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
import org.brunocvcunha.coinpayments.model.ResponseWrapper;
import org.brunocvcunha.coinpayments.model.UpdateTagProfileResponse;
import org.brunocvcunha.coinpayments.requests.base.CoinPaymentsPostRequest;

import java.io.IOException;
import java.util.List;

public class CoinPaymentsUpdateTagProfileRequest extends CoinPaymentsPostRequest<ResponseWrapper<List<UpdateTagProfileResponse>>> {
	
	@NonNull
	private String tagId;
	
	private String name = "";
	
	private String email = "";
	
	private String url = "";
	
	private String image = "";

	public CoinPaymentsUpdateTagProfileRequest(@NonNull String tagId) {
		this.tagId = tagId;
	}

	public CoinPaymentsUpdateTagProfileRequest(@NonNull String tagId, String name, String email, String url, String image) {
		this.tagId = tagId;
		this.name = name;
		this.email = email;
		this.url = url;
		this.image = image;
	}

	private static String $default$name() {
		return "";
	}

	private static String $default$email() {
		return "";
	}

	private static String $default$url() {
		return "";
	}

	private static String $default$image() {
		return "";
	}

	public static CoinPaymentsUpdateTagProfileRequestBuilder builder() {
		return new CoinPaymentsUpdateTagProfileRequestBuilder();
	}

	@Override
	public String getUrl() {
		return "";
	}
	
    @Override
    public String getPayload() {
    	String p = !name.isEmpty() ? "&name=" + name : "";
    	p = !email.isEmpty() ? "&email=" + email : p;
    	p = !url.isEmpty() ? "&url=" + url : p;
    	p = !image.isEmpty() ? "&image=" + image : p;
        return "cmd=update_pbn_tag" + "&tagid=" + tagId + p;
    }

	@Override
	public ResponseWrapper<List<UpdateTagProfileResponse>> parseResult (int resultCode, String content ) throws IOException {
        ResponseWrapper<List<UpdateTagProfileResponse>> wrapper = parseJson(content, new TypeReference<ResponseWrapper<List<UpdateTagProfileResponse>>>() {});
        return wrapper;
	}

	@NonNull
	public String getTagId() {
		return this.tagId;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public String getImage() {
		return this.image;
	}

	public void setTagId(@NonNull String tagId) {
		this.tagId = tagId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof CoinPaymentsUpdateTagProfileRequest)) return false;
		final CoinPaymentsUpdateTagProfileRequest other = (CoinPaymentsUpdateTagProfileRequest) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$tagId = this.getTagId();
		final Object other$tagId = other.getTagId();
		if (this$tagId == null ? other$tagId != null : !this$tagId.equals(other$tagId)) return false;
		final Object this$name = this.getName();
		final Object other$name = other.getName();
		if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
		final Object this$email = this.getEmail();
		final Object other$email = other.getEmail();
		if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
		final Object this$url = this.getUrl();
		final Object other$url = other.getUrl();
		if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
		final Object this$image = this.getImage();
		final Object other$image = other.getImage();
		if (this$image == null ? other$image != null : !this$image.equals(other$image)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof CoinPaymentsUpdateTagProfileRequest;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $tagId = this.getTagId();
		result = result * PRIME + ($tagId == null ? 43 : $tagId.hashCode());
		final Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		final Object $email = this.getEmail();
		result = result * PRIME + ($email == null ? 43 : $email.hashCode());
		final Object $url = this.getUrl();
		result = result * PRIME + ($url == null ? 43 : $url.hashCode());
		final Object $image = this.getImage();
		result = result * PRIME + ($image == null ? 43 : $image.hashCode());
		return result;
	}

	public String toString() {
		return "CoinPaymentsUpdateTagProfileRequest(tagId=" + this.getTagId() + ", name=" + this.getName() + ", email=" + this.getEmail() + ", url=" + this.getUrl() + ", image=" + this.getImage() + ")";
	}

	public static class CoinPaymentsUpdateTagProfileRequestBuilder {
		private String tagId;
		private String name$value;
		private boolean name$set;
		private String email$value;
		private boolean email$set;
		private String url$value;
		private boolean url$set;
		private String image$value;
		private boolean image$set;

		CoinPaymentsUpdateTagProfileRequestBuilder() {
		}

		public CoinPaymentsUpdateTagProfileRequestBuilder tagId(String tagId) {
			this.tagId = tagId;
			return this;
		}

		public CoinPaymentsUpdateTagProfileRequestBuilder name(String name) {
			this.name$value = name;
			this.name$set = true;
			return this;
		}

		public CoinPaymentsUpdateTagProfileRequestBuilder email(String email) {
			this.email$value = email;
			this.email$set = true;
			return this;
		}

		public CoinPaymentsUpdateTagProfileRequestBuilder url(String url) {
			this.url$value = url;
			this.url$set = true;
			return this;
		}

		public CoinPaymentsUpdateTagProfileRequestBuilder image(String image) {
			this.image$value = image;
			this.image$set = true;
			return this;
		}

		public CoinPaymentsUpdateTagProfileRequest build() {
			String name$value = this.name$value;
			if (!this.name$set) {
				name$value = CoinPaymentsUpdateTagProfileRequest.$default$name();
			}
			String email$value = this.email$value;
			if (!this.email$set) {
				email$value = CoinPaymentsUpdateTagProfileRequest.$default$email();
			}
			String url$value = this.url$value;
			if (!this.url$set) {
				url$value = CoinPaymentsUpdateTagProfileRequest.$default$url();
			}
			String image$value = this.image$value;
			if (!this.image$set) {
				image$value = CoinPaymentsUpdateTagProfileRequest.$default$image();
			}
			return new CoinPaymentsUpdateTagProfileRequest(tagId, name$value, email$value, url$value, image$value);
		}

		public String toString() {
			return "CoinPaymentsUpdateTagProfileRequest.CoinPaymentsUpdateTagProfileRequestBuilder(tagId=" + this.tagId + ", name$value=" + this.name$value + ", email$value=" + this.email$value + ", url$value=" + this.url$value + ", image$value=" + this.image$value + ")";
		}
	}
}
