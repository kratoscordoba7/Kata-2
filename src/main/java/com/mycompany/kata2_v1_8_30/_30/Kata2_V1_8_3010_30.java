package com.mycompany.kata2_v1_8_30._30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2_V1_8_3010_30 {

    public static void main(String[] args) { 
        int[] data = {9,2,3,4,5,0,8,1,2,3,9,5,3,6,2,7,3,6,0};
        Map <Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < data.length; i++){
            
            if (map.containsKey(data[i])){
                map.put(data[i], map.get(data[i]) + 1);
            } else {
                map.put(data[i], 1);    
            }
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
    }
}
