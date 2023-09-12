import java.util.stream.Stream;
import java.util.Arrays;

public class MergeUsingStream {
    public static <T> Object[] mergeArray(T[] array1, T[] array2){
        return Stream.of(array1, array2).flatMap(Stream::of).toArray();
    }
    public static void main(String[] args) {
        Integer[] fArray = new Integer[]{13, 12, 11, 6, 9, 3};
        Integer[] sArray = new Integer[]{78, 34, 56, 67, 2, 11, 7};
        Object[] mergedArray = mergeArray(fArray, sArray);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}
