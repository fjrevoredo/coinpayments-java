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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.ClientProtocolException;
import org.apache.log4j.Logger;
import org.brunocvcunha.coinpayments.CoinPayments;
import org.brunocvcunha.inutils4j.MyStreamUtils;

import java.io.IOException;
import java.io.InputStream;

public abstract class CoinPaymentsRequest<T> {

    private static final Logger log = Logger.getLogger(CoinPaymentsRequest.class);
    @JsonIgnore
    protected CoinPayments api;

    public CoinPaymentsRequest(CoinPayments api) {
        this.api = api;
    }

    public CoinPaymentsRequest() {
    }

    /**
     * @return the url
     */
    public abstract String getUrl();

    /**
     * @return the method
     */
    public abstract String getMethod();

    /**
     * @return the payload
     */
    public String getPayload() {
        return null;
    }

    /**
     * @return the result
     * @throws IOException
     * @throws ClientProtocolException
     */
    public abstract T execute() throws ClientProtocolException, IOException;

    /**
     * Process response
     * 
     * @param resultCode
     *            Status Code
     * @param content
     *            Content
     */
    public abstract T parseResult(int resultCode, String content) throws IOException;

    /**
     * Parses Json into type
     * 
     * @param str
     *            Entity content
     * @param clazz
     *            Class
     * @return Result
     */
    
    public <U> U parseJson(String str, Class<U> clazz) throws IOException {
        log.trace("Reading " + clazz.getSimpleName() + " from " + str);
        return new ObjectMapper().readValue(str, clazz);
    }
    
    /**
     * Parses Json into type
     * 
     * @param str
     *            Entity content
     * @param type
     *            TypeReference
     * @return Result
     */
    public <U> U parseJson(String str, TypeReference<T> type) throws IOException {
        log.trace("Reading " + type.getType() + " from " + str);
        return new ObjectMapper().readValue(str, type);
    }

    /**
     * Parses Json into type
     * 
     * @param is
     *            Entity stream
     * @param clazz
     *            Class
     * @return Result
     */

    public T parseJson(InputStream is, Class<T> clazz) throws IOException {
        return this.parseJson(MyStreamUtils.readContent(is), clazz);
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CoinPaymentsRequest)) return false;
        final CoinPaymentsRequest<?> other = (CoinPaymentsRequest<?>) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$api = this.api;
        final Object other$api = other.api;
        if (this$api == null ? other$api != null : !this$api.equals(other$api)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CoinPaymentsRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $api = this.api;
        result = result * PRIME + ($api == null ? 43 : $api.hashCode());
        return result;
    }

    public CoinPayments getApi() {
        return this.api;
    }

    @JsonIgnore
    public void setApi(CoinPayments api) {
        this.api = api;
    }
}
