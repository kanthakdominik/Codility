package pl.kanthak.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kanthak.lesson.OddOccurrencesInArray;

class OddOccurrencesInArrayTest {

    OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

    @Test
    void test() {
        Assertions.assertEquals(7, oddOccurrencesInArray.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

}