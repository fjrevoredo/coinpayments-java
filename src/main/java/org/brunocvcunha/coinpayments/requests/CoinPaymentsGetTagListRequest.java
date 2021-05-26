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
import org.brunocvcunha.coinpayments.model.GetTagListResponse;
import org.brunocvcunha.coinpayments.model.ResponseWrapper;
import org.brunocvcunha.coinpayments.requests.base.CoinPaymentsPostRequest;

import java.io.IOException;
import java.util.List;

public class CoinPaymentsGetTagListRequest extends CoinPaymentsPostRequest<ResponseWrapper<List<GetTagListResponse>>> {

	public CoinPaymentsGetTagListRequest() {
	}

	public static CoinPaymentsGetTagListRequestBuilder builder() {
		return new CoinPaymentsGetTagListRequestBuilder();
	}

	@Override
	public String getUrl() {
		return "";
	}
	
    @Override
    public String getPayload() {
        return "cmd=get_pbn_list";
    }

	@Override
	public ResponseWrapper<List<GetTagListResponse>> parseResult (int resultCode, String content ) throws IOException {
        ResponseWrapper<List<GetTagListResponse>> wrapper = parseJson(content, new TypeReference<ResponseWrapper<List<GetTagListResponse>>>() {});
        return wrapper;		
	}

	public static class CoinPaymentsGetTagListRequestBuilder {
		CoinPaymentsGetTagListRequestBuilder() {
		}

		public CoinPaymentsGetTagListRequest build() {
			return new CoinPaymentsGetTagListRequest();
		}

		public String toString() {
			return "CoinPaymentsGetTagListRequest.CoinPaymentsGetTagListRequestBuilder()";
		}
	}
}
