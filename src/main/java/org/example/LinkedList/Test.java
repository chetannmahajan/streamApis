package org.example.LinkedList;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        String inputString = "hisisnterviewProcessforSushilLahade";
        //find first not repeating elements
        char[] charArray = inputString.toCharArray();
        Map <Character, Integer> map = new LinkedHashMap<>();
        List<Character> l = new ArrayList<>();
        for (char element : charArray){
            l.add(element);
        }

        l.stream().forEach(e -> {map.put(e, map.getOrDefault(e,0) +1);
        });

        for(Map.Entry e :map.entrySet()){
            if(e.getValue() == (Integer) 1){
                System.out.println(e.getKey());
                break;
            }
        }

        }

    }

