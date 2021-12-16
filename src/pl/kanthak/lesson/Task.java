package pl.kanthak.lesson;

import java.util.*;

public class Task {

    public String solution(int[] T) {
        int amountOfTemp = T.length / 4;

        Map<String, Integer> highestTempAmplitudes = new HashMap<>();

        SortedSet<Integer> winterTemp = new TreeSet<>();
        SortedSet<Integer> springTemp = new TreeSet<>();
        SortedSet<Integer> summerTemp = new TreeSet<>();
        SortedSet<Integer> autumnTemp = new TreeSet<>();

        for (int i = 0; i < amountOfTemp; i++) {
            winterTemp.add(T[i]);
        }
        for (int i = amountOfTemp; i < 2 * amountOfTemp; i++) {
            springTemp.add(T[i]);
        }
        for (int i = 2 * amountOfTemp; i < 3 * amountOfTemp; i++) {
            summerTemp.add(T[i]);
        }
        for (int i = 3 * amountOfTemp; i < 4 * amountOfTemp; i++) {
            autumnTemp.add(T[i]);
        }

        highestTempAmplitudes.put("WINTER", winterTemp.last() - winterTemp.first());
        highestTempAmplitudes.put("SPRING", springTemp.last() - springTemp.first());
        highestTempAmplitudes.put("SUMMER", summerTemp.last() - summerTemp.first());
        highestTempAmplitudes.put("AUTUMN", autumnTemp.last() - autumnTemp.first());

        return Collections.max(highestTempAmplitudes.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
