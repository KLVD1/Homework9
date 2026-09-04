import java.util.Arrays;

public class Main {
    static void main() {

        System.out.println("\n\tЗадание#1\n");

        int[] inputArray1 = {10000, 24000, 35000, 50000, 18500};
        double[] outputArray1 = new double[4];
        long sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        for (int payout : inputArray1) {
            sum += payout;
            if (payout > max) {
                max = payout;
            }
            if (payout < min) {
                min = payout;
            }
        }
        double average = (double) sum / inputArray1.length;

        // Записываем результаты в outputArray1 в нужном порядке
        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = average;

        System.out.println("inputArray1: " + Arrays.toString(inputArray1));
        System.out.println("outputArray1: " + Arrays.toString(outputArray1));


        System.out.println("\n\tЗадание#2\n");

        int[] inputArray2 = {15000, 17000, 40000, 36000, 45000};
        double[] outputArray2 = new double[inputArray2.length];

        final double taxRate = 0.13; // налог 13%

        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] = inputArray2[i] * taxRate;
        }

        System.out.println("inputArray2: " + Arrays.toString(inputArray2));
        System.out.println("outputArray2: " + Arrays.toString(outputArray2));

        System.out.println("\n\tЗадание#3\n");

        int[] inputArray3 = {7000, 13000, 2500, 6000, 4100};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        final int bonus = 5000;
        for (int i = 0; i < inputArray3.length; i++) {
            outputArray3[i] = inputArray3[i] > bonus;
        }
        System.out.println("inputArray3: " + Arrays.toString(inputArray3));
        System.out.println("outputArray3: " + Arrays.toString(outputArray3));

        System.out.println("\n\tЗадание#4\n");

        int[] inputArray4 = {7000, 13000, -2500, 6000, -100};
        boolean outputArray4 = true;
        for (int balace : inputArray4) {
            if (balace < 0) {
                outputArray4 = false;
                break;
            }
        }
        System.out.println("inputArray4: " + Arrays.toString(inputArray4));
        System.out.println("outputArray4: " + outputArray4);

        System.out.println("\n\tЗадание#5\n");

        int[] inputArray5 = {70000, 130000, -100, 250000, 60000};
        int outputArray5 = 0;
        for (int profit : inputArray5) {
            if (profit > 0) {
                outputArray5++;
            }
        }
        System.out.println("inputArray5: " + Arrays.toString(inputArray5));
        System.out.println("outputArray5: " + outputArray5);

    }
}