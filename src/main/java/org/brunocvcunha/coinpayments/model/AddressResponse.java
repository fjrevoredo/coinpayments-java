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

@JsonIgnoreProperties( ignoreUnknown = true )
public class AddressResponse {

    private String address;

    @JsonProperty( "pubkey" )
    private String publicKey;

    @JsonProperty( "dest_tag" )
    private String destinationTag;

    public AddressResponse() {
    }

    public String getAddress() {
        return this.address;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public String getDestinationTag() {
        return this.destinationTag;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("pubkey")
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    @JsonProperty("dest_tag")
    public void setDestinationTag(String destinationTag) {
        this.destinationTag = destinationTag;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AddressResponse)) return false;
        final AddressResponse other = (AddressResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        final Object this$publicKey = this.getPublicKey();
        final Object other$publicKey = other.getPublicKey();
        if (this$publicKey == null ? other$publicKey != null : !this$publicKey.equals(other$publicKey)) return false;
        final Object this$destinationTag = this.getDestinationTag();
        final Object other$destinationTag = other.getDestinationTag();
        if (this$destinationTag == null ? other$destinationTag != null : !this$destinationTag.equals(other$destinationTag))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AddressResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $publicKey = this.getPublicKey();
        result = result * PRIME + ($publicKey == null ? 43 : $publicKey.hashCode());
        final Object $destinationTag = this.getDestinationTag();
        result = result * PRIME + ($destinationTag == null ? 43 : $destinationTag.hashCode());
        return result;
    }

    public String toString() {
        return "AddressResponse(address=" + this.getAddress() + ", publicKey=" + this.getPublicKey() + ", destinationTag=" + this.getDestinationTag() + ")";
    }
}
