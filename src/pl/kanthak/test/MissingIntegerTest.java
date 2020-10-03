package pl.kanthak.test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kanthak.lesson.MissingInteger;

class MissingIntegerTest {

    MissingInteger missingInteger = new MissingInteger();

    @Test
    void test() {
        Assertions.assertEquals(5, missingInteger.solution(new int[]{1, 3, 6, 4, 1, 2}));
    }

    @Test
    void test1() {
        Assertions.assertEquals(4, missingInteger.solution(new int[]{1, 2, 3}));
    }

    @Test
    void test2() {
        Assertions.assertEquals(1, missingInteger.solution(new int[]{-1, -3}));
    }


}