package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MarkAndToys {
    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        // k is the total wallet amount

        // Sorting the prices
//        for (int i = 0; i < prices.length; i++) {
//            boolean swapped = false;
//            for (int j = 0; j < prices.length - i - 1; j++) {
//                if (prices[j] > prices[j + 1]) {
//                    int temp = prices[j];
//                    prices[j] = prices[j + 1];
//                    prices[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//            if(!swapped)
//                break;
//        }
        Arrays.sort(prices);

        // Adding the prices till it exceeds the wallet amount
        int counter = 0, sum = 0;
        for (int i = 0; i < prices.length; i++) {
            if (sum < k) {
                counter++;
                sum += prices[i];
            }
        }
        return counter-1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nk = scanner.nextLine().split(" ");
        try {
            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int[] prices = new int[n];

            String[] pricesItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int pricesItem = Integer.parseInt(pricesItems[i]);
                prices[i] = pricesItem;
            }

            int result = maximumToys(prices, k);
            System.out.println(result);

        }catch(NumberFormatException e) {
            System.out.println("Wrong Input");
        }

        scanner.close();
    }
}
