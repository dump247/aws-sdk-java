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

package com.amazonaws.services.autoscaling.model;

/**
 * 
 */
public enum ScalingActivityStatusCode {

    PendingSpotBidPlacement("PendingSpotBidPlacement"),
    WaitingForSpotInstanceRequestId("WaitingForSpotInstanceRequestId"),
    WaitingForSpotInstanceId("WaitingForSpotInstanceId"),
    WaitingForInstanceId("WaitingForInstanceId"),
    PreInService("PreInService"),
    InProgress("InProgress"),
    WaitingForELBConnectionDraining("WaitingForELBConnectionDraining"),
    MidLifecycleAction("MidLifecycleAction"),
    WaitingForInstanceWarmup("WaitingForInstanceWarmup"),
    Successful("Successful"),
    Failed("Failed"),
    Cancelled("Cancelled");

    private String value;

    private ScalingActivityStatusCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return ScalingActivityStatusCode corresponding to the value
     */
    public static ScalingActivityStatusCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("PendingSpotBidPlacement".equals(value)) {
            return PendingSpotBidPlacement;
        } else if ("WaitingForSpotInstanceRequestId".equals(value)) {
            return WaitingForSpotInstanceRequestId;
        } else if ("WaitingForSpotInstanceId".equals(value)) {
            return WaitingForSpotInstanceId;
        } else if ("WaitingForInstanceId".equals(value)) {
            return WaitingForInstanceId;
        } else if ("PreInService".equals(value)) {
            return PreInService;
        } else if ("InProgress".equals(value)) {
            return InProgress;
        } else if ("WaitingForELBConnectionDraining".equals(value)) {
            return WaitingForELBConnectionDraining;
        } else if ("MidLifecycleAction".equals(value)) {
            return MidLifecycleAction;
        } else if ("WaitingForInstanceWarmup".equals(value)) {
            return WaitingForInstanceWarmup;
        } else if ("Successful".equals(value)) {
            return Successful;
        } else if ("Failed".equals(value)) {
            return Failed;
        } else if ("Cancelled".equals(value)) {
            return Cancelled;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}