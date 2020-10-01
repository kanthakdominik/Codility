package pl.kanthak.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kanthak.lesson.CyclicRotation;

class CyclicRotationTest {

    CyclicRotation cyclicRotation = new CyclicRotation();

    @Test
    void test() {
        Assertions.assertArrayEquals(new int[]{3, 4, 1, 2}, cyclicRotation.solution(new int[]{1, 2, 3, 4}, 2));
    }
}