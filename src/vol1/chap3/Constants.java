package vol1.chap3;

public class Constants {
    public static void main(String[] args) {
        // final Keyword is used to declare constants, which are variables you can only assign once and then its value
        // is set once and for all(for primitive types)
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in Centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}
