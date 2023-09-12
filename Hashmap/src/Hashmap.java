import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();  // default hashmap constructor

        print(map);
        map.put("ram", 30);
        map.put("sam", 20);
        map.put("dam", 10);

        System.out.println("Size of map is: " + map.size());

        print(map);
        if(map.containsKey("sam")){
            Integer a = map.get("sam");
            System.out.println("value for key \"sam\" is: " + a);
        }

        map.clear();
        print(map);
    }

    public static void print(Map<String, Integer> map){
        if(map.isEmpty())
            System.out.println("map is Empty");
        else{
            System.out.println(map);
        }
    }
}
