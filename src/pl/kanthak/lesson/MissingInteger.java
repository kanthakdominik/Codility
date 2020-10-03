package pl.kanthak.lesson;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int i : A){
            set.add(i);
        }
        int maxInteger = Collections.max(set);
        for(int i = 1; i <= maxInteger; i++){
            if ((!set.contains(i))) {
                return i;
            }
            if(i == maxInteger){
               return maxInteger +1;
            }
        }
        return 1;
    }
}
