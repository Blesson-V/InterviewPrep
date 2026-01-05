package org.example.interviewPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Question
Count frequency of chars in a given string using streams
 */
public class FrequencyOfElements {

    public static void main(String[] args) {
        String name="SyncWithBlesson";

        //thi not maintain sttring sequance of Characters
        Map<Character,Long> result=name.toLowerCase().chars().mapToObj(x->(char)x)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        result.entrySet().stream().forEach(System.out::println);

        // to preserve the oreder here we are going to use LinkedHashMap

        Map<Character,Long> result2=name.toLowerCase().chars().mapToObj(x->(char)x)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        result2.entrySet().stream().forEach(System.out::println);

        // thanks for watching stay tuned
    }
}
