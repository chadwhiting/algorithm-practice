package algorithms.chapter4;

public class MaximumSubarrayBruteForce {

    public Tuple findMaximumSubarray(int[] a, int low, int high) {
        Tuple tuple = new Tuple();
        tuple.maxLeft = -1;
        tuple.maxRight = -1;
        tuple.sum = Integer.MIN_VALUE;

        for (int i = low; i < high + 1; i++) {
            int sum = a[i];
            int maxLeft = i;
            int maxRight = i;
            int runningSum = sum;
            for (int j = i + 1; j < high + 1; j++) {
                runningSum += a[j];
                if (runningSum > sum) {
                    sum = runningSum;
                    maxRight = j;
                }
            }
            if (sum > tuple.sum) {
                tuple.sum = sum;
                tuple.maxLeft = maxLeft;
                tuple.maxRight = maxRight;
            }
        }

        return tuple;
    }

    public static class Tuple {
        public int maxLeft;
        public int maxRight;
        public int sum;
    }
}
