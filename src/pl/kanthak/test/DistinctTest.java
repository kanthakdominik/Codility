package pl.kanthak.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kanthak.lesson.Distinct;


class DistinctTest {

    Distinct distinct = new Distinct();

    @Test
    void test() {
        Assertions.assertEquals(3, distinct.solution(new int[]{2, 1, 1, 2, 3, 1}));
    }

}