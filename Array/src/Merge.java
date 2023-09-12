import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6};
        int len = firstArray.length + secondArray.length;
        int[] mergedArray = new int[len];
        int pos = 0;
        // Using Enhanced For Loop
        for(int item: firstArray){
            mergedArray[pos] = item;
            pos++;
        }
        for(int item: secondArray){
            mergedArray[pos] = item;
            pos++;
        }
        System.out.println(Arrays.toString(mergedArray));
    }
}
