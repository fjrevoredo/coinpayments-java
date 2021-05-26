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
import org.brunocvcunha.coinpayments.model.BasicInfoResponse;
import org.brunocvcunha.coinpayments.model.ResponseWrapper;
import org.brunocvcunha.coinpayments.requests.base.CoinPaymentsPostRequest;

import java.io.IOException;

/**
 * Search GIFs Request
 * 
 * @author Bruno Candido Volpato da Cunha
 *
 */
public class CoinPaymentsBasicAccountInfoRequest extends CoinPaymentsPostRequest<ResponseWrapper<BasicInfoResponse>> {

    public CoinPaymentsBasicAccountInfoRequest() {
    }

    public static CoinPaymentsBasicAccountInfoRequestBuilder builder() {
        return new CoinPaymentsBasicAccountInfoRequestBuilder();
    }

    @Override
    public String getUrl() {
        return "";
    }
    
    @Override
    
    public String getPayload() {
        return "cmd=get_basic_info";
    }


    @Override
    
    public ResponseWrapper<BasicInfoResponse> parseResult(int statusCode, String content) throws IOException {
        ResponseWrapper<BasicInfoResponse> wrapper = parseJson(content, new TypeReference<ResponseWrapper<BasicInfoResponse>>() {});

        //ResponseWrapper<BasicInfoResponse> wrapper = parseJson(content, ResponseWrapper.class);
        //wrapper.setResult(parseJson(new ObjectMapper().writeValueAsString(wrapper.getResult()), BasicInfoResponse.class)); //?j
        return wrapper;
    }

    public static class CoinPaymentsBasicAccountInfoRequestBuilder {
        CoinPaymentsBasicAccountInfoRequestBuilder() {
        }

        public CoinPaymentsBasicAccountInfoRequest build() {
            return new CoinPaymentsBasicAccountInfoRequest();
        }

        public String toString() {
            return "CoinPaymentsBasicAccountInfoRequest.CoinPaymentsBasicAccountInfoRequestBuilder()";
        }
    }
}
