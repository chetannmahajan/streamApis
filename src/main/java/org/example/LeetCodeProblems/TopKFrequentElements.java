package org.example.LeetCodeProblems;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1,2,1,2,3,1,3,3,3,2,4,4};
        int k = 3;
        List<Integer>[] bucket = new List[nums.length];

        HashMap<Integer, Integer> numsFrequencies = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!numsFrequencies.containsKey(nums[i])){
                numsFrequencies.put(nums[i], 1);
            }else{
                Integer frequency = numsFrequencies.get(nums[i]);
                numsFrequencies.put(nums[i], frequency+1);
            }
        }

        numsFrequencies.forEach((key,v) -> System.out.println("key: "+key+" value:"+v));

        Set<Integer> integers = numsFrequencies.keySet();
        System.out.println(integers);
        for(int i: integers){
            Integer frequency = numsFrequencies.get(i);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(i);
        }

        int[] result = new int[k];
        int count=0;
        for(int i=bucket.length-1; i>=0 && count<k; i--){
            if(bucket[i] != null) {
                for (int value : bucket[i]) {
                    if(count < k) {
                        result[count++] = value;
                    }
                }
            }
        }

        System.out.println("value of result array: ");
        System.out.println(Arrays.toString(result));





        numsFrequencies.entrySet().stream().filter(entry -> entry.getKey() <= k)
                .toList().stream().mapToInt(mapObj -> Integer.valueOf(mapObj.getKey())).toArray();
    }
}
