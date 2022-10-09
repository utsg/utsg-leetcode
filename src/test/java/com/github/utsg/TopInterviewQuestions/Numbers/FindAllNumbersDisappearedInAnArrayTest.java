package com.github.utsg.TopInterviewQuestions.Numbers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindAllNumbersDisappearedInAnArrayTest {

    @Test
    public void basicTests() {
        List<Integer> result = new ArrayList<>();
        result.add(5);
        result.add(6);

        FindAllNumbersDisappearedInAnArray fn = new FindAllNumbersDisappearedInAnArray();

        assertEquals(result, fn.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }

}