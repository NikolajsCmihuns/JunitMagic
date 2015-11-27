package lv.javaguru.junit.workshop.section1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ArraySortingTest {

    @Test
    public void testArrayWithOneElement() {
        int[] arr = {1};
        ArraySorting.sortArray(arr);
        assertThat(arr[0], is(1));
    }

}