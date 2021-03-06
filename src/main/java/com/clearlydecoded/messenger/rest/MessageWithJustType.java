/*
 * Copyright 2018 Yaakov Chaikin (yaakov@ClearlyDecoded.com). Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance with the License. You
 * may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
 * by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */
package com.clearlydecoded.messenger.rest;

import com.clearlydecoded.messenger.Message;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * {@link MessageWithJustType} class represents a message, which contains only the
 * <code>type</code> property, to be used to deserialize the message string coming as the payload of
 * the REST request. It is then used to determine which real concrete {@link Message} implementation
 * to deserialize the message string to based on that deserialized <code>type</code>.
 *
 * @author Yaakov Chaikin (yaakov@ClearlyDecoded.com)
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageWithJustType implements Message {

  /**
   * Message type identifier.
   */
  private String type;

  @Override
  public String getType() {
    return type;
  }
}
