package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> resultMap = new HashMap<>();
        if (sentence.isEmpty()) return resultMap;

        String[] sentenceArr = sentence
                .replace(".","")
                .replace(",","")
                .toLowerCase()
                .split(" ");

        int value = 1;
        for (int i = 0; i < sentenceArr.length; i++) {
            value = 1;
            for (int j = i + 1; j < sentenceArr.length; j++) {
                if (sentenceArr[i].equals(sentenceArr[j])) value++;
            }
            resultMap.putIfAbsent(sentenceArr[i], value);
        }

        return resultMap;
    }
}
