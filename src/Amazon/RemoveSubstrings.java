package Amazon;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class RemoveSubstrings {
    public int RemoveSubstrings(String s, Set<String> dict){
        int min = s.length();
        Queue<String> q = new LinkedList<>();
        HashSet<String> used = new HashSet<>();
        q.offer(s);
        used.add(s);
        while (!q.isEmpty()) {
            String curString = q.poll();
            for (String subString:dict) {
                int index = curString.indexOf(subString);
                while (index != -1) {
                    String sliced = curString.substring(0, index) + curString.substring(index + subString.length(), curString.length());
                    if (!used.contains(sliced)) {
                        if (sliced.length() < min) {
                            min = sliced.length();
                        }
                        q.offer(sliced);
                        used.add(sliced);
                    }
                    index = curString.indexOf(subString, index + 1);
                }

            }
        }


        return min;
    }
}
