package algorithms.chapter4;

public class MaximumSubarray {

    private Tuple findMaxCrossingSubarray(int[] a, int low, int mid, int high) {
        Tuple tuple = new Tuple();

        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= low; i--) {
            sum += a[i];
            if (sum > leftSum) {
                leftSum = sum;
                tuple.maxLeft = i;
            }
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int j = mid + 1; j <= high; j++) {
            sum += a[j];
            if (sum > rightSum) {
                rightSum = sum;
                tuple.maxRight = j;
            }
        }

        tuple.sum = leftSum + rightSum;
        return tuple;
    }

    public Tuple findMaximumSubarray(int[] a, int low, int high) {
        if (high == low) {
            Tuple tuple = new Tuple();
            tuple.maxLeft = low;
            tuple.maxRight = high;
            tuple.sum = a[low];
            return tuple;
        }
        int mid = (low + high) / 2;
        Tuple left = findMaximumSubarray(a, low, mid);
        Tuple right = findMaximumSubarray(a, mid + 1, high);
        Tuple cross = findMaxCrossingSubarray(a, low, mid, high);
        if (left.sum >= right.sum && left.sum >= cross.sum) {
            return left;
        } else if (right.sum >= left.sum && right.sum >= cross.sum) {
            return right;
        }
        return cross;
    }

    public static class Tuple {
        public int maxLeft;
        public int maxRight;
        public int sum;
    }
}
