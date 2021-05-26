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
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Search Result
 * 
 * @author Bruno Candido Volpato da Cunha
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BasicInfoResponse {
    private String username;
    
    @JsonProperty("merchant_id")
    private String merchantId;
    
    private String email;

    @JsonProperty("public_name")
    private String publicName;

    public BasicInfoResponse() {
    }

    public String getUsername() {
        return this.username;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPublicName() {
        return this.publicName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("merchant_id")
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("public_name")
    public void setPublicName(String publicName) {
        this.publicName = publicName;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BasicInfoResponse)) return false;
        final BasicInfoResponse other = (BasicInfoResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$merchantId = this.getMerchantId();
        final Object other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !this$merchantId.equals(other$merchantId))
            return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        final Object this$publicName = this.getPublicName();
        final Object other$publicName = other.getPublicName();
        if (this$publicName == null ? other$publicName != null : !this$publicName.equals(other$publicName))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BasicInfoResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $merchantId = this.getMerchantId();
        result = result * PRIME + ($merchantId == null ? 43 : $merchantId.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        final Object $publicName = this.getPublicName();
        result = result * PRIME + ($publicName == null ? 43 : $publicName.hashCode());
        return result;
    }

    public String toString() {
        return "BasicInfoResponse(username=" + this.getUsername() + ", merchantId=" + this.getMerchantId() + ", email=" + this.getEmail() + ", publicName=" + this.getPublicName() + ")";
    }
}