package org.example.leetCodes;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
Given an array of intervals where intervals[i] = [starti, endi],
merge all overlapping intervals, and return an array of the non-overlapping
intervals that cover all the intervals in the input.

Example 1:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:
Input: intervals = [[1,4],[4,5]]Output: [[1,5]]Explanation: Intervals [1,4] and [4,5] are considered overlapping.
Example 3:
Input: intervals = [[4,7],[1,4]]Output: [[1,7]]Explanation: Intervals [1,4] and [4,7] are considered overlapping.

Constraints:
1 <= intervals.length <= 10^4
intervals[i].length == 2
0 <= starti <= endi <= 10^4
*/
public class Intervals {

    public static void main(String[] args) {
        List<List<Integer>> intervals = Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(2, 6),
                Arrays.asList(8, 10),
                Arrays.asList(15, 18)
        );

        ArrayDeque<List<Integer>> stack=new ArrayDeque<>();
        for (List<Integer> i:intervals)
        {

                List<Integer> temp=stack.peek();
                if (!stack.isEmpty() && temp.getLast()> i.getFirst() ){
                    stack.pop();
                    stack.push(Arrays.asList(temp.getFirst(),i.getLast()));
                }
                else
                {
                    stack.push(i);
                }


        }
        ArrayDeque<List<Integer>> resultOrder=new ArrayDeque<>();
        while (!stack.isEmpty()) {
            resultOrder.push(stack.pop());
        }

        System.out.println(resultOrder);
    }
}
