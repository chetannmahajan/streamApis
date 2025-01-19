package org.example.InterviewCodingQuestions;

import java.util.ArrayList;

public class FlatternArray {

    public static void main(String[] args) throws Exception{
        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };

        ArrayList<Integer> objects = new ArrayList<>();
//        flattenArray(array,objects);
//        objects.forEach(System.out::println);
        Integer[] flatten = flatten(array, objects);
        objects.forEach(System.out::println);


    }

    public static Integer[] flatten(Object[] Array, ArrayList<Integer> objects){
        int length = Array.length;
        Integer[] integers = new Integer[length];
        for (int i=0; i<length; i++){
            if(Array[i] instanceof Object[]){
                flatten((Object[]) Array[i], objects);
            }else{
               objects.add((Integer) Array[i]);
            }
        }
        return integers;
    }

//    public static void flattenArray(Object[] array, List<Integer> flatList) {
//        for (Object element : array) {
//            if (element instanceof Object[]) {
//                // If the element is an array, call the method recursively
//                flattenArray((Object[]) element, flatList);
//            } else {
//                // Otherwise, add the element to the flat list
//                flatList.add((Integer) element);
//            }
//        }
//    }

//    public static void main(String[] args) {
//        int arr1[] = {1, 3, 5, 1, 2, 8, 7};
//
//        int arr2[] = {2, 4, 6, 8};
//
//
//        Set<Integer> arr3 = mergeArrays(arr1, arr2);
//
//        System.out.println("Array after merging - " + arr3);
//    }
//
//    public static Set<Integer> mergeArrays(int[] arr1, int[] arr2) {
//        Set<Integer> answer = new HashSet<Integer>();
//        for(int i=0;i<arr1.length;i++){
//            answer.add(arr1[i]);
//        }
//        for(int i=0;i<arr2.length;i++){
//            answer.add(arr2[i]);
//        }
//        return answer;
//    }
}
