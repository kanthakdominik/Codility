package pl.kanthak;

import java.util.*;

public class BinaryGap {

    public static void main(String[] args) {
        int N = 9;
        System.out.println(solution(N));
    }

    static public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int counter = 0;
        List<Integer> counters = new ArrayList<>();

        for (int i =0; i < binary.length(); i++){
            if(binary.charAt(i) == '0'){
                counter++;
            }
            else {
                counters.add(counter);
                counter=0;
            }
        }
        return Collections.max(counters);
    }

}
