import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhash {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(12, "Dhiraj");
        map.put(6, "surya");
        map.put(7, "Ravi");
        System.out.println(map);
        System.out.println(map.get(6));

        for (Map.Entry<Integer,String> d: map.entrySet())
        {
            String val=d.getValue();
            if(val.equals("surya"))
            {
                int key= d.getKey();
                System.out.println(key);
            }
        }
    }
}

