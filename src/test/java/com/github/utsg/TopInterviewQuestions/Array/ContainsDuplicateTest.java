package com.github.utsg.TopInterviewQuestions.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
    ContainsDuplicate cd = new ContainsDuplicate();

    @Test
    public void basicTest() {
        assertTrue(cd.containsDuplicate(new int[]{1,2,1,3,1}));
        assertFalse(cd.containsDuplicate(new int[]{1,2,3,4}));
    }

}