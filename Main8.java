package dev.lpa;
import java.util.Arrays;
import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {
        System.out.println(49 * 12);


    }

    private static   int readInteger(){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter numbers ");
        int input = scan.nextInt();
        /*String[] numberStrings = input.split(",");
        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i].trim());
        }
        return numbers;*/
        return input;
    }

    private static int[] readElements(int[] nums){  // should be [] to receive an array of integers of one parameter type int
        Scanner scan = new Scanner(System.in);
        int[] elements = new int[nums.length];// This creates an int array named elements with a length equal to the numElements parameter. It will store the entered elements.
        System.out.println("enter" + nums + " elements separated by comas");
        String sarray = scan.nextLine(); // This line reads the user's input as a string. The user is expected to enter the elements separated by commas.in this line  why cant we input the string inputs from user directly to a string array variable?
        String [] sarray1 = sarray.split(",");
        //int[] sarray2 = new int[sarray1.length]; // why should we use the new keyword(creating an object of type int) and why not do the same for string array
        for (int i = 0; i < sarray1.length; i++) {
            elements [i] = Integer.parseInt(sarray1[i].trim());
        }
        return elements;
    }


    private static int findMin(int... array){   //int ...  any number of elements ?

        if(array == null || array.length == 0) {
            throw new IllegalArgumentException("ARRAY MUST NOT BE EMPTY OR NULL");
        } else{

            int min = array[0];

            for(int i = 1;i< array.length;i++){
                if( array[i] < min){
                    min = array[i]; // update the minimum value
                }

            }
            return min;

        }
    }
}
