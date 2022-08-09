package CO4;

import java.util.HashMap;
import java.util.Map;

public class pg_17 {
    public static void main(String[] args) {
        Map<String,Integer> m=new HashMap<String,Integer>();
        m.put("a", 1);
        for(Map.Entry<String,Integer> me : m.entrySet()){
            System.out.println(me.getValue());
        }
    }
}
