package algorithms.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeSortBottomUp extends MergeSort {
    public void sort(int[] a) {
        System.out.println("Using bottom up sort");
        int N = a.length;
        aux = new int[N];
        for (int sz = 1; sz < N; sz = sz + sz) {
            for (int lo = 0; lo < N - sz; lo += sz + sz) {
                merge(a, lo, lo + sz - 1, N - 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        MergeSort sort = new MergeSortBottomUp();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            sort.promptForInput(in);
        }
    }
}
