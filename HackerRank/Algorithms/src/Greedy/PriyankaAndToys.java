package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class PriyankaAndToys {
    // Complete the toys function below.
    static int toys(int[] w) {

        Arrays.sort(w);
        int numberOfContainer = 0;
        int count;
        int min = w[0];
        for(int i=0; i<w.length; i=i+count){
            count = 0;
            for(int j=i; j<w.length; j++){
                if(w[j]<=min+4){
                    count++;
                }else {
                    min = w[j];
                    break;
                }
            }
            numberOfContainer++;
        }
        return numberOfContainer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] w = new int[n];

        String[] wItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int wItem = Integer.parseInt(wItems[i]);
            w[i] = wItem;
        }

        int result = toys(w);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
