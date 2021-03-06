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
public final class InterconnectDiagnosticsARPEntry implements ApiMessage {
  private final String ipAddress;
  private final String macAddress;

  private InterconnectDiagnosticsARPEntry() {
    this.ipAddress = null;
    this.macAddress = null;
  }

  private InterconnectDiagnosticsARPEntry(String ipAddress, String macAddress) {
    this.ipAddress = ipAddress;
    this.macAddress = macAddress;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if (fieldName.equals("ipAddress")) {
      return ipAddress;
    }
    if (fieldName.equals("macAddress")) {
      return macAddress;
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

  public String getIpAddress() {
    return ipAddress;
  }

  public String getMacAddress() {
    return macAddress;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(InterconnectDiagnosticsARPEntry prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InterconnectDiagnosticsARPEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final InterconnectDiagnosticsARPEntry DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new InterconnectDiagnosticsARPEntry();
  }

  public static class Builder {
    private String ipAddress;
    private String macAddress;

    Builder() {}

    public Builder mergeFrom(InterconnectDiagnosticsARPEntry other) {
      if (other == InterconnectDiagnosticsARPEntry.getDefaultInstance()) return this;
      if (other.getIpAddress() != null) {
        this.ipAddress = other.ipAddress;
      }
      if (other.getMacAddress() != null) {
        this.macAddress = other.macAddress;
      }
      return this;
    }

    Builder(InterconnectDiagnosticsARPEntry source) {
      this.ipAddress = source.ipAddress;
      this.macAddress = source.macAddress;
    }

    public String getIpAddress() {
      return ipAddress;
    }

    public Builder setIpAddress(String ipAddress) {
      this.ipAddress = ipAddress;
      return this;
    }

    public String getMacAddress() {
      return macAddress;
    }

    public Builder setMacAddress(String macAddress) {
      this.macAddress = macAddress;
      return this;
    }

    public InterconnectDiagnosticsARPEntry build() {

      return new InterconnectDiagnosticsARPEntry(ipAddress, macAddress);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setIpAddress(this.ipAddress);
      newBuilder.setMacAddress(this.macAddress);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InterconnectDiagnosticsARPEntry{"
        + "ipAddress="
        + ipAddress
        + ", "
        + "macAddress="
        + macAddress
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InterconnectDiagnosticsARPEntry) {
      InterconnectDiagnosticsARPEntry that = (InterconnectDiagnosticsARPEntry) o;
      return Objects.equals(this.ipAddress, that.getIpAddress())
          && Objects.equals(this.macAddress, that.getMacAddress());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, macAddress);
  }
}
