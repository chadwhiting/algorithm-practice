package algorithms.chapter2;

public class MergeSortBottomUp extends MergeSort {
    // TODO there is a problem with this implementation
    // Temporarily commenting out
    /*
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
    */
}
