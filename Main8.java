/*Write a method called readInteger() that has no parameters and returns an int.

        It needs to read in an integer from the user - this represents how many elements the user needs to enter.



        Write another method called readElements() that has one parameter of type int

        The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.



        And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.



        The scenario is:

        1. readInteger() is called.

        2. The number returned by readInteger() is then used to call readElements().

        3. The array returned from readElements() is used to call findMin().

        4. findMin() returns the minimum number.

        [Do not try and implement this. It is to give you an idea of how the methods will be used]



        TIP: Assume that the user will only enter numbers, never letters.

        TIP: Instantiate (create) the Scanner object inside the method. There are two scanner objects, one for each of the two methods that are reading in input from the user.

        TIP: Be extremely careful about spaces in the printed message.



        NOTE: All methods should be defined as private static.

        NOTE: Do not add a main method to the solution code.*/




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
