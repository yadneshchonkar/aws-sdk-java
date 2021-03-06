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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents individual output from a particular job run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/Output" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Output implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The compression algorithm used to compress the output text of the job.
     * </p>
     */
    private String compressionFormat;
    /**
     * <p>
     * The data format of the output of the job.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The names of one or more partition columns for the output of the job.
     * </p>
     */
    private java.util.List<String> partitionColumns;
    /**
     * <p>
     * The location in Amazon S3 where the job writes its output.
     * </p>
     */
    private S3Location location;
    /**
     * <p>
     * A value that, if true, means that any data in the location specified for output is overwritten with new output.
     * </p>
     */
    private Boolean overwrite;

    /**
     * <p>
     * The compression algorithm used to compress the output text of the job.
     * </p>
     * 
     * @param compressionFormat
     *        The compression algorithm used to compress the output text of the job.
     * @see CompressionFormat
     */

    public void setCompressionFormat(String compressionFormat) {
        this.compressionFormat = compressionFormat;
    }

    /**
     * <p>
     * The compression algorithm used to compress the output text of the job.
     * </p>
     * 
     * @return The compression algorithm used to compress the output text of the job.
     * @see CompressionFormat
     */

    public String getCompressionFormat() {
        return this.compressionFormat;
    }

    /**
     * <p>
     * The compression algorithm used to compress the output text of the job.
     * </p>
     * 
     * @param compressionFormat
     *        The compression algorithm used to compress the output text of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionFormat
     */

    public Output withCompressionFormat(String compressionFormat) {
        setCompressionFormat(compressionFormat);
        return this;
    }

    /**
     * <p>
     * The compression algorithm used to compress the output text of the job.
     * </p>
     * 
     * @param compressionFormat
     *        The compression algorithm used to compress the output text of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionFormat
     */

    public Output withCompressionFormat(CompressionFormat compressionFormat) {
        this.compressionFormat = compressionFormat.toString();
        return this;
    }

    /**
     * <p>
     * The data format of the output of the job.
     * </p>
     * 
     * @param format
     *        The data format of the output of the job.
     * @see OutputFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The data format of the output of the job.
     * </p>
     * 
     * @return The data format of the output of the job.
     * @see OutputFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The data format of the output of the job.
     * </p>
     * 
     * @param format
     *        The data format of the output of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputFormat
     */

    public Output withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The data format of the output of the job.
     * </p>
     * 
     * @param format
     *        The data format of the output of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputFormat
     */

    public Output withFormat(OutputFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The names of one or more partition columns for the output of the job.
     * </p>
     * 
     * @return The names of one or more partition columns for the output of the job.
     */

    public java.util.List<String> getPartitionColumns() {
        return partitionColumns;
    }

    /**
     * <p>
     * The names of one or more partition columns for the output of the job.
     * </p>
     * 
     * @param partitionColumns
     *        The names of one or more partition columns for the output of the job.
     */

    public void setPartitionColumns(java.util.Collection<String> partitionColumns) {
        if (partitionColumns == null) {
            this.partitionColumns = null;
            return;
        }

        this.partitionColumns = new java.util.ArrayList<String>(partitionColumns);
    }

    /**
     * <p>
     * The names of one or more partition columns for the output of the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionColumns(java.util.Collection)} or {@link #withPartitionColumns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param partitionColumns
     *        The names of one or more partition columns for the output of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withPartitionColumns(String... partitionColumns) {
        if (this.partitionColumns == null) {
            setPartitionColumns(new java.util.ArrayList<String>(partitionColumns.length));
        }
        for (String ele : partitionColumns) {
            this.partitionColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of one or more partition columns for the output of the job.
     * </p>
     * 
     * @param partitionColumns
     *        The names of one or more partition columns for the output of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withPartitionColumns(java.util.Collection<String> partitionColumns) {
        setPartitionColumns(partitionColumns);
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 where the job writes its output.
     * </p>
     * 
     * @param location
     *        The location in Amazon S3 where the job writes its output.
     */

    public void setLocation(S3Location location) {
        this.location = location;
    }

    /**
     * <p>
     * The location in Amazon S3 where the job writes its output.
     * </p>
     * 
     * @return The location in Amazon S3 where the job writes its output.
     */

    public S3Location getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location in Amazon S3 where the job writes its output.
     * </p>
     * 
     * @param location
     *        The location in Amazon S3 where the job writes its output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withLocation(S3Location location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * A value that, if true, means that any data in the location specified for output is overwritten with new output.
     * </p>
     * 
     * @param overwrite
     *        A value that, if true, means that any data in the location specified for output is overwritten with new
     *        output.
     */

    public void setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
    }

    /**
     * <p>
     * A value that, if true, means that any data in the location specified for output is overwritten with new output.
     * </p>
     * 
     * @return A value that, if true, means that any data in the location specified for output is overwritten with new
     *         output.
     */

    public Boolean getOverwrite() {
        return this.overwrite;
    }

    /**
     * <p>
     * A value that, if true, means that any data in the location specified for output is overwritten with new output.
     * </p>
     * 
     * @param overwrite
     *        A value that, if true, means that any data in the location specified for output is overwritten with new
     *        output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withOverwrite(Boolean overwrite) {
        setOverwrite(overwrite);
        return this;
    }

    /**
     * <p>
     * A value that, if true, means that any data in the location specified for output is overwritten with new output.
     * </p>
     * 
     * @return A value that, if true, means that any data in the location specified for output is overwritten with new
     *         output.
     */

    public Boolean isOverwrite() {
        return this.overwrite;
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
        if (getCompressionFormat() != null)
            sb.append("CompressionFormat: ").append(getCompressionFormat()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getPartitionColumns() != null)
            sb.append("PartitionColumns: ").append(getPartitionColumns()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getOverwrite() != null)
            sb.append("Overwrite: ").append(getOverwrite());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Output == false)
            return false;
        Output other = (Output) obj;
        if (other.getCompressionFormat() == null ^ this.getCompressionFormat() == null)
            return false;
        if (other.getCompressionFormat() != null && other.getCompressionFormat().equals(this.getCompressionFormat()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getPartitionColumns() == null ^ this.getPartitionColumns() == null)
            return false;
        if (other.getPartitionColumns() != null && other.getPartitionColumns().equals(this.getPartitionColumns()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getOverwrite() == null ^ this.getOverwrite() == null)
            return false;
        if (other.getOverwrite() != null && other.getOverwrite().equals(this.getOverwrite()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompressionFormat() == null) ? 0 : getCompressionFormat().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getPartitionColumns() == null) ? 0 : getPartitionColumns().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getOverwrite() == null) ? 0 : getOverwrite().hashCode());
        return hashCode;
    }

    @Override
    public Output clone() {
        try {
            return (Output) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.OutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
