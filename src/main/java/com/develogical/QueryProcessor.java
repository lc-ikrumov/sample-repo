package com.develogical;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class QueryProcessor {

    public String process(String query) {
        StringTokenizer init = new StringTokenizer(query, ":");
        init.nextToken();
        String question = init.nextToken();
        
        if(question.contains("largest")) {
            String numbers = init.nextToken();
        StringTokenizer nums = new StringTokenizer(numbers, ",");
        
       //String[] numbers = parts[1].split(",");
        Integer max = 0;
        while(nums.hasMoreTokens()) {
            String token = nums.nextToken().trim();
            if(Integer.parseInt(token) > max) {
                max = Integer.parseInt(token);
            }
            return max.toString();
        }
        }  else if( question.contains("primes")){
            String numbers = init.nextToken();
        StringTokenizer nums = new StringTokenizer(numbers, ",");
        
       //String[] numbers = parts[1].split(",");
        Integer max = 0, i = 0;
        String primes = "";
        while(nums.hasMoreTokens()) {
           
           String token = nums.nextToken();
           if(isPrime(Integer.parseInt(token))) {
               primes += (i==0? "" : ",") + Integer.parseInt(token);
           }
           i++;
        }
        return primes;
        }
           
        return "";
    }
    
    boolean isPrime(int n) {
    for(int i=2;i<n;i++) {
        if(n%i==0)
            return false;
    }
    return true;
}
}
