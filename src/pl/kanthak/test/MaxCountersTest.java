package pl.kanthak.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kanthak.lesson.MaxCounters;

class MaxCountersTest {

    MaxCounters maxCounters = new MaxCounters();

    @Test
    public void test() {
        Assertions.assertArrayEquals(new int[]{3, 2, 2, 4, 2}, maxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }

}