package vol1.chap3;

import javax.sound.midi.SysexMessage;

/**
 * A simple Program to have a quick look on Java String
 * @author BatmanNLT
 * @version 1.0 24/04/2019
 */
public class Strings {

    public static void main(String[] args) {

        String greeting = "Hello";

        //Substring
        String s = greeting.substring(0, 3); // "Hel"
        System.out.println("The Substring of [" + greeting + "] from index 0 of length 3 is [" + s + "]");

        //Concatenation
        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + PG13;

        String all = String.join(" / ", "S", "M", "L", "XL");
        System.out.println("The sizes we offer for our Clothings: " + all);


    }
}
