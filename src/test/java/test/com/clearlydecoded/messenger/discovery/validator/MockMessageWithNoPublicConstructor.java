/*
 * Copyright 2018 Yaakov Chaikin (yaakov@ClearlyDecoded.com). Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance with the License. You
 * may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
 * by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */
package test.com.clearlydecoded.messenger.discovery.validator;

import com.clearlydecoded.messenger.Message;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * {@link MockMessageWithNoPublicConstructor} class is used for testing processor validation.
 * Message with no no-args constructor defined.
 *
 * @author Yaakov Chaikin (yaakov@ClearlyDecoded.com)
 */
@Data
@AllArgsConstructor
public class MockMessageWithNoPublicConstructor implements Message<MockMessageResponse> {

  public static final String TYPE = "MockMessageWithNoPublicConstructor";

  private final String type = TYPE;

  private String someProp;

  @Override
  public String getType() {
    return type;
  }
}
