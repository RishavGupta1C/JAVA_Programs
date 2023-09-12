import java.util.Arrays;

public class MergeUsingArraycopy {
    public static void main(String[] args) {
        int[] fArray = {1, 2, 3};   int fal = fArray.length;
        int[] sArray = {4, 5, 6, 7};   int sal = sArray.length;
        int[] result = new int[fal + sal];
        System.arraycopy(fArray, 0, result, 0, fal);
        System.arraycopy(sArray, 0, result, fal, sal);
        System.out.println(Arrays.toString(result));
    }
}
