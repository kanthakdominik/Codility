package pl.kanthak;

import java.math.BigInteger;

public class PermMissingElem {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 6};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        BigInteger total =
                (BigInteger.valueOf(A.length+1).multiply(BigInteger.valueOf(A.length+2))).divide(BigInteger.valueOf(2));
        for (int i : A) {
            total = total.subtract(BigInteger.valueOf(i));
        }
        return total.intValue();
    }
}
