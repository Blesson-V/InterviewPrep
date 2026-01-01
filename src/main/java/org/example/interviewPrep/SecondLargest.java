package org.example.interviewPrep;

/*
Question:
find the second-largest number in an array.
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> lstOfNumbers= Arrays.asList(22,33,44,21,45,78,98);

        Integer secondLargestNumber=lstOfNumbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElseThrow();

        System.out.println("secondLargestNumber  : "+secondLargestNumber);


    }
}
