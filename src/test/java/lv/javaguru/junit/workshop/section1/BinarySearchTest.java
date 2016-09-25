package lv.javaguru.junit.workshop.section1;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Nikolajs on 9/18/2016.
 */
public class BinarySearchTest {



    @Test
    public void checkBinaryPositionOfValueFive(){
        int[] arraySorted = {1,2,3,4,5};
        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.binarySearch(arraySorted, 5);
        assertThat(index, is(4));
    }

    @Test
    public void checkIfIndexIsMinusOneForNonExistingValue(){
        int[] arraySorted = {1,2,3,4,5};
        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.binarySearch(arraySorted, 6);
        assertThat(index, is(-1));
    }

    @Test
    public void checkBinaryPositionOfElementIfArrayIsNotSorted(){
        int[] array = {3,4,5,9,6}; // not valid input
        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.binarySearch(array, 3);
        assertThat(index, is(0));
    }

}