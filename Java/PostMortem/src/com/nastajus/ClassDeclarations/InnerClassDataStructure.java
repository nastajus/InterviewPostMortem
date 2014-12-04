package com.nastajus.ClassDeclarations;

/**
 * Created by IAN on 03/12/14.
 * URL: https://docs.oracle.com/javase/tutorial/java/javaOO/innerclasses.html
 */
public class InnerClassDataStructure {

    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public InnerClassDataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {

        // Print out values of even indices of the array
        java.util.Iterator<Integer> iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface

    public class EvenIterator implements java.util.Iterator<Integer>{
    //DataStructureIterator

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext() {

            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {

            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String s[]) {

        // Fill the array with integer values and print out only
        // values of even indices
        InnerClassDataStructure ds = new InnerClassDataStructure();
        ds.printEven();
    }
}
