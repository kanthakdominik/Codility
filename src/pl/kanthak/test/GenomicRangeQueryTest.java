package pl.kanthak.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kanthak.lesson.GenomicRangeQuery;

class GenomicRangeQueryTest {

    GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();

    @Test
    public void test() {
        Assertions.assertArrayEquals(new int[]{2, 4, 1},
                genomicRangeQuery.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}));
    }

}