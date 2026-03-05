import java.sql.SQLOutput;

public class Practical4 {
    void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Practical4 p4 = new Practical4();
        int[] A = {99, 7, 6, 1, 100, 108};
      
        System.out.println("Using Bubble Sort:");
        p4.bubbleSort(A);
        int n = A.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Using Insertion Sort:");
        p4.insertionSort(A);
        for (int i = 0; i < n; ++i) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.println("Using Linear Search:");
        System.out.println("Index Location: " + p4.linearSearch(A, 1));

        System.out.println();

        System.out.println("Using Binary Search:");
        System.out.println("Index Location: " + p4.binarySearch(A, 1));
    }
}
