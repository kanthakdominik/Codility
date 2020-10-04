package pl.kanthak.lesson;

public class CountDiv {

    public int solution(int A, int B, int K) {
        int divisibleFromB = B / K;
        int divisibleFromA = A / K;
        int divisible = divisibleFromB- divisibleFromA;

        if(A % K ==0){                 //the loop can not be used,because need to achieve low complexity - O(1)
            divisible++;
        }
        return divisible;
    }
}
