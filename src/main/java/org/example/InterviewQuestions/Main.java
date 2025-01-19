package org.example.InterviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int[] Array = {1, 3, 4, 2, 5, 3, 1, 6, 4};
        findDuplicates(Array);
    }

    private static void findDuplicates(int[] array){
        List<Integer> list = Arrays.stream(array).boxed().toList();
        Set<Integer> integers = new HashSet<>();

        list.stream().filter(object -> !integers.add(object)).forEach(System.out::println);
    }

//    private static void findDuplicates(int[] array) {
//        HashSet<Integer> set = new HashSet<>();
//
//        Arrays.stream(array).filter(n -> !set.add(n))
//                .forEach(System.out::println);
//    }

//    private static void findDuplicates(int[] array) {
//        List<Integer> list = Arrays.stream(array).boxed().toList();
//
//        Map<Integer, Long> listMap = list.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        listMap.entrySet().stream()
//                .filter(entry -> entry.getValue() > 1)
//                .forEach(entry -> System.out.println(entry.getKey()));
//    }

//
//    private static void findDuplicates(int[] array) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int j : array) {
//            if (!set.add(j)) {
//                System.out.println(j);
//            }
//        }
//    }


}
