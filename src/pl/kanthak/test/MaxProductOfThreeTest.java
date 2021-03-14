package pl.kanthak.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kanthak.lesson.MaxProductOfThree;

class MaxProductOfThreeTest {

    MaxProductOfThree maxProductOfThree = new MaxProductOfThree();

    @Test
    void test() {
        Assertions.assertEquals(60, maxProductOfThree.solution(new int[]{-3, 1, 2, -2, 5, 6}));
    }

    @Test
    void test2() {
        Assertions.assertEquals(1000, maxProductOfThree.solution(new int[]{1, 10, 100}));
    }

    @Test
    void test3() {
        Assertions.assertEquals(1000, maxProductOfThree.solution(new int[]{10, 10, 10}));
    }

    @Test
    void test4() {
        Assertions.assertEquals(125, maxProductOfThree.solution(new int[]{-5, 5, -5, 4}));
    }
}