package com.runtimeturtle.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Program412 {

    public List<String> fizzBuzz(int n) {
        String fizz = "Fizz";
        String buzz = "Buzz";
        List<String> op = new ArrayList<>();
        for(int i = 1; i < n+1; i++){
            if(i % 15 == 0){
                op.add(fizz + buzz);
            }else if(i % 3 == 0){
                op.add(fizz);
            }else if(i % 5 == 0){
                op.add(buzz);
            }else{
                op.add(i + "");
            }
        }
       return op;
    }
	
}
