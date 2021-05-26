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
package org.brunocvcunha.coinpayments.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Search Result
 * 
 * @author Bruno Candido Volpato da Cunha
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseWrapper<T> {
    private String error;
    private T result;

    public ResponseWrapper() {
    }

    public String getError() {
        return this.error;
    }

    public T getResult() {
        return this.result;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ResponseWrapper)) return false;
        final ResponseWrapper<?> other = (ResponseWrapper<?>) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$result = this.getResult();
        final Object other$result = other.getResult();
        if (this$result == null ? other$result != null : !this$result.equals(other$result)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ResponseWrapper;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $result = this.getResult();
        result = result * PRIME + ($result == null ? 43 : $result.hashCode());
        return result;
    }

    public String toString() {
        return "ResponseWrapper(error=" + this.getError() + ", result=" + this.getResult() + ")";
    }
}