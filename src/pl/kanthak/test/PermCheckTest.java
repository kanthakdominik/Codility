package pl.kanthak.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kanthak.lesson.PermCheck;

class PermCheckTest {

    PermCheck permCheck = new PermCheck();

    @Test
    void test() {
        Assertions.assertEquals(1, permCheck.solution(new int[]{4, 1, 3, 2}));
    }

    @Test
    void test2() {
        Assertions.assertEquals(0, permCheck.solution(new int[]{4, 1, 3}));
    }

    @Test
    void test3() {
        Assertions.assertEquals(0, permCheck.solution(new int[]{2,3,4,5}));
    }

}