package pl.kanthak.lesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryGap {

    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int counter = 0;
        List<Integer> counters = new ArrayList<>();

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                counter++;
            } else {
                counters.add(counter);
                counter = 0;
            }
        }
        return Collections.max(counters);
    }
}
