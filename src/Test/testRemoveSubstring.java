package Test;

import Amazon.RemoveSubstrings;

import java.util.HashSet;
import java.util.Set;

public class testRemoveSubstring {
    public static void main(String[] args) {
        String s = "ccdaabcdbb";
        Set<String> dict = new HashSet<>();
        dict.add("ab");
        dict.add("cd");
        RemoveSubstrings rs = new RemoveSubstrings();
        System.out.println(rs.RemoveSubstrings(s, dict));
    }
}
