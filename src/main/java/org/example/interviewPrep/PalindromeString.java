package org.example.interviewPrep;
/*
* Question
* check if a given string is a palindrome
*/
public class PalindromeString {

    public static void main(String[] args) {
        String str="mamo";
        String rev_String=new StringBuilder(str).reverse().toString();
        System.out.println(
                rev_String.equals(str)?
                        "The Given String str= "+str+" is palindrome":
                        "The Given String str= "+str+" is not palindrome"
        );

        //how to reverse without using predefined method
        String rev2_str="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev2_str=rev2_str + str.charAt(i);
        }
        System.out.println(
                rev2_str.equals(str)?
                        "The Given String str= "+str+" is palindrome":
                        "The Given String str= "+str+" is not palindrome"
        );
    }
}
