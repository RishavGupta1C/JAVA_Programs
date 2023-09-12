package beginner;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// reference types
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }

    // This is allowed
    static void method(int a){}
    static void method(int a, int b){}

    // This is not allowed compiler thinks they are duplicate methods
    // static void method(int a){}
    // void method(int a){}
}
