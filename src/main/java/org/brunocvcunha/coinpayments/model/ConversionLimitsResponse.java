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
public class ConversionLimitsResponse {
	private String min;
	private String max;

	public ConversionLimitsResponse() {
	}

	public String getMin() {
		return this.min;
	}

	public String getMax() {
		return this.max;
	}

	public void setMin(String min) {
		this.min = min;
	}

	public void setMax(String max) {
		this.max = max;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof ConversionLimitsResponse)) return false;
		final ConversionLimitsResponse other = (ConversionLimitsResponse) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$min = this.getMin();
		final Object other$min = other.getMin();
		if (this$min == null ? other$min != null : !this$min.equals(other$min)) return false;
		final Object this$max = this.getMax();
		final Object other$max = other.getMax();
		if (this$max == null ? other$max != null : !this$max.equals(other$max)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof ConversionLimitsResponse;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $min = this.getMin();
		result = result * PRIME + ($min == null ? 43 : $min.hashCode());
		final Object $max = this.getMax();
		result = result * PRIME + ($max == null ? 43 : $max.hashCode());
		return result;
	}

	public String toString() {
		return "ConversionLimitsResponse(min=" + this.getMin() + ", max=" + this.getMax() + ")";
	}
}
