package eSorting;

public class CInsertionSort {
    static  void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<= n-1; i++){
            int j =i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] =arr[j-1];
                arr[j-1] =temp;
                j--;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.print("Original array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        insertionSort(arr);

        System.out.print("Sorted array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

}
