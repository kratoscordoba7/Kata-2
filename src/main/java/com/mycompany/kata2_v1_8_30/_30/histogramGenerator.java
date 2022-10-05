package com.mycompany.kata2_v1_8_30._30;

import java.util.HashMap;
import java.util.Map;

public class histogramGenerator<T> {
    private final T[] data;
    public histogramGenerator(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
    
    public Map<T, Integer> getHistogram(){
        Map<T, Integer> histogram = new HashMap<T, Integer>();
            for (int i = 0; i < getData().length; i++) {
                histogram.put(getData()[i], histogram.containsKey(getData()[i]) ? histogram.get(getData()[i]) + 1 : 1);
                
            }
        return histogram;
    }   
}
