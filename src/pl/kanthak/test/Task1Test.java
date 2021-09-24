package pl.kanthak.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kanthak.lesson.Task1;

public class Task1Test {

    Task1 task1 = new Task1();

    @Test
    public void test() {
        Assertions.assertEquals(4, task1.solution(955));
    }

    @Test
    public void test1() {
        Assertions.assertEquals(4, task1.solution(955));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(5, task1.solution(1651));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(-1, task1.solution(10000));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(-1, task1.solution(9));
    }

    @Test
    public void test5() {
        Assertions.assertEquals(-1, task1.solution(13));
    }

    @Test
    public void test6() {
        Assertions.assertEquals(1, task1.solution(Integer.MAX_VALUE));
    }
}
