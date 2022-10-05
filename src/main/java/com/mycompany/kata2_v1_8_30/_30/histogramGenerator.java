package com.mycompany.kata2_v1_8_30._30;

import java.util.HashMap;
import java.util.Map;

public class histogramGenerator {
    private final int[] data;
    public histogramGenerator(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }
    
    public Map<Integer, Integer> getHistogram(){
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
            for (int i = 0; i < getData().length; i++) {
                histogram.put(getData()[i], histogram.containsKey(getData()[i]) ? histogram.get(getData()[i]) + 1 : 1);
                
            }
        return histogram;
    }    
}
