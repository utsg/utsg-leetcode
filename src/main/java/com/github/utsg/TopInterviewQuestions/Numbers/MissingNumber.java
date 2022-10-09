package com.github.utsg.TopInterviewQuestions.Numbers;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        return nums.length * (nums.length-1) - sum;
    }
}
