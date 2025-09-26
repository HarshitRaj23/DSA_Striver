package eSorting;

public class BBubbleSort {
    static  void bubbleSort(int arr[]){
        int n = arr.length;
        boolean swapped;
        for(int i=0; i< n-1; i++){
            swapped = false;
            for(int j=0; j< n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                    swapped=true;
                }
            }
            if(swapped == false ) break;
        }
    }

    public static void main(String[] args){
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.print("Original array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.print("Sorted array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
