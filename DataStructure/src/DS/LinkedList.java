package DS;


import java.util.NoSuchElementException;

public class LinkedList {
    private static class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node first;
    private Node last;

    public void addLast(int item) {
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }
    public void addFirst(int item) {
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }
    private boolean isEmpty() {
        return first == null;
    }
    public int indexOf(int item) {
        var current = first;
        int index = 0;
        while(current != null) {
            if(current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }
    public void removeFirst() {
        if(isEmpty())
            throw new NoSuchElementException(); // This will halt the program.
        if(first == last) {
            first = last = null;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;
    }
    public void removeLast() {
         if(isEmpty())
             throw new NoSuchElementException();
         if(first == last) {
             first = last = null;
             return;
         }
//        var current = first;
//        while(current.next.next != null) {
//            current = current.next;
//        }
//         current.next = null;
//         last = current;
         var previous = getPrevious(last);
         assert previous != null;
//        if (previous == null) throw new AssertionError();
         previous.next = null;
         last = previous;
    }
    private Node getPrevious(Node node) {
        var current = first;
        while(current != null) {
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }
    public void print() {
        var q = first;
        while(q != null) {
            System.out.println(q.value);
            q = q.next;
        }
    }
}
