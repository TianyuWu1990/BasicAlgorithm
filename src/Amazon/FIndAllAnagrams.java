package Amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIndAllAnagrams {
    public List<Integer> findAllAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        if (s == null || s.length() == 0)
            return list;
        int sLen = s.length();
        int pLen = p.length();
        int[] sArr = new int[26];
        int[] pArr = new int[26];
        for (int i=0; i<pLen; i++) {
            pArr[p.charAt(i)-'a']++;
        }
        for (int i=0; i<sLen; i++) {
            sArr[s.charAt(i)-'a']++;
            if (i >= pLen) {
                sArr[s.charAt(i-pLen)-'a']--;
            }
            if (Arrays.equals(pArr, sArr)) {
                list.add(i-pLen+1);
            }
        }
        return list;
    }
}
