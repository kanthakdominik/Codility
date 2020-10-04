package pl.kanthak.lesson;

public class MaxCounters {

    public int[] solution(int N, int[] A) {
        int maxCounter = 0;
        int minValue = 0;
        int[] array = new int[N];      // no need to initialize (because the values are "0" by default)
        for (int i : A) {
            if (i <= N && i >= 1) {
                if (array[i - 1] < minValue) {
                    array[i - 1] = minValue;
                }
                array[i - 1]++;
                if (array[i - 1] > maxCounter) {
                    maxCounter = array[i - 1];
                }
            } else if (i == N + 1) {
                minValue = maxCounter;
            }
        }
        for(int i =0; i< array.length; i++){        //we have to move the second loop outside the first loop
            if(array[i] < minValue){
                array[i] = minValue;
            }
        }
        return array;
    }

}