package org.example.interviewPrep;

import java.util.Arrays;
import java.util.Comparator;

/*
Question
Find the LongestWord form the given String
*/
public class LongestWord {

    public static void main(String[] args) {
        String sentence = "InterviewInterview preparation with Java Streams";
        String longestWord= Arrays.stream(sentence.split(" "))
                .max(Comparator.comparingInt(s->s.length()))
                .orElse("");

        System.out.println(longestWord);

    }

}
