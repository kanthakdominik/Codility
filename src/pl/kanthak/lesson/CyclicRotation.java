package pl.kanthak.lesson;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        int buffer;
        if (A.length == 0) {
            return A;
        }
        for (int i = 0; i < K; i++) {
            buffer = A[A.length - 1];
            for (int j = A.length - 1; j > 0; j--) {
                A[j] = A[j - 1];
            }
            A[0] = buffer;
        }
        return A;
    }
}
