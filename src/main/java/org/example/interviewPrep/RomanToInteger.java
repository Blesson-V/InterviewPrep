package org.example.interviewPrep;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {
        // Step 1: Create a map of Roman numerals
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        // Step 2: Traverse the string
        for (int i = 0; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i));

            // Check if next numeral exists and is larger
            if (i + 1 < s.length() && current < romanMap.get(s.charAt(i + 1))) {
                result -= current; // subtract if smaller than next
            } else {
                result += current; // otherwise add
            }
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {
      //  System.out.println(romanToInt("III"));     // Output: 3
        System.out.println(romanToInt("IV"));      // Output: 4
        System.out.println(romanToInt("IX"));      // Output: 9
        System.out.println(romanToInt("LVIII"));   // Output: 58
        System.out.println(romanToInt("MCMXCIV")); // Output: 1994
    }
}