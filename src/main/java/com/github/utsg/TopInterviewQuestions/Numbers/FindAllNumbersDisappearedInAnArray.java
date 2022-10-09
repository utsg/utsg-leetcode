package com.github.utsg.TopInterviewQuestions.Numbers;

import java.util.ArrayList;
import java.util.List;

// Cyclic Sort
public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int pos = nums[i] - 1; // correct
            if (nums[i] != nums[pos]) {
                int swp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = swp;
            } else {
                i++;
            }
        }

        List<Integer> miss = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                miss.add(j + 1);
            }
        }
        return miss;
    }
}
