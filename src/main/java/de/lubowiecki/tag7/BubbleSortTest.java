package de.lubowiecki.tag7;

import java.util.Arrays;

public class BubbleSortTest {

    public static void main(String[] args) {

        int[] zahlen = {5,3,7,1,-15,22,6,0};
        zahlen = bubbleSort(zahlen);
        System.out.println(Arrays.toString(zahlen));

    }

    private static int[] bubbleSort(int[] zahlen) {

        for(int i = 1; i < zahlen.length; i++) {
            for(int j = 0; j < zahlen.length - i; j++) {
                if(zahlen[j] > zahlen[j+1]) { // Wenn größer, dann Positionen tauschen
                    int temp = zahlen[j];
                    zahlen[j] = zahlen[j+1];
                    zahlen[j+1] = temp;
                }
            }
        }
        return zahlen;
    }
}
