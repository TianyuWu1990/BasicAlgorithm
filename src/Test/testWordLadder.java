package Test;

import BFS.WordLadder;

import java.util.HashSet;
import java.util.Set;

public class testWordLadder {
    public static void main(String[] args) {
        String s = "eat";
        Set<String> dict = new HashSet<>();
        dict.add("abc");
        dict.add("ebt");
        dict.add("abt");
        dict.add("aet");

        WordLadder wl = new WordLadder();
        System.out.println(wl.ladderLength(s, "abp", dict));
    }
}
