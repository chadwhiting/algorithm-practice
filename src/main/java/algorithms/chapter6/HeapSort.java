package algorithms.chapter6;

class HeapSort {

    // CLRS based HeapSort
    // Using a max heap for heap sort
    // heap[getParent(i)] >= heap[i]

    private int[] heap;
    private int heapSize;

    HeapSort() {
        this(100);
    }

    HeapSort(int heapCapacity) {
        this.heap = new int[heapCapacity];
    }

    HeapSort(int[] heap, int heapSize) {
        this.heap = heap;
        this.heapSize = heapSize;
    }

    public void sort(int[] arr) {
        buildMaxHeap(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            swap(0, i);
            heapSize--;
            maxHeapify(0);
        }
    }

    int getParent(int index) {
        return (int) Math.floor((index + 1)/2) - 1;
    }

    int getLeftChild(int index) {
        return 2 * (index + 1) - 1;
    }

    int getRightChild(int index) {
        return 2 * (index + 1);
    }

    void maxHeapify(int index) {
        maxHeapifyIterative(index);
    }

    private void maxHeapifyIterative(int index) {
        int largest = -1;
        while (largest != index) {
            final int leftChild = getLeftChild(index);
            final int rightChild = getRightChild(index);

            if (leftChild <= heapSize && heap[leftChild] > heap[index]) {
                largest = leftChild;
            } else {
                largest = index;
            }
            if (rightChild <= heapSize && heap[rightChild] > heap[largest]) {
                largest = rightChild;
            }
            if (largest != index) {
                swap(index, largest);
                index = largest;
                largest = -1;
            }
        }
    }

    private void maxHeapifyRecursive(int index) {
        final int leftChild = getLeftChild(index);
        final int rightChild = getRightChild(index);
        int largest;

        if (leftChild <= heapSize && heap[leftChild] > heap[index]) {
            largest = leftChild;
        } else {
            largest = index;
        }
        if (rightChild <= heapSize && heap[rightChild] > heap[largest]) {
            largest = rightChild;
        }
        if (largest != index) {
            swap(index, largest);
            maxHeapify(largest);
        }
    }

    void buildMaxHeap(int[] a) {
        heapSize = a.length - 1;
        heap = a;
        for (int i = (int) Math.floor(a.length / 2); i > -1; i--) {
            maxHeapify(i);
        }
    }

    void swap(int first, int second) {
        int tmp = heap[first];
        heap[first] = heap[second];
        heap[second] = tmp;
    }

}
