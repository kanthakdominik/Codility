package pl.kanthak.lesson;

public class PassingCars {
    public int solution(int[] A) {
        long counter = 0;
        int x = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                x++;
            } else {
                counter += x;
            }
        }
        if (counter <= 1000000000) {
            return (int) counter;
        }
        return -1;
    }
}
