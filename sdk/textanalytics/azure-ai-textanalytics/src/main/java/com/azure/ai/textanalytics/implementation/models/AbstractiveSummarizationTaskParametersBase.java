// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Supported parameters for an Abstractive Summarization task. */
@Fluent
public class AbstractiveSummarizationTaskParametersBase {
    /*
     * It controls the approximate number of sentences in the output summaries.
     */
    @JsonProperty(value = "sentenceCount")
    private Integer sentenceCount;

    /*
     * Specifies the method used to interpret string offsets.  Defaults to Text Elements (Graphemes) according to
     * Unicode v8.0.0. For additional information see https://aka.ms/text-analytics-offsets.
     */
    @JsonProperty(value = "stringIndexType")
    private StringIndexType stringIndexType;

    /**
     * Get the sentenceCount property: It controls the approximate number of sentences in the output summaries.
     *
     * @return the sentenceCount value.
     */
    public Integer getSentenceCount() {
        return this.sentenceCount;
    }

    /**
     * Set the sentenceCount property: It controls the approximate number of sentences in the output summaries.
     *
     * @param sentenceCount the sentenceCount value to set.
     * @return the AbstractiveSummarizationTaskParametersBase object itself.
     */
    public AbstractiveSummarizationTaskParametersBase setSentenceCount(Integer sentenceCount) {
        this.sentenceCount = sentenceCount;
        return this;
    }

    /**
     * Get the stringIndexType property: Specifies the method used to interpret string offsets. Defaults to Text
     * Elements (Graphemes) according to Unicode v8.0.0. For additional information see
     * https://aka.ms/text-analytics-offsets.
     *
     * @return the stringIndexType value.
     */
    public StringIndexType getStringIndexType() {
        return this.stringIndexType;
    }

    /**
     * Set the stringIndexType property: Specifies the method used to interpret string offsets. Defaults to Text
     * Elements (Graphemes) according to Unicode v8.0.0. For additional information see
     * https://aka.ms/text-analytics-offsets.
     *
     * @param stringIndexType the stringIndexType value to set.
     * @return the AbstractiveSummarizationTaskParametersBase object itself.
     */
    public AbstractiveSummarizationTaskParametersBase setStringIndexType(StringIndexType stringIndexType) {
        this.stringIndexType = stringIndexType;
        return this;
    }
}