package pl.kanthak.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kanthak.lesson.FrogJmp;

class FrogJmpTest {

    FrogJmp frogJmp = new FrogJmp();

    @Test
    void test() {
        Assertions.assertEquals(3, frogJmp.solution(10, 80, 30));
    }

}