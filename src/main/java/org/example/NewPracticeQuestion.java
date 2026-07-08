package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class NewPracticeQuestion {

    public static void main(String[] args) {

        //1) Given a list of integers, separate odd and even numbers?
        int[] array = {71, 18, 42, 21, 67, 32, 95, 14, 56, 87};

        Arrays.stream(array).boxed().collect(Collectors.partitioningBy(i -> i % 2 == 0));

    }
}
