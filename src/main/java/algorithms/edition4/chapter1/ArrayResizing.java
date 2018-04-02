package algorithms.edition4.chapter1;

public class ArrayResizing {

    public static int[] resize(final int[] arr, final int max) {
        final int endPosition = max < arr.length ? max : arr.length;
        final int[] result = new int[max];
        System.arraycopy(arr, 0, result, 0, endPosition);
        return result;
    }

}
