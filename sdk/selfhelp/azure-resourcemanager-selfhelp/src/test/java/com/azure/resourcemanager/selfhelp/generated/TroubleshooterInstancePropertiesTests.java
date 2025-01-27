// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.selfhelp.fluent.models.TroubleshooterInstanceProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TroubleshooterInstancePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TroubleshooterInstanceProperties model =
            BinaryData
                .fromString(
                    "{\"solutionId\":\"obbc\",\"parameters\":{\"ghfg\":\"rtjriplrbpbew\"},\"provisioningState\":\"Canceled\",\"steps\":[{\"id\":\"zvlvqhjkbegib\",\"title\":\"mxiebw\",\"description\":\"loayqcgw\",\"guidance\":\"zjuzgwyz\",\"executionStatus\":\"Success\",\"executionStatusDescription\":\"ongmtsa\",\"type\":\"AutomatedCheck\",\"isLastStep\":false,\"inputs\":[{\"questionId\":\"p\",\"questionType\":\"knftguvriuh\",\"questionContent\":\"wmdyvxqtay\",\"questionContentType\":\"Html\",\"responseHint\":\"ro\",\"recommendedOption\":\"bexrmcq\",\"selectedOptionValue\":\"ycnojvknmefqsg\",\"responseValidationProperties\":{\"regex\":\"hapjyzhpvgqz\",\"isRequired\":true,\"validationErrorMessage\":\"xdjzlmwlxk\",\"maxLength\":8451132931226635993},\"responseOptions\":[{},{}]},{\"questionId\":\"vawjvzunlu\",\"questionType\":\"nnprn\",\"questionContent\":\"peilpjzuaejxdu\",\"questionContentType\":\"Html\",\"responseHint\":\"zbbtdzumveek\",\"recommendedOption\":\"wozuhkf\",\"selectedOptionValue\":\"sjyofdx\",\"responseValidationProperties\":{\"regex\":\"sd\",\"isRequired\":true,\"validationErrorMessage\":\"waboe\",\"maxLength\":108645290116886503},\"responseOptions\":[{}]},{\"questionId\":\"smv\",\"questionType\":\"wyjsflhhcaalnjix\",\"questionContent\":\"xyawj\",\"questionContentType\":\"Text\",\"responseHint\":\"cslyjpk\",\"recommendedOption\":\"dzyexznelixh\",\"selectedOptionValue\":\"ztfolhbnxk\",\"responseValidationProperties\":{\"regex\":\"aulppggd\",\"isRequired\":true,\"validationErrorMessage\":\"pnyiropuhp\",\"maxLength\":6182920214786392878},\"responseOptions\":[{},{},{},{}]}],\"automatedCheckResults\":{\"result\":\"qgitxmed\",\"type\":\"Success\"},\"insights\":[{\"id\":\"n\",\"title\":\"wncwzzhxgktrmg\",\"results\":\"napkteoellw\",\"importanceLevel\":\"Information\"},{\"id\":\"ygpfqb\",\"title\":\"ceopzfqrhhuaopp\",\"results\":\"qeqxo\",\"importanceLevel\":\"Critical\"},{\"id\":\"hzxct\",\"title\":\"gbkdmoizpos\",\"results\":\"grcfb\",\"importanceLevel\":\"Critical\"}]},{\"id\":\"qjhhkxbpv\",\"title\":\"mjh\",\"description\":\"j\",\"guidance\":\"gudivkrtswbxqz\",\"executionStatus\":\"Success\",\"executionStatusDescription\":\"fauvjfdxx\",\"type\":\"Decision\",\"isLastStep\":true,\"inputs\":[{\"questionId\":\"aqtdoqmcbx\",\"questionType\":\"vxysl\",\"questionContent\":\"hsfxoblytkb\",\"questionContentType\":\"Text\",\"responseHint\":\"wwwfbkr\",\"recommendedOption\":\"nsvs\",\"selectedOptionValue\":\"johxcrsb\",\"responseValidationProperties\":{\"regex\":\"asrru\",\"isRequired\":true,\"validationErrorMessage\":\"sqfsubcgjbirxb\",\"maxLength\":5990216587260133822},\"responseOptions\":[{},{},{},{}]},{\"questionId\":\"jfdtwssotftpvj\",\"questionType\":\"exilzznfqqnvwpmq\",\"questionContent\":\"ruoujmk\",\"questionContentType\":\"Markdown\",\"responseHint\":\"qytjrybnwjewgd\",\"recommendedOption\":\"ervnaenqpehi\",\"selectedOptionValue\":\"oygmift\",\"responseValidationProperties\":{\"regex\":\"d\",\"isRequired\":false,\"validationErrorMessage\":\"gnayqigynduh\",\"maxLength\":2967009412675959083},\"responseOptions\":[{},{},{},{}]},{\"questionId\":\"humaqolbgyc\",\"questionType\":\"iertgccymvaolp\",\"questionContent\":\"lqlfm\",\"questionContentType\":\"Html\",\"responseHint\":\"bglzpswi\",\"recommendedOption\":\"mcwyhzdxssadb\",\"selectedOptionValue\":\"nvdfznuda\",\"responseValidationProperties\":{\"regex\":\"xzb\",\"isRequired\":true,\"validationErrorMessage\":\"ylpstdbhhxsrzdz\",\"maxLength\":1038709270981332585},\"responseOptions\":[{},{},{},{}]}],\"automatedCheckResults\":{\"result\":\"t\",\"type\":\"Error\"},\"insights\":[{\"id\":\"jmygtdsslswtmwer\",\"title\":\"fzp\",\"results\":\"semwabnet\",\"importanceLevel\":\"Warning\"},{\"id\":\"zhedplvwiw\",\"title\":\"mwmbes\",\"results\":\"nkww\",\"importanceLevel\":\"Critical\"},{\"id\":\"flcxoga\",\"title\":\"onz\",\"results\":\"sikvmkqzeqqkdlt\",\"importanceLevel\":\"Critical\"}]},{\"id\":\"hvhgureod\",\"title\":\"obdagxtibqdxb\",\"description\":\"akbogqxndlkzgxh\",\"guidance\":\"iplbpodxunkbebxm\",\"executionStatus\":\"Running\",\"executionStatusDescription\":\"ntwlrbqtkoie\",\"type\":\"Decision\",\"isLastStep\":false,\"inputs\":[{\"questionId\":\"l\",\"questionType\":\"muwlauwzizxbm\",\"questionContent\":\"cjefuzmu\",\"questionContentType\":\"Html\",\"responseHint\":\"tdum\",\"recommendedOption\":\"p\",\"selectedOptionValue\":\"ebmnzbtbhjpglk\",\"responseValidationProperties\":{\"regex\":\"hdneuelfph\",\"isRequired\":true,\"validationErrorMessage\":\"t\",\"maxLength\":960595332999400866},\"responseOptions\":[{},{},{},{}]}],\"automatedCheckResults\":{\"result\":\"wq\",\"type\":\"Success\"},\"insights\":[{\"id\":\"clvit\",\"title\":\"qzonosggbhcohf\",\"results\":\"sjnkal\",\"importanceLevel\":\"Warning\"}]}]}")
                .toObject(TroubleshooterInstanceProperties.class);
        Assertions.assertEquals("obbc", model.solutionId());
        Assertions.assertEquals("rtjriplrbpbew", model.parameters().get("ghfg"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TroubleshooterInstanceProperties model =
            new TroubleshooterInstanceProperties()
                .withSolutionId("obbc")
                .withParameters(mapOf("ghfg", "rtjriplrbpbew"));
        model = BinaryData.fromObject(model).toObject(TroubleshooterInstanceProperties.class);
        Assertions.assertEquals("obbc", model.solutionId());
        Assertions.assertEquals("rtjriplrbpbew", model.parameters().get("ghfg"));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
