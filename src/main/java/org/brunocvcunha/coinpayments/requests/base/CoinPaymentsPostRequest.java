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
package org.brunocvcunha.coinpayments.requests.base;

import org.apache.commons.codec.digest.HmacUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.brunocvcunha.coinpayments.CoinPaymentsConstants;

import java.io.IOException;

/**
 * 
 * @author brunovolpato
 *
 */
public abstract class CoinPaymentsPostRequest<T> extends CoinPaymentsRequest<T> {

    private static final Logger log = Logger.getLogger(CoinPaymentsPostRequest.class);

    public CoinPaymentsPostRequest() {
    }

    @Override
    public String getMethod() {
        return "POST";
    }
    
    @Override
    public T execute() throws ClientProtocolException, IOException {
        HttpPost post = new HttpPost(CoinPaymentsConstants.API_URL + getUrl());
        post.addHeader("Connection", "close");
        post.addHeader("Accept", "*/*");
        post.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        post.addHeader("Cookie2", "$Version=1");
        post.addHeader("Accept-Language", "en-US");
        
        String payload = getPayload();
        log.info("Base Payload: " + payload);
        
        payload += "&version=1&key=" + api.getPublicKey() + "&format=json";
        
        String hmac = HmacUtils.hmacSha512Hex(api.getPrivateKey(), payload);
        log.info("HMAC: " + hmac);
        
        post.addHeader("HMAC", hmac);
        
        log.info("Final Payload: " + payload);
        post.setEntity(new StringEntity(payload));
        
        HttpResponse response = api.getClient().execute(post);
        api.setLastResponse(response);
        
        int resultCode = response.getStatusLine().getStatusCode();
        String content = EntityUtils.toString(response.getEntity());
        
        post.releaseConnection();

        return parseResult(resultCode, content);
    }

    public boolean isSigned() {
        return true;
    }

    public String toString() {
        return "CoinPaymentsPostRequest()";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CoinPaymentsPostRequest)) return false;
        final CoinPaymentsPostRequest<?> other = (CoinPaymentsPostRequest<?>) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CoinPaymentsPostRequest;
    }

    public int hashCode() {
        int result = super.hashCode();
        return result;
    }
}
