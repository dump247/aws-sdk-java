/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.apigateway.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TestInvokeAuthorizerResult JSON Unmarshaller
 */
public class TestInvokeAuthorizerResultJsonUnmarshaller implements
        Unmarshaller<TestInvokeAuthorizerResult, JsonUnmarshallerContext> {

    public TestInvokeAuthorizerResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        TestInvokeAuthorizerResult testInvokeAuthorizerResult = new TestInvokeAuthorizerResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("clientStatus", targetDepth)) {
                    context.nextToken();
                    testInvokeAuthorizerResult
                            .setClientStatus(IntegerJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("log", targetDepth)) {
                    context.nextToken();
                    testInvokeAuthorizerResult.setLog(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("latency", targetDepth)) {
                    context.nextToken();
                    testInvokeAuthorizerResult.setLatency(LongJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("principalId", targetDepth)) {
                    context.nextToken();
                    testInvokeAuthorizerResult
                            .setPrincipalId(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("policy", targetDepth)) {
                    context.nextToken();
                    testInvokeAuthorizerResult.setPolicy(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("authorization", targetDepth)) {
                    context.nextToken();
                    testInvokeAuthorizerResult
                            .setAuthorization(new MapUnmarshaller<String, java.util.List<String>>(
                                    StringJsonUnmarshaller.getInstance(),
                                    new ListUnmarshaller<String>(
                                            StringJsonUnmarshaller
                                                    .getInstance()))
                                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return testInvokeAuthorizerResult;
    }

    private static TestInvokeAuthorizerResultJsonUnmarshaller instance;

    public static TestInvokeAuthorizerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TestInvokeAuthorizerResultJsonUnmarshaller();
        return instance;
    }
}
