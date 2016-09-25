package lv.javaguru.junit.workshop.section1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ArraySortingTest {

    //@Test(expected = IllegalArgumentException.class)
    //@Test(timeout = 100)
    @Test
    public void whenSortEmptyArrayThenIllegalArgumentExceptionIsThrown() {
        try{
            int[] arr = {};
            ArraySorting.sortArray(arr);
            fail(); // if exception was not thrown, that method works incorrectly
        } catch (IllegalArgumentException e){
            assertEquals("array is empty", e.getMessage());
        }
    }

    @Test
    public void whenSortArrayWithOneElementThenNothingHappens() {
        int[] arr = {1};
        ArraySorting.sortArray(arr);
        assertThat(arr[0], is(1));
    }

    @Test
    public void whenSortArrayWithTwoElementInCorrectOrderThenOrderNotChanged() {
        int[] arr = {1, 2};
        ArraySorting.sortArray(arr);
        assertThat(arr[0], is(1));
        assertThat(arr[1], is(2));
    }

    @Test
    public void whenSortArrayWithTwoElementWithNotCorrectOrderThenChangeOrder() {
        int[] arr = {2, 1};
        ArraySorting.sortArray(arr);
        assertThat(arr[0], is(1));
        assertThat(arr[1], is(2));
    }

    @Test
    public void whenSortArrayWithEightElementWithNotCorrectOrderThenChangeOrder() {
        int[] arr = {2, 1, 4, 6, 2 ,7 ,7, 16};
        int[] arrResult = {1, 2, 2, 4, 6, 7, 7, 16};
        ArraySorting.sortArray(arr);
        assertArrayEquals(arrResult,arr);
    }

    @Test
    public void whenSortArrayWithFourElementWithNotCorrectOrderAndZeroThenChangeOrder() {
        int[] arr = {2, 1, 0, 6};
        ArraySorting.sortArray(arr);
        assertThat(arr[0], is(0));
        assertThat(arr[1], is(1));
        assertThat(arr[2], is(2));
        assertThat(arr[3], is(6));
    }

    @Test
    public void whenSortArrayWithFourElementWithNotCorrectOrderAndNegativeThenChangeOrder() {
        int[] arr = {2, 1, 0, -6};
        ArraySorting.sortArray(arr);
        assertThat(arr[0], is(-6));
        assertThat(arr[1], is(0));
        assertThat(arr[2], is(1));
        assertThat(arr[3], is(2));
    }

}