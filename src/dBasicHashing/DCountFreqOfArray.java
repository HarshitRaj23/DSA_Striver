package dBasicHashing;

import java.util.HashMap;
import java.util.Map;

public class DCountFreqOfArray {

    public static void main(String args[]){
        System.out.println("Approch 1");
        int arr[] ={10,5,10,15,10,5};
        int n = arr.length;
        countFreq(arr, n);


        System.out.println("Approch 2");
        int arr2[] = {5,10,15,10,5};
        int n2 = arr2.length;
        Frequency(arr2, n2);
    }
    //approch -> 1
    public static void countFreq(int arr[], int n){
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }

    //approch 2
    static void Frequency(int arr[], int n){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            if (map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else
            {
                map.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
