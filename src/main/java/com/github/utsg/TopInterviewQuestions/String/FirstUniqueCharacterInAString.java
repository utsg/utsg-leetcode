package com.github.utsg.TopInterviewQuestions.String;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        for (Character ch : s.toCharArray()) {
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                return s.indexOf(ch);
            }
        }
        return -1;
    }
}
