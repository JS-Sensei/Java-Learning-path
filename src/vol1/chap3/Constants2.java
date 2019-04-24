package vol1.chap3;

/**
 * Simple Program to explore class constants
 * @author BatmanNLT
 * @version 1.0 2019-21-04
 */
public class Constants2 {
    // Declaring a class constant
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in Centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}
