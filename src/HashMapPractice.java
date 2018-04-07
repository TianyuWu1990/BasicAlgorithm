import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapPractice {

    public static void main(String[] args){
        Map<String, String> map = new TreeMap<>();
//        for (int i = 15; i > 0; i --) {
//            map.put(i + "", i + "");
//        }
        map.put("abc","1");//key无重复
        map.put("ab","1");//value可以重复
        //map.put(null, null);//不可以为空
        for (Iterator i = map.keySet().iterator(); i.hasNext(); ) {
            String key = (String)i.next();
            String value = map.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }
    }
}
