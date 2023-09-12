package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class LargestPermutation {

//    n: number of elements in the array
//    k: number of swaps

    static int[] largestPermutation(int k, int[] arr){

//        This code is correct but time complexity is O(N^2)

//        int  c= 0;
//        if(k > arr.length)
//            k = arr.length;
//        for(int i=0; i<arr.length && k>0; i++){
//             int max_index = i;
//            for(int j=i; j<arr.length; j++){
//                if(arr[j]>arr[max_index])
//                    max_index = j;
//            }
//            if(arr[i] != arr[max_index]){
//                int temp = arr[i];
//                arr[i] = arr[max_index];
//                arr[max_index] = temp;
//                k--;
//                c++;
//            }
//        }
//        System.out.println(c);

//        Time Complexity of the below code is O(N)
        int n = arr.length;

        int[] index = new int[n];

        for(int i=0; i<n; i++){
            index[arr[i]-1] = i;
        }

        for(int i=0; i<n && k>0; i++){
            if(arr[i] == n-i)
                continue;
            int temp1 = index[n-i];
            index[n-i] = index[arr[i]];
            index[arr[i]] = temp1;

            int temp2 = arr[index[n-i]];
            arr[index[n-i]] = arr[temp1];
            arr[temp1] = temp2;

            k--;
        }
        return arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        String[] arrItems = scanner.nextLine().split(" ");

        int[] arrItem = new int[arrItems.length];

        for(int i = 0; i < n; i++){
            arrItem[i] = Integer.parseInt(arrItems[i]);
        }

        int[] result = largestPermutation(k, arrItem);
        System.out.println(Arrays.toString(result));

        scanner.close();
    }
}
