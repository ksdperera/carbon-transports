/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.transport.jms.contract;

import org.wso2.carbon.messaging.CarbonMessage;
import org.wso2.carbon.transport.jms.callback.JMSCallback;

/**
 * Allows to get notifications.
 */
public interface JMSListener {
    /**
     * Transport will trigger this method when for each jms message.
     *
     * @param jmsMessage contains the msg data.
     */
    void onMessage(CarbonMessage jmsMessage, JMSCallback jmsCallback);

    /**
     * If there are errors, transport will trigger this method.
     *
     * @param throwable contains the error details of the event.
     */
    void onError(Throwable throwable);
}
