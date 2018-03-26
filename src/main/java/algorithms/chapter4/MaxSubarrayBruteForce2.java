package algorithms.chapter4;

public class MaxSubarrayBruteForce2 {

    private static Result solve(final int[] arr) {
        final Result result = new Result();

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum > result.sum) {
                    result.sum = sum;
                    result.maxLeft = i;
                    result.maxRight = j;
                }
            }
        }

        return result;
    }

    private static class Result {
        int maxLeft = -1;
        int maxRight = -1;
        int sum = Integer.MIN_VALUE;

        @Override
        public String toString() {
            return String.format("Max Left [%s] Max Right [%s] Sum [%s]", maxLeft, maxRight, sum);
        }
    }

    public static void main(String[] args) {
        final int[] priceChanges = { 13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7 };
        System.out.println(solve(priceChanges));
    }
}
