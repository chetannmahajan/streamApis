package org.example;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeQuestion {

    public static void main(String[] args) {

        String s3 = "helloThere/auth-callback".split("/auth-callback")[0];
        System.out.println(s3);

        System.out.println("----------------------------------");

        //1) Given a list of integers, separate odd and even numbers?
        int[] array = {71, 18, 42, 21, 67, 32, 95, 14, 56, 87};

        Map<Boolean, List<Integer>> collect = Arrays.stream(array).boxed().collect(Collectors.partitioningBy(i -> i % 2 == 0));


        System.out.println("even elements");
        collect.get(true).forEach(i -> System.out.println(i));

        System.out.println("odd elements");
        collect.get(false).forEach(i -> System.out.println(i));


        //2) How do you remove duplicate elements from a list using Java 8 streams?

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        String[] strArry = {"Java", "Python", "C#", "Java", "Kotlin", "Python"};

        Arrays.stream(strArry).distinct().collect(Collectors.toList()).forEach(str -> System.out.println(str));


        //3) How do you find frequency of each character in a string using Java 8 streams?

        System.out.println("after line 33");
        String inputString = "Java Concept Of The Day";
        inputString.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting())).forEach((k,v) -> System.out.println(k+" "+v));

        //4) How do you find frequency of each element in an array or a list?

        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        stationeryList.stream().collect(Collectors.groupingBy(string -> string, Collectors.counting())).entrySet().forEach(System.out::println);



        System.out.println("After line 42");
        String[] str = {"Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil"};
        Arrays.stream(str).collect(Collectors.groupingBy(string -> string, Collectors.counting())).forEach((k,v) -> System.out.println(k+" "+v));

        //5) How do you sort the given list of decimals in reverse order?

        System.out.println("After line 48");
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e));



        System.out.println("after line 53");
        //6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
        List<String> listOfStrings1 = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String collect1 = listOfStrings1.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(collect1);

        System.out.println("after line 60");

        //7) From the given list of integers, print the numbers which are multiples of 5?
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int[] intArray = {45, 12, 56, 15, 24, 75, 31, 89};
        System.out.println("online 71");
        listOfIntegers.stream().sorted();

        Arrays.stream(intArray).filter(i -> i%5 == 0).forEach(e -> System.out.println(e));


        System.out.println("after line 70");
        //8) Given a list of integers, find maximum and minimum of those numbers?
        List<Integer> listOfIntegers1 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        // Finding minimum using Stream
        Optional<Integer> min1 = listOfIntegers.stream()
                .min(Integer::compare);

        // Finding maximum using Stream
        Optional<Integer> max1 = listOfIntegers.stream()
                .max(Integer::compare);

        Integer min = listOfIntegers1.stream().min(Comparator.comparing(Function.identity())).get();
        System.out.println(min);
        //max
        Integer max = listOfIntegers1.stream().max(Comparator.comparing(Function.identity())).get();
        System.out.println(max);


        System.out.println("after line 79");
        //9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?

        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};

        IntStream.concat(Arrays.stream(a), Arrays.stream(b));


        IntStream concat = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted();
        concat.forEach(i -> System.out.println(i));


        System.out.println("after line 90");
        //10)How do you merge two unsorted arrays into single sorted array without duplicates?
        int[] a1 = new int[] {4, 2, 5, 1};

        int[] b2 = new int[] {8, 1, 9, 5};

        IntStream distinct = IntStream.concat(Arrays.stream(a1), Arrays.stream(b2)).sorted().distinct();
        distinct.forEach(i -> System.out.println(i));

        System.out.println("after line 99");
        //11) How do you get three maximum numbers and three minimum numbers from the given list of integers?
        List<Integer> listOfIntegers2 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int[] ArrayInteger = {45, 12, 56, 15, 24, 75, 31, 89};
        Arrays.stream(ArrayInteger).sorted().limit(3).forEach(i -> System.out.println(i));
        System.out.println("minimum 3 numbers----------------");
        Arrays.stream(ArrayInteger).boxed().sorted(Comparator.reverseOrder()).limit(3).forEach(i -> System.out.println(i));

        //12) Java 8 program to check if two strings are anagrams or not?


        System.out.println("after line 110");
        //13) Find sum of all digits of a number in Java 8?
        int i = 15623;
        String s = Integer.toString(i);
        Arrays.stream(s.split(""));

        int sum = Arrays.stream(String.valueOf(i).split("")).mapToInt(number -> Integer.parseInt(number)).sum();
        System.out.println(sum);

        System.out.println("after line 116");

        //14) Find second largest number in an integer array?

        List<Integer> listOfIntegers3 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Integer integer = listOfIntegers3.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(integer);

        System.out.println("after line 123");

        //15) Given a list of strings, sort them according to increasing order of their length?

        List<String> listOfStrings2 = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings2.stream().sorted(Comparator.comparing(currentString -> currentString.length())).forEach(some -> System.out.println(some));

        System.out.println("online 130");
        //16) Given an integer array, find sum and average of all elements?

        int[] integerArray = new int[] {45, 12, 56, 15, 24, 75, 31, 89};

        int sum1 = Arrays.stream(integerArray).sum();
        System.out.println("sum is sum1:"+sum1);
        double asDouble = Arrays.stream(integerArray).average().getAsDouble();
        System.out.println("average is:"+asDouble);


        System.out.println("online 142");
        //17)How do you find common elements between two arrays?

        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        list1.stream().filter(list2::contains).collect(Collectors.toList()).forEach(newInt -> System.out.println(newInt));

        System.out.println("after line 152");
        //18)Reverse each word of a string using Java 8 streams?
        String string = "Java Concept Of The Day";
        String[] s2 = string.split(" ");

        Arrays.stream(string.split(" ")).map(element -> new StringBuffer(element).reverse()).forEach(e-> System.out.println(e));

        String collect2 = Arrays.stream(string.split(" ")).map(myWord -> new StringBuffer(myWord).reverse()).collect(Collectors.joining(" "));
        System.out.println(collect2);

        //19)


        System.out.println("after line 162");
        //22) How do you find the most repeated element in an array?
        List<String> listOfString = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        Map<String, Long> collect3 = listOfString.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(collect3);

        Map.Entry<String, Long> stringLongEntry = collect3.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("max value is:"+stringLongEntry);


        //27) Find first repeated character in a string?

        String inputString1 = "Java Concept Of The Day";
        String[] split = inputString1.split("");

        String s1 = Arrays.stream(inputString1.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).findFirst().map(e -> e.getKey()).get();

        System.out.println(s1);


        System.out.println("online 185");
        //31) How do you get last element of an array?

        List<String> listOfStringss = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        listOfStringss.stream().skip(listOfStringss.size() - 1).collect(Collectors.toList()).forEach(e -> System.out.println(e));


        //*Practice find the second most occuring character in a string
        String string1 = "This is interview meeting for Prateek!";
        String key = Arrays.stream(string1.split("")).collect(Collectors.groupingBy(charecter -> charecter.toString(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(character -> character.getValue() > 1).findFirst().get().getKey();

        System.out.println("after line 213");
        Arrays.stream(string1.split("")).collect(Collectors.groupingBy(charecter -> charecter.toString(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(character -> !character.getKey().contains(" ")).forEach(mapElement-> System.out.println(mapElement.getKey()+" "+mapElement.getValue()));


        //
        System.out.println("after line 225");
        String string2 = "Java Concept Of The Day";
        Arrays.stream(string2.split("")).collect(Collectors.groupingBy(c -> c.toString(), Collectors.counting())).forEach((k,v) -> System.out.println(k+" "+v));


        //largest number possible using these string

        int[] inputArray = {8,6,0,4,6,4,2,7};
        Arrays.stream(inputArray).boxed().sorted(Collections.reverseOrder()).forEach(sys -> System.out.print(sys));

        System.out.println("after line 253");

        //remove vowels from string;
        String myStr = "GeeeksforGeeks - A Computer Science Portal for Geeks";
        System.out.println(myStr.replaceAll("[aeiouAEIOU]",""));

        System.out.println("after line 241");
        //remove vowels from string using streams;

        String myString = "GeeeksforGeeks - A Computer Science Portal for Geeks";
        String collect4 = myString.chars().mapToObj(c -> (char) c).filter(c -> c!='a' & c!='e' & c!='i' & c!='o' & c!='u')
                .map(c -> c.toString())
                .collect(Collectors.joining());
        System.out.println(collect4);




//        findWordsContaining(new String[]{"leet", "code"},'e');
//
//        System.out.println(reversePrefix("hello", 'l'));
//
//        arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"});

        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone","blue","pixel"));
        items.add(Arrays.asList("computer","silver","lenovo"));
        items.add(Arrays.asList("phone","gold","iphone"));

        countMatches(items, "color", "silver");

        int isf = 0;
        Integer sfds = 0;

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int key=0;
        int count=0;
        if(ruleKey == "type"){
            key = 0;
        }else if(ruleKey == "color"){
            key = 1;
        }else{
            key = 2;
        }
        System.out.println(items.size());
        for(int i=0; i<items.size(); i++){
            if(items.get(i).get(key).equals(ruleValue)){
                System.out.println(items.get(i).get(key));
                count++;
            }
        }
        System.out.println(count);
        return count;
    }



    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String firstWord = "";
        String secondWord = "";
        for(int i=0; i<word1.length; i++){
            firstWord =  firstWord.concat(word1[i]);
        }
        System.out.println(firstWord);
        for(int i=0; i<word2.length; i++){
            secondWord = secondWord.concat(word2[i]);
        }
        System.out.println(secondWord);
        if(firstWord.equals(secondWord)){
            return true;
        }else{
            return false;
        }
    }


    public static String reversePrefix(String word, char ch) {
        StringBuffer str = new StringBuffer(word.substring(0,word.indexOf(ch)+1));
        return str.reverse().toString() + word.substring(word.indexOf(ch)+1, word.length());
    }


    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> newList = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            if(words[i].toString().contains(String.valueOf(x))) {
                newList.add(i);
            }
        }

        return newList;
    }
}
