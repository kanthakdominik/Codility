package pl.kanthak.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kanthak.lesson.CountDiv;

class CountDivTest {

    CountDiv countDiv = new CountDiv();

    @Test
    public void test() {
        Assertions.assertEquals(3, countDiv.solution(6, 11, 2));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(2000000001, countDiv.solution(0, 2000000000, 1));
    }


}