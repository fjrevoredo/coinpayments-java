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

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateTagProfileResponse {

    public UpdateTagProfileResponse() {
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UpdateTagProfileResponse)) return false;
        final UpdateTagProfileResponse other = (UpdateTagProfileResponse) o;
        if (!other.canEqual((Object) this)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UpdateTagProfileResponse;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }

    public String toString() {
        return "UpdateTagProfileResponse()";
    }
}
