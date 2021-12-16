package pl.kanthak.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kanthak.lesson.Task;
import pl.kanthak.lesson.Task1;

public class TaskTest {

    Task task = new Task();

    @Test
    public void test1() {
        Assertions.assertEquals("SUMMER",  task.solution(new int[]{-3, -14, -5, 7, 8, 42, 8, 3}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals("AUTUMN",  task.solution(new int[]{2, -3, 3, 1, 10, 8, 2, 5, 13, -5, 3, -18}));
    }
}
