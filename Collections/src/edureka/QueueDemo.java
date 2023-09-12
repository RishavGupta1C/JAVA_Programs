package edureka;

import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=10; i>0; i--) {
            queue.add(i);
        }
        // Priority queue sorts the data for us
        // Peeking -> Obtaining the head of Queue
        // Poling -> Remove the head of Queue
        System.out.println("Queue siE is: " + queue.size());
        System.out.println("Head of queue is: " + queue.peek());
        queue.poll();
        System.out.println("Queue size after poll :" + queue.size());
        System.out.println("New head of queue is: " + queue.peek());

        // Call by reference
        intWrapper a = new intWrapper(10);
        intWrapper b = new intWrapper(20);
        System.out.println(a.value + " " + b.value);
        swap(a,b);
        System.out.println(a.value + " " + b.value);
        Integer a1 = 10;
        Integer b1 = 20;
        System.out.println(a1 + " " + b1);
        swapInteger(a1, b1);
        System.out.println(a1 + " " + b1); // Swapping doesn't occur as Wrapper classes are immutable
    }
    static void swap(intWrapper a, intWrapper b) {
        int c = b.value;
        b.value = a.value;
        a.value = c;
    }
    static void swapInteger(Integer a, Integer b){
        Integer c = b;
        b = a;
        a = c;
    }
}
class intWrapper{
    public int value;
    public intWrapper (int value) {this.value = value;}
}
