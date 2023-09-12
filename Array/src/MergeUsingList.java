import java.util.ArrayList;
import java.util.Arrays;

public class MergeUsingList {
    public static void main(String[] args) {
        String[] string1 = {"A", "E", "I"};
        String[] string2 = {"O", "U"};
        var list = new ArrayList(Arrays.asList(string1));
        list.addAll(Arrays.asList(string2));
        Object[] string3 = list.toArray();
        System.out.println(Arrays.toString(string3));
    }
}
