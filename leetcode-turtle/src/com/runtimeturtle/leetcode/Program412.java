package com.runtimeturtle.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Program412 {

    public List<String> fizzBuzz(int n) {
        String fizz = "Fizz";
        String buzz = "Buzz";
        List<String> op1 = new ArrayList<>();
        for(int i = 1; i < n+1; i++){
            if(i % 15 == 0){
                op1.add(fizz + buzz);
            }else if(i % 3 == 0){
                op1.add(fizz);
            }else if(i % 5 == 0){
                op1.add(buzz);
            }else{
                op1.add(i + "");
            }
        }
       
       /* Other Solution*/
       List<String> op2 = new ArrayList<>();
       for(int i = 1; i <= n ; i++) {
    	   String temp = "";
    	   if(i % 3 == 0) {
    		   temp = temp + fizz;
    	   }
    	   if(i % 5 == 0) {
    		   temp = temp + buzz;
    	   }
    	   if(temp.isEmpty()) {
    		   temp = String.valueOf(i);
    	   }
    	   op2.add(temp);
       }

       // return op1;       
       return op2;
    }
	
}
