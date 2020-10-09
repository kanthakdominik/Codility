package pl.kanthak.lesson;

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        int[][] impactFactorsPrefixSum = new int[4][S.length() + 1];
        int[] answerArray = new int[P.length];
        int amountOfA, amountOfC, amountOfG, amountOfT;
        for (int i = 0; i < S.length(); i++) {
            amountOfA = 0;
            amountOfC = 0;
            amountOfG = 0;
            amountOfT = 0;
            switch (S.charAt(i)) {
                case 'A':
                    amountOfA = 1;
                    break;
                case 'C':
                    amountOfC = 1;
                    break;
                case 'G':
                    amountOfG = 1;
                    break;
                case 'T':
                    amountOfT = 1;
                    break;
                default:
                    break;
            }
            impactFactorsPrefixSum[0][i + 1] = impactFactorsPrefixSum[0][i] + amountOfA;
            impactFactorsPrefixSum[1][i + 1] = impactFactorsPrefixSum[1][i] + amountOfC;
            impactFactorsPrefixSum[2][i + 1] = impactFactorsPrefixSum[2][i] + amountOfG;
            impactFactorsPrefixSum[3][i + 1] = impactFactorsPrefixSum[3][i] + amountOfT;
        }
        for (int i = 0; i < P.length; i++) {
            if (impactFactorsPrefixSum[0][Q[i] + 1] - impactFactorsPrefixSum[0][P[i]] >= 1) {
                answerArray[i] = 1;
            } else if (impactFactorsPrefixSum[1][Q[i] + 1] - impactFactorsPrefixSum[1][P[i]] >= 1) {
                answerArray[i] = 2;
            } else if (impactFactorsPrefixSum[2][Q[i] + 1] - impactFactorsPrefixSum[2][P[i]] >= 1) {
                answerArray[i] = 3;
            } else if (impactFactorsPrefixSum[3][Q[i] + 1] - impactFactorsPrefixSum[3][P[i]] >= 1) {
                answerArray[i] = 4;
            }
        }
        return answerArray;
    }
}