package org.example.interviewPrep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
Question:
Remove duplicate elements in an array and ArrayList
        int [] i={1,3,5,7,8,5,2,5,3,2,1};
*/
public class RemoveDuplicate {

    public static void main(String[] args) {
        int [] i={1,3,5,7,8,5,2,5,3,2,1};
        List<Integer> listOfUniqe=Arrays.stream(i).boxed().distinct().toList();
        System.out.println(listOfUniqe);
        //Approach2
        Set<Integer> UniqeNums=Arrays.stream(i).boxed().collect(Collectors.toSet());
        System.out.println(UniqeNums);

        //Approach3 with Array list
        List<Integer> nums= Arrays.asList(1,3,5,7,8,5,2,5,3,2,1);
        System.out.println(nums.stream().distinct().toList());

        //Approach4 with Array list
        System.out.println(nums.stream().collect(Collectors.toSet()));

        //Approach5 with Array list
        System.out.println(new HashSet<Integer>(nums));





    }

}
