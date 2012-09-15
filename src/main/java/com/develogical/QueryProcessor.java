package com.develogical;

import java.util.StringTokenizer;

public class QueryProcessor {

    public String process(String query) {
        StringTokenizer init = new StringTokenizer(query, ":");
        init.nextToken();
        init.nextToken();
        String numbers = init.nextToken();
        StringTokenizer nums = new StringTokenizer(numbers, ",");
        
       //String[] numbers = parts[1].split(",");
        Integer max = 0;
        while(nums.hasMoreTokens()) {
            String token = nums.nextToken();
            if(Integer.parseInt(token.trim()) > max) {
                max = Integer.parseInt(token);
            }
        }
       
        
        return max.toString();
        
    }
}
