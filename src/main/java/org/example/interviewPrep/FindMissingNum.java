package org.example.interviewPrep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Question
Find the missing number form the given List
*/
public class FindMissingNum {

    public static void main(String[] args) {
        List<Integer> numbersList=Arrays.asList(1,3,5,7,9,11);
        Integer minVal=numbersList.stream().min(Integer::compare).get();
        Integer maxVal=numbersList.stream().max(Integer::compare).get();

        List<Integer> listOfMissingNums= IntStream.rangeClosed(minVal,maxVal)
                .boxed().filter(x->!numbersList.contains(x))
                .collect(Collectors.toList());
        System.out.println("missing numbers  = "+listOfMissingNums);

    }
}
