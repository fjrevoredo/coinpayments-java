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
 * Balance Result
 * 
 * @author Bruno Candido Volpato da Cunha
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BalanceResponse {
	
    private long balance;
    
    private double balancef;

    public BalanceResponse() {
    }

    public long getBalance() {
        return this.balance;
    }

    public double getBalancef() {
        return this.balancef;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setBalancef(double balancef) {
        this.balancef = balancef;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BalanceResponse)) return false;
        final BalanceResponse other = (BalanceResponse) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getBalance() != other.getBalance()) return false;
        if (Double.compare(this.getBalancef(), other.getBalancef()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BalanceResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $balance = this.getBalance();
        result = result * PRIME + (int) ($balance >>> 32 ^ $balance);
        final long $balancef = Double.doubleToLongBits(this.getBalancef());
        result = result * PRIME + (int) ($balancef >>> 32 ^ $balancef);
        return result;
    }

    public String toString() {
        return "BalanceResponse(balance=" + this.getBalance() + ", balancef=" + this.getBalancef() + ")";
    }
}
