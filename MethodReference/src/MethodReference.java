public class MethodReference {
    public static void main(String[] args) {
        Functional_Interface func = Test::testImplementation;   // As testImplementation() function is static so we can call it using className
        func.printName();
        func.singleAbsMethod(); // singleAbsMethod is referencing the testImplementation Method
        System.out.println();

        // If no testImplementation() is available in existing code base then
        // use following lambda expression
        Functional_Interface f = () -> System.out.println("Implementation of SAM(SingleAbsMethod)");
        f.singleAbsMethod();
    }
}

class Test{
    public static void testImplementation(){
        System.out.println("This is the test implementation.");
    }
}
