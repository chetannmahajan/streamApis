package org.example.LinkedList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainTest {

    public static void main(String[] args) throws Throwable {

        int[][] array = {{1,2},{2,5},{6,0},{9,5}};
        //sum of last columm 2,5,0,5


        int sum = IntStream.range(0, 4).map(i -> array[i][1]).sum();
        System.out.println(sum);



        Optional<String> s = Optional.ofNullable(checkVariable()).orElseThrow(Throwable::new).describeConstable();
        System.out.println(s);

    }

    public static String checkVariable(){
        return null;
    }
}
