package algorithms.chapter4;

public class MaximumSubarrayInLinearTime {

    public Tuple findMaximumSubarray(int[] a) {
        int bestSum = Integer.MIN_VALUE;
        int bestStart = -1, bestEnd = -1;
        int localStart = 0, localSum = 0;

        for (int i = 0; i < a.length; i++) {
            localSum += a[i];

            if (localSum > bestSum) {
                bestSum = localSum;
                bestStart = localStart;
                bestEnd = i;
            }

            if (localSum <= 0) {
                localSum = 0;
                localStart = i + 1;
            }
        }

        Tuple result = new Tuple();
        result.maxLeft = bestStart;
        result.maxRight = bestEnd;
        result.sum = bestSum;
        return result;
    }

    public static class Tuple {
        public int maxLeft;
        public int maxRight;
        public int sum;
    }
}
