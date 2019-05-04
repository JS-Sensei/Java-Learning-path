package vol1.chap3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A simple Class to put Java Array to work
 * @author nlekane
 * @version 1.0 02-05-2019
 */
public class LoterryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();

        //Fill an array with numbers 1, 2, 3, ...., n
        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        //Draw k numbers and put them into a second array
        int[] result = new int[k];
        for(int i = 0; i< result.length; i++) {
            //Make a random decision between 0 and n - 1
            int r = (int) (Math.random() * n);

            //Pick the element at the random location
            result[i] = numbers[r];

            //Move the last elememt into the random location
            numbers[r] = numbers[n -1];
            n--;
        }

        //print the sorted Array
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        for( int r : result ) {
            System.out.println(r);
        }
    }
}
