import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");

        System.out.println("map.get(null) = " + map.get(null));
    }
}
