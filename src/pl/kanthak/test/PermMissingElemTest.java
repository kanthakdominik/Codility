package pl.kanthak.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kanthak.lesson.PermMissingElem;

class PermMissingElemTest {

    PermMissingElem permMissingElem = new PermMissingElem();

    @Test
    void test() {
        Assertions.assertEquals(4, permMissingElem.solution(new int[]{2, 3, 1, 5}));
    }

}