package com.github.utsg.TopInterviewQuestions.Numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MissingNumbersTest {
    MissingNumber mn = new MissingNumber();

    @Test
    public void basicTest() {
        Assertions.assertEquals(2, mn.missingNumber(new int[]{1, 0, 3}));
    }
}