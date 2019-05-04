package vol1.chap3;

import java.util.Scanner;

/**
 * A simple Java Program to have a quick look at I/O mechanisms
 * @version 1.0 01-05-2019
 * @author nlekane
 */
public class InputAndOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name? ");

        //Reading a whole line that my contain spaces
        String name = in.nextLine();
        System.out.println("What is your nickname? ");

        //Reading a single word(delimited by whitespaces)
        String nickName = in.next();

        System.out.println("How old are you? ");
        int age = in.nextInt();
    }
}
