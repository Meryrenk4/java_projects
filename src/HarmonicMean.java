/*
    This project calculates the harmonic mean of the numbers in the array.
 */

public class HarmonicMean {
    public static void main(String[] args) {
        // Create a list object and the variables for harmonic sum and harmonic mean
        int[] list = {1, 2, 3, 4, 5, 6};
        double harmonicSum = 0.0, harmonicMean;

        // Calculate the harmonic series of each element of list
        for (int var : list) {
            for (int i = 1; i <= var; i++) {
                harmonicSum += ((double) 1 / i);
            }
        }

        // Calculate the harmonic mean
        harmonicMean = list.length / harmonicSum;
        System.out.println("Harmonic mean of the list is " + harmonicMean);

    }
}
