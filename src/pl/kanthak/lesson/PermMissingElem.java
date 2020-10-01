package pl.kanthak.lesson;

import java.math.BigInteger;

public class PermMissingElem {

    public int solution(int[] A) {
        BigInteger total =
                (BigInteger.valueOf(A.length + 1).multiply(BigInteger.valueOf(A.length + 2))).divide(BigInteger.valueOf(2));
        for (int i : A) {
            total = total.subtract(BigInteger.valueOf(i));
        }
        return total.intValue();
    }
}
