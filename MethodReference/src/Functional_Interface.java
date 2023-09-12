@FunctionalInterface
public interface Functional_Interface {
    void singleAbsMethod();
//    void invalidAbstractMethod();
    default void printName(){
        System.out.println("Hi 1!");
    }

    default void printName2(){
        System.out.println("Hi 2!");
    }
}
