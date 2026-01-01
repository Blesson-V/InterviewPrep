package org.example.interviewPrep;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Question:
find duplicate elements in an array
*/
public class FindDuplicate {

    public static void main(String[] args) {
        List<Integer> ListOfNumbers = Arrays.asList(1,3,5,7,8,5,2,5,3,2,1);
        ListOfNumbers.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue()>1)
                .forEach(
                        x->{
                        System.out.println("Duplicate element: "+x.getKey() +
                                "  Occurances count : "+ x.getValue());
    }
                );
    }
}
