package chapter2;

import java.io.*;
import java.util.*;

public class MergeSort {
    private static int[] aux;

    public static void main(String[] args) throws IOException {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            promptForInput(in);
        }
    }

    private static void promptForInput(BufferedReader in) throws IOException {
        String line = null;
        System.out.println("Input an array to sort");
        while(null != (line = in.readLine())) {
            int[] array = null;
            try {
                array = createNewArray(line);
                sort(array);
                System.out.println("Sorted array: " + Arrays.toString(array));
            } catch (NumberFormatException nfe) {
                System.out.println("Illegal character entered. Please enter a line of integers separated by white space");
            }
        }
    }
    
    private static int[] createNewArray(String line) {
        String[] tokens = line.split("\\s+");
        int[] result = new int[tokens.length];
        
        for (int i=0; i < tokens.length; i++) {
            result[i] = Integer.parseInt(tokens[i]);
        }

        return result;
    }

    public static void sort(int[] a) {
        aux = new int[a.length];
        sort(a,0,a.length-1);
    }

    private static void sort(int[] a, int lo, int hi) {
        if (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            sort(a, lo, mid);
            sort(a, mid+1, hi);
            merge(a, lo, mid, hi);
        }
    }

    private static void merge(int[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (aux[j] < aux[i]) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }
}
