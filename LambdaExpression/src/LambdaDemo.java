import java.util.function.BiConsumer;

public class LambdaDemo {
    public static void main(String[] args) {
//        LambdaDemo demo = new LambdaDemo();
//        demo.add(10,5);
//        add(10, 5);

//        BiConsumer<Integer, Integer> biConsumer1 = (Integer a, Integer b) -> {
//            System.out.println(a + b);
//        };


/* BiConsumer is a predefined functional interface which accepts only and returns nothing. */
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(10, 5);

//        Comparator<String> c = (s1, s2) -> s1.compareTo(s2);

    }

//    public static void add(Integer a, Integer b) {
//        System.out.println(a + b);
//    }
}
