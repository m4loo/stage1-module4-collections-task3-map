package com.epam.mjc.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        return functionMap.containsValue(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < sourceList.size(); i++) {
            Integer integer = 5 * sourceList.get(i) + 2;
            newList.add(integer);
            resultMap.put(sourceList.get(i), newList.get(i));
        }
        return resultMap;
    }
}
