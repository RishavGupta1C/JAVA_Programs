package edureka;

import java.util.ArrayList;
import java.util.Iterator;
class Student{
    int roll;
    String name;
}
public class ListDemo {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        Student s1 = new Student();
        s1.name = "Sal";
        s1.roll = 189;
            list.add(s1);
            list.add(2.2);
            list.add("John");
            list.add(10);

            System.out.println(list);

        Object o = list.get(2);
            System.out.println("o is : " + o);

            list.set(2, "Fionna");
            System.out.println(list);

    //        list.remove(2);
    //        System.out.println(list);
    //        list.clear(); -> to remove all

            for(Object obj: list)
                System.out.println(obj);

        // iterating with iterator
        Iterator itr = list.iterator();
    //        System.out.println(itr.next());
            while (itr.hasNext()) {
            var obj = itr.next();
            System.out.println(obj);
            if(obj.equals("Fionna"))
                itr.remove();
        }
            System.out.println(list);
    }
}
