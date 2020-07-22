package io.fosdick.leetcode.questions.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class ValidParenthesesTest {

    ValidParentheses validParenthesis;

    @BeforeEach
    void setUp() {
        this.validParenthesis = new ValidParentheses();
    }

    @Test
    void isValid() {
        HashMap<String, Boolean> testCases = new HashMap<String, Boolean>();
        testCases.put("()[]{}", true);
        testCases.put("(]", false);
        testCases.put("([)]", false);
        testCases.put("{[]}", true);

        for(Map.Entry<String, Boolean> testCase : testCases.entrySet()) {
            Assertions.assertEquals(testCase.getValue(), validParenthesis.isValid(testCase.getKey()));
        }
    }
}