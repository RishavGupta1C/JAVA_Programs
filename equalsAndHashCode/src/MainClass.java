public class MainClass {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Rishav");

        Employee e2 = new Employee();
        e2.setId(1);
        e2.setName("Rishav");

        Employee e3 = e1;

        // These comparisons are false despite the objects having same values
        System.out.println("Shallow compare " + (e1==e2));

        System.out.println("Deep compare " + (e1.equals(e2)));

        System.out.println("Deep compare " + (e1.equals(e3)));

    }
}
