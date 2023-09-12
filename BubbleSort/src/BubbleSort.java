import java.util.Scanner;

public class BubbleSort {
    public static void countSwaps(int[] a) {
        int counter = 0;
        for(int i=0; i<a.length; i++) {
            boolean flag = false;
            for(int j=0; j<a.length-i-1; j++) {
                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                    counter++;
                }
//                System.out.println(Arrays.toString(a));
            }
            if(!flag)
                break;
        }
        System.out.println("Array is sorted in " + counter + " swaps.");
        for(int i=0; i<a.length; i++){
            if(i==0)
                System.out.println("First Element: " + a[i]);
            if(i==a.length-1)
                System.out.println("Last Element: " + a[i]);
        }
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] argv) {
        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.nextLine();
        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
