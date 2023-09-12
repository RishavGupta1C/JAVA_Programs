package Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class GreedyFlorist {

//    c: original prices of each flower
//    k: number of friends
//    n: number of flowers
    static int getMinimumCost(int[] c, int k){
        Integer[] intArray = new Integer[c.length];
        int sum = 0, priceCoefficient = 1, count;
        int x = 0;
        for(int i=0; i<c.length; i++){
            intArray[i] = c[i];
        }
        Arrays.sort(intArray, Collections.reverseOrder());
//        System.out.println(Arrays.toString(intArray));

        for(int i=0; i<intArray.length; i=i+count){
            count = 0;
            for(int j=i; j<k+x; j++){
                if(j>= intArray.length)
                    break;
                sum += priceCoefficient*intArray[j];
//                System.out.println(sum);
                count++;
            }
            priceCoefficient++;
            x += k;
        }

        return sum;
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        String[] nk = scanner.nextLine().split(" ");
//
//        int n = Integer.parseInt(nk[0]);
//
//        int k = Integer.parseInt(nk[1]);
//
//        int[] c = new int[n];
//
//        String[] cItems = scanner.nextLine().split(" ");
////        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int cItem = Integer.parseInt(cItems[i]);
//            c[i] = cItem;
//        }
//
//        int minimumCost = getMinimumCost(c, k);
//
//        System.out.println(minimumCost);
//
//        scanner.close();
//
        String[] str = sc.nextLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        int[] c = new int[n];

        String[] cItems = sc.nextLine().split(" ");
//        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i=0; i<n; i++){
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = getMinimumCost(c, k);

        System.out.println(result);

        sc.close();
    }
}