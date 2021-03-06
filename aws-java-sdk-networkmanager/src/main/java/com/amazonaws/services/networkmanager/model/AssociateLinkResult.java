/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateLink" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateLinkResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The link association.
     * </p>
     */
    private LinkAssociation linkAssociation;

    /**
     * <p>
     * The link association.
     * </p>
     * 
     * @param linkAssociation
     *        The link association.
     */

    public void setLinkAssociation(LinkAssociation linkAssociation) {
        this.linkAssociation = linkAssociation;
    }

    /**
     * <p>
     * The link association.
     * </p>
     * 
     * @return The link association.
     */

    public LinkAssociation getLinkAssociation() {
        return this.linkAssociation;
    }

    /**
     * <p>
     * The link association.
     * </p>
     * 
     * @param linkAssociation
     *        The link association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateLinkResult withLinkAssociation(LinkAssociation linkAssociation) {
        setLinkAssociation(linkAssociation);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLinkAssociation() != null)
            sb.append("LinkAssociation: ").append(getLinkAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateLinkResult == false)
            return false;
        AssociateLinkResult other = (AssociateLinkResult) obj;
        if (other.getLinkAssociation() == null ^ this.getLinkAssociation() == null)
            return false;
        if (other.getLinkAssociation() != null && other.getLinkAssociation().equals(this.getLinkAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLinkAssociation() == null) ? 0 : getLinkAssociation().hashCode());
        return hashCode;
    }

    @Override
    public AssociateLinkResult clone() {
        try {
            return (AssociateLinkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
