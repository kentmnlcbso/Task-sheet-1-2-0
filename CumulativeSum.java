public class CumulativeSum {

    public static int calculateCumulativeSum(int... nums) {
        int totalSum = 0;

        for (int num : nums) {
            int cumulativeSum = 0;

            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
            }

            System.out.println("Cumulative sum up to " + num + " is: " + cumulativeSum);

            totalSum += cumulativeSum;
        }

        return totalSum;
    }

    public static void main(String[] args) {

        int total = calculateCumulativeSum(4, 5, 10);

        System.out.println("Total sum of all cumulative sums: " + total);
    }
}