package algorithms.chapter4;

public class MaxSubarrayBruteForce {

    private static Result solve(int[] prices) {
        Result result = new Result();

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                final int diff = prices[j] - prices[i];
                if (diff > result.sum) {
                    result.sum = diff;
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
        int[] prices = {100, 113, 110, 85, 105, 102, 86, 63, 81, 101, 94, 106, 101, 79, 94, 90, 97};
        System.out.println(solve(prices));
    }
}
