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
public class CreateWithdrawalResponse extends CreateTransferResponse {

    private double amount;
    private String error;
    private String note;

    public CreateWithdrawalResponse() {
    }

    public double getAmount() {
        return this.amount;
    }

    public String getError() {
        return this.error;
    }

    public String getNote() {
        return this.note;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String toString() {
        return "CreateWithdrawalResponse(amount=" + this.getAmount() + ", error=" + this.getError() + ", note=" + this.getNote() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CreateWithdrawalResponse)) return false;
        final CreateWithdrawalResponse other = (CreateWithdrawalResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (Double.compare(this.getAmount(), other.getAmount()) != 0) return false;
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null ? other$error != null : !this$error.equals(other$error)) return false;
        final Object this$note = this.getNote();
        final Object other$note = other.getNote();
        if (this$note == null ? other$note != null : !this$note.equals(other$note)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CreateWithdrawalResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final long $amount = Double.doubleToLongBits(this.getAmount());
        result = result * PRIME + (int) ($amount >>> 32 ^ $amount);
        final Object $error = this.getError();
        result = result * PRIME + ($error == null ? 43 : $error.hashCode());
        final Object $note = this.getNote();
        result = result * PRIME + ($note == null ? 43 : $note.hashCode());
        return result;
    }
}
