package lv.javaguru.junit.workshop.section2;

public class BubbleSort {

    public void sort(int[] unsortedArray) {
        int temp, counter, index;

        int length = unsortedArray.length;

        for(counter=0; counter<length-1; counter++) { //Loop once for each element in the array.
            for(index=0; index<length-1-counter; index++) { //Once for each element, minus the counter.
                if(unsortedArray[index] > unsortedArray[index+1]) { //Test if need a swap or not.
                    temp = unsortedArray[index]; //These three lines just swap the two elements:
                    unsortedArray[index] = unsortedArray[index+1];
                    unsortedArray[index+1] = temp;
                }
            }
        }
    }

}
