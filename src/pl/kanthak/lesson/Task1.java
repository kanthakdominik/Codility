package pl.kanthak.lesson;

public class Task1 {

    public int solution(int n) {
        int[] d = new int[31];                      //Changed from int[30] to int[31]
        int l = 0;
        int p;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            l++;
        }
        for (p = 1; p < 1 + l/2; ++p) {             //Changed from 1+l to 1+l/2
            int i;
            boolean ok = true;
            for (i = 0; i < l - p; ++i) {
                if (d[i] != d[i + p]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                return p;
            }
        }
        return -1;
    }
}
