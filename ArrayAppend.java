// Rodrigo Ferreira Maceno
// This program uses a custom implementation for appending an item to an array in Java.

import java.util.Arrays;

public class ArrayAppend {

    public static <T> T[] arrayAppend(T[] array, T newItem) {
        
        int currentSize = array.length;
    
        T[] newArray = Arrays.copyOf(array, currentSize + 1);
        
        newArray[currentSize] = newItem;
        
        return newArray;
    
    }

    public static void main(String[] args) {

        String[] myArray = { "G", "H", "T" };
        
        Integer[] numbers = {1,2,3};

        myArray = arrayAppend(myArray, "Z");

        System.out.println(Arrays.toString(myArray));

        numbers = arrayAppend(numbers, 4);

        System.out.println(Arrays.toString(numbers));

    }
}