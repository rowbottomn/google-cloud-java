/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class InterconnectDiagnosticsLinkOpticalPower implements ApiMessage {
  private final String state;
  private final Float value;

  private InterconnectDiagnosticsLinkOpticalPower() {
    this.state = null;
    this.value = null;
  }

  private InterconnectDiagnosticsLinkOpticalPower(String state, Float value) {
    this.state = state;
    this.value = value;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if (fieldName.equals("state")) {
      return state;
    }
    if (fieldName.equals("value")) {
      return value;
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  @Nullable
  @Override
  public List<String> getFieldMask() {
    return null;
  }

  public String getState() {
    return state;
  }

  public Float getValue() {
    return value;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(InterconnectDiagnosticsLinkOpticalPower prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InterconnectDiagnosticsLinkOpticalPower getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final InterconnectDiagnosticsLinkOpticalPower DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new InterconnectDiagnosticsLinkOpticalPower();
  }

  public static class Builder {
    private String state;
    private Float value;

    Builder() {}

    public Builder mergeFrom(InterconnectDiagnosticsLinkOpticalPower other) {
      if (other == InterconnectDiagnosticsLinkOpticalPower.getDefaultInstance()) return this;
      if (other.getState() != null) {
        this.state = other.state;
      }
      if (other.getValue() != null) {
        this.value = other.value;
      }
      return this;
    }

    Builder(InterconnectDiagnosticsLinkOpticalPower source) {
      this.state = source.state;
      this.value = source.value;
    }

    public String getState() {
      return state;
    }

    public Builder setState(String state) {
      this.state = state;
      return this;
    }

    public Float getValue() {
      return value;
    }

    public Builder setValue(Float value) {
      this.value = value;
      return this;
    }

    public InterconnectDiagnosticsLinkOpticalPower build() {

      return new InterconnectDiagnosticsLinkOpticalPower(state, value);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setState(this.state);
      newBuilder.setValue(this.value);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InterconnectDiagnosticsLinkOpticalPower{"
        + "state="
        + state
        + ", "
        + "value="
        + value
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InterconnectDiagnosticsLinkOpticalPower) {
      InterconnectDiagnosticsLinkOpticalPower that = (InterconnectDiagnosticsLinkOpticalPower) o;
      return Objects.equals(this.state, that.getState())
          && Objects.equals(this.value, that.getValue());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, value);
  }
}
