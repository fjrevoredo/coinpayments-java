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
package org.brunocvcunha.coinpayments;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.brunocvcunha.coinpayments.requests.base.CoinPaymentsRequest;

import java.io.IOException;

/**
 * 
 * CoinPayments API
 * 
 * @author Bruno Candido Volpato da Cunha
 *
 */
public class CoinPayments {

    private static final Logger log = Logger.getLogger(CoinPayments.class);

    static {
        log.setLevel( Level.WARN );
    }

    private String publicKey;
    
    private String privateKey;

    protected HttpResponse lastResponse;

    protected CloseableHttpClient client;

    CoinPayments(String publicKey, String privateKey, HttpResponse lastResponse, CloseableHttpClient client) {
        this.publicKey = publicKey;
        this.privateKey = privateKey;
        this.lastResponse = lastResponse;
        this.client = client;
    }

    public static CoinPaymentsBuilder builder() {
        return new CoinPaymentsBuilder();
    }

    /**
     * Send request to endpoint
     * 
     * @param request
     *            Request object
     * @return success flag
     * @throws IOException
     * @throws ClientProtocolException
     */
    public <T> T sendRequest(CoinPaymentsRequest<T> request) throws ClientProtocolException, IOException {

        log.info("Sending request: " + request.getClass().getName());

        request.setApi(this);
        T response = request.execute();

        log.info("Result for " + request.getClass().getName() + ": " + response);

        return response;
    }


    public String getPublicKey() {
        return this.publicKey;
    }

    public String getPrivateKey() {
        return this.privateKey;
    }

    public HttpResponse getLastResponse() {
        return this.lastResponse;
    }

    public CloseableHttpClient getClient() {
        return this.client;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public void setLastResponse(HttpResponse lastResponse) {
        this.lastResponse = lastResponse;
    }

    public void setClient(CloseableHttpClient client) {
        this.client = client;
    }

    public static class CoinPaymentsBuilder {
        private String publicKey;
        private String privateKey;
        private HttpResponse lastResponse;
        private CloseableHttpClient client;

        CoinPaymentsBuilder() {
        }

        public CoinPaymentsBuilder publicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        public CoinPaymentsBuilder privateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        public CoinPaymentsBuilder lastResponse(HttpResponse lastResponse) {
            this.lastResponse = lastResponse;
            return this;
        }

        public CoinPaymentsBuilder client(CloseableHttpClient client) {
            this.client = client;
            return this;
        }

        public CoinPayments build() {
            return new CoinPayments(publicKey, privateKey, lastResponse, client);
        }

        public String toString() {
            return "CoinPayments.CoinPaymentsBuilder(publicKey=" + this.publicKey + ", privateKey=" + this.privateKey + ", lastResponse=" + this.lastResponse + ", client=" + this.client + ")";
        }
    }
}