package Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PermutingTwoArrays {

    // Complete the twoArrays function below.
    static String twoArrays(int k, int[] A, int[] B) {
        Arrays.sort(A);
//        Long Solution :
//        Integer[] integerArray = new Integer[B.length];
//        int j = 0;
//        for(int element: B){
//            integerArray[j++] = element;
//        }
//        Arrays.sort(integerArray, Collections.reverseOrder());


//        Two Line Solutions:
//        Converting int[] to Integer[]
//        This did not run on hackerrank
//        Integer[] ever = IntStream.of( B ).boxed().toArray( Integer[]::new );
//        Arrays.sort(ever, Collections.reverseOrder());

        Integer[] what = Arrays.stream( B ).boxed().toArray( Integer[]::new );
        Arrays.sort(what, Collections.reverseOrder());


        for(int i=0; i<A.length; i++){
            if(A[i]+what[i] >= k) {
//            if(A[i]+integerArray[i]>=k){
                continue;
            }
            else
                return "NO";
        }
        return "YES";

//        To Convert int[] to List<Integer>
//        List<Integer> you  = Arrays.stream(intArray).boxed().collect( Collectors.toList() );
//        List<Integer> like = IntStream.of(intArray).boxed().collect( Collectors.toList() )
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int[] A = new int[n];

            String[] AItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int AItem = Integer.parseInt(AItems[i]);
                A[i] = AItem;
            }

            int[] B = new int[n];

            String[] BItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int BItem = Integer.parseInt(BItems[i]);
                B[i] = BItem;
            }

            String result = twoArrays(k, A, B);
            System.out.println(result);
//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
}
