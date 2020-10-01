package pl.kanthak.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kanthak.lesson.BinaryGap;

class BinaryGapTest {

    BinaryGap binaryGap = new BinaryGap();

    @Test
    void test() {
        Assertions.assertEquals(2, binaryGap.solution(9));
    }
}