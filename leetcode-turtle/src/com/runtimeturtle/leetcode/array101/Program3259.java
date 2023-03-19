package com.runtimeturtle.leetcode.array101;

/**
 * {@link}https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/
 * {@link}https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 *
 * @author white-parrot
 */
class Program3259 {

    public int[] replaceElements(int[] arr) {
        /* 17,18,5,4,6,1 */
        for(int i = 1; i < arr.length; i++){
            int max = arr[i];
            for(int j = i; j < arr.length; j++){
                if(max < arr[j]){
                    max = arr[j];
                }
            }
            arr[i - 1] = max;
        }
        /* Edge Case : Add -1 to the last element*/
        arr[arr.length - 1] = -1;
        return arr;
    }
}