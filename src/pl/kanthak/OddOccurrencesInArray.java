package pl.kanthak;

import java.util.*;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {

        Set<Integer> elements = new HashSet<>();
        for (int x : A) {
            if (!elements.remove(x)) {
                elements.add(x);
            }
            System.out.println(elements);
        }
        return elements.iterator().next();
    }
}
