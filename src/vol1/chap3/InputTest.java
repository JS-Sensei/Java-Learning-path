package vol1.chap3;

import java.util.Scanner;

/**
 * Simple Input test program
 * @version 1.0 01-05-2019
 * @author nlekane
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = in.nextLine();

        System.out.println("How old are you? ");
        int age = in.nextInt();

        //Display Output
        System.out.println("Hello ["+ name+"], you will be "+( age + 1 )+" years old next year");
    }
}
