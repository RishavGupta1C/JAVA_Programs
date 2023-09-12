package digital;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);


        int D = sc.nextInt();
        int s= sc.nextInt();
        int[] daySet = new int[D];
        int[] tesSet=new int[D];
        for(int i = 0;i<D;i++)
        {

            int sumOfDays=0;
            int testStates=0;
            int[] days = new int[D];
            int[] testState = new int[s];
            for(int j =0;j<D;j++)
            {
                days[j]=sc.nextInt();
                sumOfDays = sumOfDays+days[j];
            }
            daySet[i]=sumOfDays;
            for(int k =0;k<s;k++)
            {
                testState[k]=sc.nextInt();
                testStates = testStates+testState[k];
            }
            tesSet[i]=testStates;

        }
        for(int i=0;i<D-1;i++)
        {
            int ans = tesSet[i+1]/daySet[i+1];

            if((tesSet[i]/daySet[i])>ans)
            {
                System.out.println("Increasing");
            }
            else if((tesSet[i]/daySet[i])<ans)
            {
                System.out.println("Increasing");
            }
            else
            {
                System.out.println("Same");
            }
        }
    }
}