package pattern;

import java.util.Scanner;

public class Main {
    public static void main(String... parameters) { // String[] args, argh, argv all are valid
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = -1;
        for(int i=0; i<n; i++){
            for(int j=n; j>i+1; j--){
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++){
                if(c==0) {
                    c++;
                }
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }
}
