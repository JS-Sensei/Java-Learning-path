package vol1.chap3;

import java.math.BigInteger;

/**
 * Simple Java Class to explore BIg Numbers
 * @author nlekane
 * @version 1.0 02/05/2019
 */
public class BigNumbers {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(100);

        //Special methods are needed to for Operations on BigNumbers
        BigInteger b = BigInteger.valueOf(200);

        BigInteger c = a.add(b);
    }
}
