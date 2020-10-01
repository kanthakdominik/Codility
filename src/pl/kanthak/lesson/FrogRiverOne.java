package pl.kanthak.lesson;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public int solution(int X, int[] A) {
        int seconds = 0;
        Set<Integer> setOfPositions = new HashSet<>();
        for (int i = 1; i <= X; i++) {
            setOfPositions.add(i);
        }
        for (int i = 0; i < A.length; i++) {
            setOfPositions.remove(A[i]);        //will only remove if element exist in the set
            if (setOfPositions.isEmpty()) {
                return seconds;
            }
            seconds++;
        }
        return -1;
    }
}
