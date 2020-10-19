package pl.kanthak.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kanthak.lesson.PassingCars;

class PassingCarsTest {

    PassingCars passingCars = new PassingCars();

    @Test
    void test() {
        Assertions.assertEquals(5, passingCars.solution(new int[]{0, 1, 0, 1, 1}));
    }
}