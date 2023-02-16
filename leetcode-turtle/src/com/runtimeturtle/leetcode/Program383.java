package com.runtimeturtle.leetcode;

import java.util.Arrays;

public class Program383 {

	public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        String[] ransomeNoteArray = ransomNote.split("");
        String[] magazineArray = magazine.split("");
        Arrays.sort(ransomeNoteArray);
        Arrays.sort(magazineArray);
        int j = 0;
        boolean isTrue = false;
        for(int i = 0; i < magazine.length(); i++){
            if(ransomeNoteArray[j].equals(magazineArray[i])){
                j++;
            }
            if(j == ransomNote.length()){
                isTrue = true;
                break;
            }
        }
        return isTrue;
    }

}
