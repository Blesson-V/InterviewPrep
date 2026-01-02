package org.example.interviewPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Question:
find Odd and Even numbers in an array
*/
public class FindOddAndEven {

    public static void main(String[] args) {
        List<Integer> listOfNums =Arrays.asList(1,2,3,4,5,6,7,8,8,9,10,11,12);

        //filter even
        List<Integer> even=listOfNums.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println("even : " + even);
        //filter odd
        List<Integer> odd=listOfNums.stream().filter(x->x%2!=0).collect(Collectors.toList());
        System.out.println("odd : " + odd);

        //filter both
        Map<Boolean,List<Integer>> OddandEven =listOfNums.stream().collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println("Even : " + OddandEven.get(true));
        System.out.println("Even : " + OddandEven.get(true));



    }
}
