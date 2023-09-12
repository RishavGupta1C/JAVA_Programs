package DS;
// Dynamic Array implementation from Scratch
public class Array {
    private int[] items;
    private int count;
    public Array(int length) {
        items = new int[length];
    }
    public void insert(int item){
        // If the array is full, resize it
        if(items.length == count) {
            // Create new Array, twice the size
            int[] newItems = new int[2*count];
            // Copy all the existing items
            System.arraycopy(items, 0, newItems, 0, count);
//            for(int j=0; j<count; j++) {
//                newItems[j] = items[j];
//            }
            // Set "items" to this array
            items = newItems;
        }
        // Add the new item at the end
        items[count++] = item;
    }
    public void removeAt(int index) {
        // Validate the index
        if(index<0 || index>=count) {
            throw new IllegalArgumentException();
        }
        // Shift the items to the left to fill the hole
        System.arraycopy(items, index+1, items, index, count - index);
//        for(int i=index; i<count; i++) {
//            items[i] = items[i+1];
//        }
        count--;
    }
    public int indexOf(int item) {
        for (int i=0; i<count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }
    public void print() {
        /*for(int i:items)    // For-each loop
            System.out.println(i);*/ // shows zeroes at places where there is no value
        for(int i=0; i<count; i++)
            System.out.println(items[i]);
    }
}
