package vol1.chap3;

import java.util.Arrays;

/**
 * Shows how to store tabular data in a 2d Array.
 *
 * @author nlekane
 * @version 1.0 04/05/2019
 */
public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        //set interest rates to 10 . . .15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++) {
            interestRate[j] = (STARTRATE + j) / 100.0;
        }

        double[][] balances = new double[NYEARS][NRATES];

        //Set initial balances to 10000
        Arrays.fill(balances[0], 10000);

        // Compute the interests for future years
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                // Get last year's balances from previous row
                double oldBalance = balances[i - 1][j];

                //Compute interest
                double interest = oldBalance * interestRate[j];

                //Compute this year's balances
                balances[i][j] = oldBalance + interest;
            }
        }

        // print one row of interest rates
        for (double interestR : interestRate) {
            System.out.printf("%9.0f%%", 100 * interestR);
        }

        System.out.println();

        // Print balance table
        for (double[] row : balances) {
            for (double balance : row) {
                System.out.printf("%10.2f", balance);

            }
            System.out.println();
        }

    }
}
