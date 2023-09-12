import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateFunctionDemo {
    public static void main(String[] args) {
//        PredicateFunctionDemo pfd = new PredicateFunctionDemo();
//        System.out.println("It is " + pfd.testStringLength("Rishav") + " that the length is greater than 5");
//        System.out.println("String uses length(), array uses length field, Collections like ArrayList uses size()");


//        Using Predicate
        Predicate<String> checkLength = s -> s.length() >= 5;
        // checkLength is reference variable
        // s -> s.length() >= 5 is the lambda expression
        System.out.println("It is " + checkLength.test("Rishav") + " that the length of the string is greater than 5.");

        Predicate<String> checkEvenLength = s -> s.length()%2 == 0;
        System.out.println("It is " + checkEvenLength.test("Rishav") + " that the string length is even.");

//        Predicate joining
        System.out.println("It is " + checkLength.and(checkEvenLength).test("Rishav") + " that the string length is even and >= 5.");
        System.out.println("It is " + checkLength.or(checkEvenLength).test("Rishav") + " that the string length is even and >= 5.");
        System.out.println("It is " + checkLength.negate().test("Rishav") + " that the string length is even and >= 5.");


        // Function Interface Demo
        Function<Integer, Integer> squaring = i -> i*i; // Function<T,R>    T = input tpe, R = return type
        System.out.println("Square of 19 is " + squaring.apply(19));


        Function<Integer, Integer> doubling = i -> 2*i;
        System.out.println("Double of 19 is " + doubling.apply(19));

        // Function Chaining
        // Using andThen
        System.out.println("Squaring and then Doubling 19 using andThen() gives " + squaring.andThen(doubling).apply(19));

        // Using compose
        System.out.println("Doubling and then Squaring 19 using compose() gives " + squaring.compose(doubling).apply(19));
    }

    public boolean testStringLength(String str){
        return str.length()>=5;
    }
}
