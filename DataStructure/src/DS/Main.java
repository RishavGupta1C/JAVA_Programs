package DS;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.LinkedList;
import org.junit.Test;

public class Main {

    public static void main(String[] args) {
	    // double[] doubleNumbers = new double[10];      // All items gets initialized to null for String and Wrapper classes,
        // int[] numbers = new int[10];                  // 0 for integers and byte, 0.0 for float and double, false for boolean
        // System.out.println(numbers);         // Prints the type of Array followed by @ and then the address
        //System.out.println(Arrays.toString(doubleNumbers));

        // Dynamic Array -> The size automatically increases to double it's original size(usually).
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
//        numbers.removeAt(4);
        int index = numbers.indexOf(20);
        numbers.print();
        System.out.println("Index of 20 is " + index);

        // Dynamic Array in Java -> Vector and ArrayList
        // Vector: 100% - Synchronized (A method is synchronized means Only a single thread can access that method)
        // ArrayList: 50% - Not synchronized
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.remove(3);
        list.indexOf(20);
        list.lastIndexOf(2);
        Object[] arr;
        arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        // Linked Lists
//        LinkedList<java.io.Serializable> linkedList = new LinkedList<>();
//        linkedList.addLast(10d);
//        linkedList.addLast(20d);
//        linkedList.addLast(30);
//        linkedList.addLast(true);
//        linkedList.addFirst(5);
//        System.out.println(linkedList.contains(20.0));
//        System.out.println(linkedList.indexOf(10.0));
//        System.out.println(linkedList.size());
//        var array = linkedList.toArray();
//        System.out.println(Arrays.toString(array));
//        System.out.println(linkedList);

        // Linked List from Scratch
        var list1 = new DS.LinkedList();
        list1.addLast(10);
        list1.addLast(20);
        list1.addLast(30);
        list1.addFirst(5);
        list1.print();
        System.out.println(list1.indexOf(40));
        list1.removeFirst();
        list1.removeLast();
        System.out.println(list1.contains(40));
        list1.print();
    }

//    To test the data structure created
    @Test(expected = IndexOutOfBoundsException.class)
    public void testMyList(){

    }
}
