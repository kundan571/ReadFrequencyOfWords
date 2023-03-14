package com.hashtablefrequencyreader;

import java.util.Map;
import java.util.TreeMap;

import static java.lang.String.CASE_INSENSITIVE_ORDER;

public class FrequencyOfWords {

    void countFrequency(String str) {
        Map<String, Integer> map = new TreeMap<>(CASE_INSENSITIVE_ORDER);
        // splitting to find the words
        String arr[] = str.split(" ");
        // Loop to iterate over the words
        for (int i = 0; i < arr.length; i++) {
            // condition to check arr elements is present in HashMap
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        // iterate over words of the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
    public static void main(String[] args) {
        FrequencyOfWords frequencyOfWords = new FrequencyOfWords();
        String str1 = "To be or not to be";
        frequencyOfWords.countFrequency(str1);
        System.out.println();
        String str2 = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        frequencyOfWords.countFrequency(str2);
    }
}
