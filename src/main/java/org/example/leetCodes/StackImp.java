package org.example.leetCodes;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

/*
Question: Reverse Polish Notation

Problem Description

An arithmetic expression is given by a string array A of size N.
Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each string may be an integer or an operator.

Note: Reverse Polish Notation is equivalent to Postfix Expression, where operators are written after their operands.


Problem Constraints

1 <= N <= 105


Input Format

The only argument given is string array A.


Output Format
Return the value of arithmetic expression formed using reverse Polish Notation.

Example Input

Input 1:

A =   ["2", "1", "+", "3", "*"]

Input 2:

A = ["4", "13", "5", "/", "+"]


Example Output

Output 1:

9

Output 2:

6

*/
public class StackImp {
    static Deque<Integer> stack;
    public static void main(String[] args) {

       // List<String> lst=Arrays.asList("2", "1", "+", "3", "*");
        List<String> lst=Arrays.asList("2", "2", "/", "4", "+");
        stack =new ArrayDeque<>();

        for(String str:lst)
        {
            try{
                int temp =Integer.parseInt(str);
                stack.push(Integer.parseInt(str));
            }
            catch (Exception e)
            {
                perform(str);
            }
        }
        System.out.println(stack);
    }

    public static void perform(String operator) {

        int op1=stack.pop();
        int op2=stack.pop();

        switch(operator)
        {
            case "+":
                stack.push(op1+op2);
                break;
            case "-":
                stack.push(op1-op2);
                break;
            case "*":
                stack.push(op1*op2);
                break;
            case "/":
                stack.push(op1/op2);
                break;
            default:
                System.out.println("invalid input");
    }
}
}
