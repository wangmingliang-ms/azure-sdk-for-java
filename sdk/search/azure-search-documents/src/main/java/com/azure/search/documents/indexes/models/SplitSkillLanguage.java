// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/** The language codes supported for input text by SplitSkill. */
public final class SplitSkillLanguage extends ExpandableStringEnum<SplitSkillLanguage> {
    /** Amharic. */
    public static final SplitSkillLanguage AM = fromString("am");

    /** Bosnian. */
    public static final SplitSkillLanguage BS = fromString("bs");

    /** Czech. */
    public static final SplitSkillLanguage CS = fromString("cs");

    /** Danish. */
    public static final SplitSkillLanguage DA = fromString("da");

    /** German. */
    public static final SplitSkillLanguage DE = fromString("de");

    /** English. */
    public static final SplitSkillLanguage EN = fromString("en");

    /** Spanish. */
    public static final SplitSkillLanguage ES = fromString("es");

    /** Estonian. */
    public static final SplitSkillLanguage ET = fromString("et");

    /** Finnish. */
    public static final SplitSkillLanguage FI = fromString("fi");

    /** French. */
    public static final SplitSkillLanguage FR = fromString("fr");

    /** Hebrew. */
    public static final SplitSkillLanguage HE = fromString("he");

    /** Hindi. */
    public static final SplitSkillLanguage HI = fromString("hi");

    /** Croatian. */
    public static final SplitSkillLanguage HR = fromString("hr");

    /** Hungarian. */
    public static final SplitSkillLanguage HU = fromString("hu");

    /** Indonesian. */
    public static final SplitSkillLanguage ID = fromString("id");

    /** Icelandic. */
    public static final SplitSkillLanguage IS = fromString("is");

    /** Italian. */
    public static final SplitSkillLanguage IT = fromString("it");

    /** Japanese. */
    public static final SplitSkillLanguage JA = fromString("ja");

    /** Korean. */
    public static final SplitSkillLanguage KO = fromString("ko");

    /** Latvian. */
    public static final SplitSkillLanguage LV = fromString("lv");

    /** Norwegian. */
    public static final SplitSkillLanguage NB = fromString("nb");

    /** Dutch. */
    public static final SplitSkillLanguage NL = fromString("nl");

    /** Polish. */
    public static final SplitSkillLanguage PL = fromString("pl");

    /** Portuguese (Portugal). */
    public static final SplitSkillLanguage PT = fromString("pt");

    /** Portuguese (Brazil). */
    public static final SplitSkillLanguage PT_BR = fromString("pt-br");

    /** Russian. */
    public static final SplitSkillLanguage RU = fromString("ru");

    /** Slovak. */
    public static final SplitSkillLanguage SK = fromString("sk");

    /** Slovenian. */
    public static final SplitSkillLanguage SL = fromString("sl");

    /** Serbian. */
    public static final SplitSkillLanguage SR = fromString("sr");

    /** Swedish. */
    public static final SplitSkillLanguage SV = fromString("sv");

    /** Turkish. */
    public static final SplitSkillLanguage TR = fromString("tr");

    /** Urdu. */
    public static final SplitSkillLanguage UR = fromString("ur");

    /** Chinese (Simplified). */
    public static final SplitSkillLanguage ZH = fromString("zh");

    /**
     * Creates a new instance of SplitSkillLanguage value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SplitSkillLanguage() {}

    /**
     * Creates or finds a SplitSkillLanguage from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SplitSkillLanguage.
     */
    public static SplitSkillLanguage fromString(String name) {
        return fromString(name, SplitSkillLanguage.class);
    }

    /**
     * Gets known SplitSkillLanguage values.
     *
     * @return known SplitSkillLanguage values.
     */
    public static Collection<SplitSkillLanguage> values() {
        return values(SplitSkillLanguage.class);
    }
}
