package pl.kanthak.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kanthak.lesson.MinAvgTwoSlice;

class MinAvgTwoSliceTest {

    MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();

    @Test
    public void test() {
        Assertions.assertEquals(1, minAvgTwoSlice.solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
    }

//    @Test
//    public void test1() {
//        Assertions.assertEquals(1, minAvgTwoSlice.solution(new int[]{1,2,3}));
//    }
//
//    @Test
//    public void test2() {
//        Assertions.assertEquals(1, minAvgTwoSlice.solution(new int[]{5,6,1,2}));
//    }
}