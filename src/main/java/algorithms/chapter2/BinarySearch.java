package algorithms.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) throws IOException {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            BinarySearch bs = new BinarySearch();
            bs.promptForInput(in);
        }
    }

    protected void promptForInput(BufferedReader in) throws IOException {
        String line = null;
        System.out.println("Input a sorted array");
        while (null != (line = in.readLine())) {
            int[] array = null;
            try {
                array = createNewArray(line);
                int v = 0;
                System.out.println("Input a value to search for");
                line = in.readLine();
                v = Integer.parseInt(line);
                int rank = rank(array, 0, array.length, v);
                System.out.println("Array: " + Arrays.toString(array) + " rank=[" + rank + "] of value=[" + v + "]");
            } catch (NumberFormatException nfe) {
                System.out.println("Illegal character entered. Please enter a line of integers separated by white space");
            }
        }
    }

    private int[] createNewArray(String line) {
        String[] tokens = line.split("\\s+");
        int[] result = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            result[i] = Integer.parseInt(tokens[i]);
        }

        return result;
    }

    public int rank(int[] a, int lo, int hi, int v) {
        if (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a[mid] > v) {
                return rank(a, lo, mid - 1, v);
            } else if (a[mid] < v) {
                return rank(a, mid + 1, hi, v);
            } else {
                return mid;
            }
        }
        return -1;
    }
}
