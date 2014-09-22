package algorithms.chapter2;

public class BubbleSort {
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                }
            }
        }
    }

    private void swap(int[] array, int first, int second) {
        int tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }
}
