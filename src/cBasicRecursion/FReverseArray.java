package cBasicRecursion;

import java.util.Arrays;

public class FReverseArray {
    void reverseArray(int arr[], int i, int n) {
        if (i >= n / 2) {
            return;
        }

        // Swap
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        // recursive call
        reverseArray(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        FReverseArray obj = new FReverseArray();
        obj.reverseArray(arr, 0, arr.length);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
