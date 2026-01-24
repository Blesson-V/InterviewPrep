package org.example.interviewPrep;
/*
Question Find the given number is palindrome
 */
public class PalindromeInteger {

    public static void main(String[] args) {
        int num=12100;
        if(isPalindrome(num))
        {
            System.out.println("the given num= "+num+" is palindrome");
        }
        else
        {
            System.out.println("the given num= "+num+" is not palindrome");
        }
    }

    private static boolean isPalindrome(int num) {
        int tem=num;
        int rev_number=0;

        while (num!=0)
        {
            int digit =num%10;
            rev_number=rev_number*10 +digit;
            num/=10;
        }

        return rev_number==tem?true:false;
    }
}
