
import javax.jnlp.IntegrationService;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap=new HashMap<>();

        String regex = "[【】、.。,\"!--;:?\'\\]]";
        try {
            BufferedReader br=new BufferedReader(new FileReader("src/input.txt"));
            String value;
            while((value=br.readLine())!=null){
                value=value.replaceAll(regex, " ");
                StringTokenizer tokenizer = new StringTokenizer(value);
                System.out.println(value);
                while(tokenizer.hasMoreTokens()){
                    String word=tokenizer.nextToken();
                    if(!hashMap.containsKey(word)){
                        hashMap.put(word, new Integer(1));
                    }else{
                        int k=hashMap.get(word).intValue()+1;
                        hashMap.put(word, new Integer(k));
                    }
                }
            }
            List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(hashMap.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue()-o1.getValue();
                }
            });

            for (Map.Entry<String, Integer> mapping : list) {
                System.out.println(mapping.getKey() + ":" + mapping.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}