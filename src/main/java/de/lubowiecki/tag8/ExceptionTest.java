package de.lubowiecki.tag8;

public class ExceptionTest {

    public static void main(String[] args) {

        // CheckedExceptions MÜSSEN behandelt werden



        // UncheckedExceptions KÖNNEN behandelt werden

        // Alle UncheckedExceptions sind RuntimeExceptions
        int[] arr = new int[10];
        //arr[10] = 1000; // ArrayIndexOutOfBoundsException

        String str = null;
        //System.out.println(str.toUpperCase()); // NullPointerException

        // int[] arr2 = new int[-10]; // NegativeArraySizeException

        //int i = Integer.parseInt("ABC"); // NumberFormatException

        try {
            // Code, die eine Exception produzieren könnte
            //int[] arr3 = new int[10];
            int[] arr3 = null; // NullPointerException
            arr3[10] = 1000; // ArrayIndexOutOfBoundsException
        }
        catch(ArrayIndexOutOfBoundsException e) {
            // Gegenmaßnahmen, wenn eine Exception auftaucht
            // in e befindet sich ein Objekt der Exception
            // e.printStackTrace();
            //System.out.println(e.getMessage());
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException");
        }
        catch(NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException");
        }
        catch(RuntimeException e) {
            System.out.println("RuntimeException");
        }
        catch(Exception e) {
            System.out.println("Exception");
        }


        System.out.println("ENDE");
    }
}
