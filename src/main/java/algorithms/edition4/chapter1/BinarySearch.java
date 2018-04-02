package algorithms.edition4.chapter1;

class BinarySearch {

    static int rank(int key, int[] a) {
        // Array must be sorted
        int lo = 0;
        int high = a.length - 1;
        while (lo <= high) {
            int mid = lo + (high - lo) / 2;
            if (key < a[mid]) high = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

}
