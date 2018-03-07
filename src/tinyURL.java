import java.util.HashMap;
import java.util.Map;

public class tinyURL {
    static Map<Integer, String> map1=new HashMap<Integer, String>();
    static Map<String, Integer> map2=new HashMap<String, Integer>();
    static String s="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    // Encodes a URL to a shortened URL.
    public static String encode1(String longUrl) {
        if(!map2.containsKey(longUrl)) {
            map1.put(map1.size()+1,longUrl);
            map2.put(longUrl, map2.size()+1);
        }
        int n=map2.get(longUrl);
        StringBuilder sb=new StringBuilder();
        //首先每个longUrl的索引n是不同的，可以使用对62的商和余数唯一标识n，然后将s中相应位置的字符插入短连接即可。
        while(n>0) {
            //共有62个字符可以用于短连接的编码
            int r=n%62;
            n/=62;
            sb.insert(0,s.charAt(r));
        }
        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public static String decode1(String shortUrl) {
        int val=0;
        int n=shortUrl.length();
        for(int i=0;i<n;i++) {
            val=val*62+s.indexOf(shortUrl.charAt(i));
        }
        return map1.get(val);
    }

    public static void main(String[] args){
        String url = "http://www.tianyu.com";
        System.out.println(encode1(url));
        System.out.println(decode1("b"));
    }
}
