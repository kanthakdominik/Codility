package pl.kanthak.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kanthak.lesson.FrogRiverOne;


class FrogRiverOneTest {

    FrogRiverOne frogRiverOne = new FrogRiverOne();

    @Test
    void test1() {
        Assertions.assertEquals(6, frogRiverOne.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }

    @Test
    void test2() {
        Assertions.assertEquals(-1, frogRiverOne.solution(6, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }
}