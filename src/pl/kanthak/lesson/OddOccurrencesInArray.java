package pl.kanthak.lesson;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
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
