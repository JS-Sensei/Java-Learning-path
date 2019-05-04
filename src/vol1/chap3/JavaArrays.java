package vol1.chap3;

import java.util.Arrays;

/**
 * Simple Java Program to explore Arrays
 * @author nlekane
 * @version 1.0 02-05-2019
 */
public class JavaArrays {
    public static void main(String[] args) {
        int[] smallPrimes = { 1, 3, 5, 7, 9, 11 };

        // Copying Array is tricky
        int[] copiedSmallPrimes = smallPrimes;
        copiedSmallPrimes[ 2 ] = 12; // now smallPrimes[2] is also 12

        int[] betterCopiedSmallPrimes = Arrays.copyOf(smallPrimes, smallPrimes.length);
    }
}
