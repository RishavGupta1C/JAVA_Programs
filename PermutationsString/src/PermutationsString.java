//import java.util.Scanner;
//
//public class PermutationsString {
//    private static final Scanner sc = new Scanner(System.in);
//    public static void main(String[] args) {
//        String smallString = sc.nextLine();
//        String bigString = sc.nextLine();
//
//    }
//    public static int computePermutations(String smallString, String bigString) {
//        int smallStringLength = smallString.length(), bigStringLength = bigString.length();
//        int[] letterArray1 = new int[26];    // all the element is initialised to zero
//        int target = 0;
//
//        for(int i=0; i<smallStringLength; i++) {
//            int characterIndex = smallString.charAt(i) - 'a';
//            letterArray1[characterIndex]++;
//            target += characterIndex;
//        }
//
//        int sum = 0;
//        int letterArray2[] = new int[26];
//
//        for(int i=0; i<bigStringLength; i++) {
//            int characterIndex = bigString.charAt(i) - 'a';
//            letterArray2[characterIndex]++;
//            sum += characterIndex;
//        }
//
//        for(int begin=0; begin+smallStringLength<bigStringLength; begin++) {
//            if(sum == target && isEqual(smallString, bigString))
//
//        }
//    }
//}
//

public class PermutationsString {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()==0 || s2.length()==0 || s1.length()>s2.length())
            return false;

        int n = s1.length(), m = s2.length();
        int f1[] = new int[26]; int target = 0;

        for(int i=0;i<n;i++){
            int val = s1.charAt(i)-'a';
            f1[val]++;target+=val;
        }

        int sum = 0;
        int f2[] = new int[26];

        for(int i=0;i<n;i++){
            int val = s2.charAt(i)-'a';
            f2[val]++;sum+=val;
        }

        for(int begin=0;begin+n<m;begin++){
            if(sum==target && isEqual(f1,f2))
                return true;
            int startVal = s2.charAt(begin)-'a';
            f2[startVal]--; sum-=startVal;
            int endVal = s2.charAt(begin+n)-'a';
            f2[endVal]++; sum+=endVal;
        }

        return sum==target && isEqual(f1,f2);
    }

    private boolean isEqual(int[] f1, int[] f2){
        for(int i=0;i<26;i++)
            if(f1[i]!=f2[i])
                return false;
        return true;
    }
}