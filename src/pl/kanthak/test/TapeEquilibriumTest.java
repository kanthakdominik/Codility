package pl.kanthak.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kanthak.lesson.TapeEquilibrium;

class TapeEquilibriumTest {

    TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    @Test
    void test() {
        Assertions.assertEquals(1, tapeEquilibrium.solution(new int[] {3, 1, 2, 4, 3}));
    }

}