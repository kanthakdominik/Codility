package pl.kanthak;

public class TapeEquilibrium {

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4, 3};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int sumAll = 0;
        int sumRight = 0;
        int sumLeft;
        int difference=Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            sumAll += A[i];
        }

        for (int i = A.length - 1; i > 0; i--) {
            sumRight += A[i];
            sumLeft = sumAll - sumRight;
            if(Math.abs(sumRight-sumLeft) < difference){
                difference = Math.abs(sumRight-sumLeft);
            }
        }
        return difference;
    }
}
