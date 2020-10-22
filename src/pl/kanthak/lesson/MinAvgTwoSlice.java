package pl.kanthak.lesson;

public class MinAvgTwoSlice {

    public int solution(int[] A) {
        double min2, min3;
        double min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < A.length - 2; i++) {
            min2 = (A[i] + A[i + 1]) / 2.0;
            min3 = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
            if (Math.min(min2, min3) < min) {
                min = Math.min(min2, min3);
                index = i;
            }
        }
        if (((A[A.length - 2] + A[A.length - 1]) / 2.0) < min) {
            index = A.length - 2;
        }
        return index;
    }
}