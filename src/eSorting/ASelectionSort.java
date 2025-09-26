package eSorting;

public class ASelectionSort {
    static  void selctionSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<=n-2; i++){
            int minIdx = i;
            for(int j=i; j<=n-1; j++){
                if(arr[j] < arr[i]) minIdx=j;
            }

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static void main(String[] args){
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.print("Original array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        selctionSort(arr);

        System.out.print("Sorted array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
