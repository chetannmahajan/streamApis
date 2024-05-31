package org.example;
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String firstWord = "";
        String secondWord = "";
        for(int i=0; i<word1.length; i++){
            firstWord.concat(word1[i]);
        }
        System.out.println(firstWord);
        for(int i=0; i<word2.length; i++){
            secondWord.concat(word2[i]);
        }
        System.out.println(secondWord);
        if(firstWord.equals(secondWord)){
            return true;
        }else{
            return false;
        }
    }
}
