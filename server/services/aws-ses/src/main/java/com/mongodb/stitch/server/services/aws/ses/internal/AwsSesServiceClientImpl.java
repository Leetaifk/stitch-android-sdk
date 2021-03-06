/*
 * Copyright 2018-present MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mongodb.stitch.server.services.aws.ses.internal;

import com.mongodb.stitch.core.services.aws.ses.AwsSesSendResult;
import com.mongodb.stitch.core.services.aws.ses.internal.CoreAwsSesServiceClient;
import com.mongodb.stitch.server.services.aws.ses.AwsSesServiceClient;
import javax.annotation.Nonnull;

/**
 * @deprecated use AwsServiceClient instead.
 */
@Deprecated
public final class AwsSesServiceClientImpl implements AwsSesServiceClient {

  private final CoreAwsSesServiceClient proxy;

  public AwsSesServiceClientImpl(final CoreAwsSesServiceClient client) {
    this.proxy = client;
  }

  /**
   * Sends an email.
   *
   * @param to the email address to send the email to.
   * @param from the email address to send the email from.
   * @param subject the subject of the email.
   * @param body the body text of the email.
   * @return the result of the send.
   */
  public AwsSesSendResult sendEmail(
      @Nonnull final String to,
      @Nonnull final String from,
      @Nonnull final String subject,
      @Nonnull final String body) {
    return proxy.sendEmail(to, from, subject, body);
  }
}
