package algorithms.chapter2.utils;

import java.util.Random;

public class TestDataGenerator {

    public static final int LARGE_ARRAY_SIZE = (int) 1e6;
    public static final int MEDIUM_ARRAY_SIZE = (int) 1e4;
    public static final int SMALL_ARRAY_SIZE = (int) 1e3;
    public static final int NUMBER_OF_TEST_KEYS = (int) 1e3;

    public int[] getSortedArray(int size) {
        return createNewSortedArray(size);
    }

    public int[] getReverseSortedArray(int size) {
        return createNewReverseSortedArray(size);
    }

    public int[] getRandomlyOrderedArray(int size) {
        Random rnd = new Random();
        int[] array = createNewSortedArray(size);
        for (int i = array.length - 1; i > 0; i--) {
            swap(array, rnd.nextInt(i + 1), i);
        }
        return array;
    }

    private void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    private int[] createNewSortedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    private int[] createNewReverseSortedArray(int size) {
        int[] array = new int[size];
        for (int i = array.length - 1; i > -1; i--) {
            array[i] = i;
        }
        return array;
    }
}
