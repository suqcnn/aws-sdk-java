/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * 
 */
public class GetCampaignResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private CampaignResponse campaignResponse;

    /**
     * @param campaignResponse
     */

    public void setCampaignResponse(CampaignResponse campaignResponse) {
        this.campaignResponse = campaignResponse;
    }

    /**
     * @return
     */

    public CampaignResponse getCampaignResponse() {
        return this.campaignResponse;
    }

    /**
     * @param campaignResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCampaignResult withCampaignResponse(CampaignResponse campaignResponse) {
        setCampaignResponse(campaignResponse);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCampaignResponse() != null)
            sb.append("CampaignResponse: " + getCampaignResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCampaignResult == false)
            return false;
        GetCampaignResult other = (GetCampaignResult) obj;
        if (other.getCampaignResponse() == null ^ this.getCampaignResponse() == null)
            return false;
        if (other.getCampaignResponse() != null && other.getCampaignResponse().equals(this.getCampaignResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCampaignResponse() == null) ? 0 : getCampaignResponse().hashCode());
        return hashCode;
    }

    @Override
    public GetCampaignResult clone() {
        try {
            return (GetCampaignResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}