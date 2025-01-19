package org.example;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //a)Create a List and filter all even numbers from list
        List<Integer> integersList = List.of(2,4,50,21,22,67);

        //Without stream
        List<Integer> listEven = new ArrayList<>();

        for(Integer i: integersList){
            if(i%2==0){
                listEven.add(i);
            }
        }

        System.out.println(listEven);

        //With Streams
//        Stream<Integer> stream = integersList.stream();
//        List<Integer> evenIntegerList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(evenIntegerList);

//        List<Integer> evenIntegersList = integersList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(evenIntegersList);

//        List<Integer> integersBiggerThan10 = integersList.stream().filter(i -> i > 10).collect(Collectors.toList());
//        System.out.println(integersBiggerThan10);

//        System.out.println(integersList.stream().filter(i -> i > 10).collect(Collectors.toList()));
//
//        String names[] = {"chetan", "rahul", "nikhil", "hari"};
//        Stream.of(names).forEach(i ->{
//            System.out.println(i);
//        });

        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee("Chetan Mahajan", "sadf234", "Pune"));
        employeesList.add(new Employee("Rahul khod","asdfasf2w34","Pune"));
        employeesList.add(new Employee("Nikhil Patil", "dfas234","Mumbai"));
        employeesList.add(new Employee("Gitesh Patil","asdf23", "Banglore"));
        employeesList.add(new Employee("Hello world", "2we4", "Delhi"));

        //convert list to map
        //Key = name and value = id
        Map<String, String> collectMap = employeesList.stream().collect(Collectors.toMap(employee -> employee.getName(), employee -> employee.getId()));

        collectMap.forEach((k,v) -> System.out.println(k+" "+v));

        System.out.println("after groupBy city");

        //print groupBy City
        Map<String, List<Employee>> collectGroupByCity = employeesList.stream().collect(Collectors.groupingBy(employee -> employee.getCity()));
        collectGroupByCity.forEach((k,v) -> System.out.println(k+" "+v));

        //multiply array elements
        Integer[] intArray = {1,2,3,4,5,6};
        List<Integer> integersList1 = Arrays.asList(intArray);

        Optional<Integer> multipliedIntegerArray = integersList1.stream().reduce((a, b) -> a*b);
        System.out.println(multipliedIntegerArray.get());


        String inputString = "ilovejavatechie";
        System.out.println("online 73");
        Map<Character, Long> collect = inputString.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        collect.entrySet().stream().filter(i -> i.getValue()>=2).map(x -> x.getKey()).forEach(k -> System.out.println(k));
        Set<Map.Entry<Character, Long>> entries = collect.entrySet();
        System.out.println("after line 77");
        entries.forEach(entrie -> System.out.println(entrie.getKey()+" "+entrie.getValue()));

        System.out.println("online 80");
        //first non repeating element in a string
        Character key = inputString
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c -> c.getValue() == 1)
                .findFirst().get().getKey();

        System.out.println(key);

        System.out.println("after line 93");
        //write java program to find second highest
        int[] numbers = {5,9,11,2,8,21,1};
        Integer integer = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(integer);


        System.out.println("after line 100");
        //write jav program to find longest string from given array
        String[] strArray= {"java","techie","springBoot","microservices"};

        String longestString = Arrays.asList(strArray).stream().reduce((word1, word2) -> word1.length() > word2.length()? word1 : word2).get();
        System.out.println(longestString);


        System.out.println("online 109");


    }
}