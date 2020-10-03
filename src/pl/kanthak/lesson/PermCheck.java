package pl.kanthak.lesson;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

    public int solution(int[] A) {

        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= A.length; i++) {
            set.add(i);
        }
        for(int i :A){
            set.remove(i);
        }
        if(set.isEmpty()){
            return 1;
        }
        return 0;
    }
}
