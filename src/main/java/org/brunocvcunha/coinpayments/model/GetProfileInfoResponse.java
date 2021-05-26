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

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetProfileInfoResponse {

    private String pbntag;

    private String merchant;

    @JsonProperty("profile_name")
    private String profileName;

    @JsonProperty("profile_url")
    private String profileUrl;

    @JsonProperty("profile_email")
    private String profileEmail;

    @JsonProperty("profile_image")
    private String profileImage;

    @JsonProperty("member_since")
    private long memberSince;

    private List<String> feedback;

    public GetProfileInfoResponse() {
    }

    public String getPbntag() {
        return this.pbntag;
    }

    public String getMerchant() {
        return this.merchant;
    }

    public String getProfileName() {
        return this.profileName;
    }

    public String getProfileUrl() {
        return this.profileUrl;
    }

    public String getProfileEmail() {
        return this.profileEmail;
    }

    public String getProfileImage() {
        return this.profileImage;
    }

    public long getMemberSince() {
        return this.memberSince;
    }

    public List<String> getFeedback() {
        return this.feedback;
    }

    public void setPbntag(String pbntag) {
        this.pbntag = pbntag;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    @JsonProperty("profile_name")
    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    @JsonProperty("profile_url")
    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    @JsonProperty("profile_email")
    public void setProfileEmail(String profileEmail) {
        this.profileEmail = profileEmail;
    }

    @JsonProperty("profile_image")
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    @JsonProperty("member_since")
    public void setMemberSince(long memberSince) {
        this.memberSince = memberSince;
    }

    public void setFeedback(List<String> feedback) {
        this.feedback = feedback;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GetProfileInfoResponse)) return false;
        final GetProfileInfoResponse other = (GetProfileInfoResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$pbntag = this.getPbntag();
        final Object other$pbntag = other.getPbntag();
        if (this$pbntag == null ? other$pbntag != null : !this$pbntag.equals(other$pbntag)) return false;
        final Object this$merchant = this.getMerchant();
        final Object other$merchant = other.getMerchant();
        if (this$merchant == null ? other$merchant != null : !this$merchant.equals(other$merchant)) return false;
        final Object this$profileName = this.getProfileName();
        final Object other$profileName = other.getProfileName();
        if (this$profileName == null ? other$profileName != null : !this$profileName.equals(other$profileName))
            return false;
        final Object this$profileUrl = this.getProfileUrl();
        final Object other$profileUrl = other.getProfileUrl();
        if (this$profileUrl == null ? other$profileUrl != null : !this$profileUrl.equals(other$profileUrl))
            return false;
        final Object this$profileEmail = this.getProfileEmail();
        final Object other$profileEmail = other.getProfileEmail();
        if (this$profileEmail == null ? other$profileEmail != null : !this$profileEmail.equals(other$profileEmail))
            return false;
        final Object this$profileImage = this.getProfileImage();
        final Object other$profileImage = other.getProfileImage();
        if (this$profileImage == null ? other$profileImage != null : !this$profileImage.equals(other$profileImage))
            return false;
        if (this.getMemberSince() != other.getMemberSince()) return false;
        final Object this$feedback = this.getFeedback();
        final Object other$feedback = other.getFeedback();
        if (this$feedback == null ? other$feedback != null : !this$feedback.equals(other$feedback)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GetProfileInfoResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $pbntag = this.getPbntag();
        result = result * PRIME + ($pbntag == null ? 43 : $pbntag.hashCode());
        final Object $merchant = this.getMerchant();
        result = result * PRIME + ($merchant == null ? 43 : $merchant.hashCode());
        final Object $profileName = this.getProfileName();
        result = result * PRIME + ($profileName == null ? 43 : $profileName.hashCode());
        final Object $profileUrl = this.getProfileUrl();
        result = result * PRIME + ($profileUrl == null ? 43 : $profileUrl.hashCode());
        final Object $profileEmail = this.getProfileEmail();
        result = result * PRIME + ($profileEmail == null ? 43 : $profileEmail.hashCode());
        final Object $profileImage = this.getProfileImage();
        result = result * PRIME + ($profileImage == null ? 43 : $profileImage.hashCode());
        final long $memberSince = this.getMemberSince();
        result = result * PRIME + (int) ($memberSince >>> 32 ^ $memberSince);
        final Object $feedback = this.getFeedback();
        result = result * PRIME + ($feedback == null ? 43 : $feedback.hashCode());
        return result;
    }

    public String toString() {
        return "GetProfileInfoResponse(pbntag=" + this.getPbntag() + ", merchant=" + this.getMerchant() + ", profileName=" + this.getProfileName() + ", profileUrl=" + this.getProfileUrl() + ", profileEmail=" + this.getProfileEmail() + ", profileImage=" + this.getProfileImage() + ", memberSince=" + this.getMemberSince() + ", feedback=" + this.getFeedback() + ")";
    }
}
