package BFS;

import java.util.*;

public class WordLadder {

    public int ladderLength(String start, String end, Set<String> dict) {
        if (start.length() != end.length()) {
            return 0;
        }
        if (dict == null) {
            return 0;
        }

        int length = 1;
        if (start.equals(end)) {
            return length;
        }

        dict.add(start);
        dict.add(end);

        HashSet<String> hash = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        hash.add(start);

        while (!queue.isEmpty()) {
            length++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                for (String next : getNextWords(cur, dict)) {
                    if (!hash.contains(next)) {
                        if (next.equals(end)) {
                            return length;
                        }
                        hash.add(next);
                        queue.offer(next);
                    }
                }
            }
        }
        return 0;
    }
    private String replace(String s, int index, char c) {
        char[] newArr = s.toCharArray();
        newArr[index] = c;
        return new String(newArr);
    }

    private ArrayList<String> getNextWords(String word, Set<String> dict) {
        ArrayList<String> nextWords = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                if (c != word.charAt(i)) {
                    String nextWord = replace(word, i, c);
                    if (dict.contains(nextWord)) {
                        nextWords.add(nextWord);
                    }
                }

            }
        }
        return nextWords;
    }
}
    /**
     * Given two words (start and end), and a dictionary, find the length of shortest transformation sequence from start to end, such that:

     Only one letter can be changed at a time
     Each intermediate word must exist in the dictionary
     For example,

     Given:
     start = "hit"
     end = "cog"
     dict = ["hot","dot","dog","lot","log"]
     As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
     return its length 5.

     Note:
     Return 0 if there is no such transformation sequence.
     All words have the same length.
     All words contain only lowercase alphabetic characters.
     * @param start
     * @param end
     * @param dict
     * @return
     */
//    public int ladderLength(String start, String end, Set<String> dict) {
//        if (dict == null) {
//            return 0;
//        }
//
//        if (start.equals(end)) {
//            return 1;
//        }
//
//        dict.add(start);
//        dict.add(end);
//
//        HashSet<String> hash = new HashSet<String>();
//        Queue<String> queue = new LinkedList<String>();
//        queue.offer(start);
//        hash.add(start);
//
//        int length = 1;
//        while(!queue.isEmpty()) {
//            length++;
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                String word = queue.poll();
//                for (String nextWord: getNextWords(word, dict)) {
//                    if (hash.contains(nextWord)) {
//                        continue;
//                    }
//                    if (nextWord.equals(end)) {
//                        return length;
//                    }
//
//                    hash.add(nextWord);
//                    queue.offer(nextWord);
//                }
//            }
//        }
//        return 0;
//    }
//
//    // replace character of a string at given index to a given character
//    // return a new string
//    private String replace(String s, int index, char c) {
//        char[] chars = s.toCharArray();
//        chars[index] = c;
//        return new String(chars);
//    }
//
//    // get connections with given word.
//    // for example, given word = 'hot', dict = {'hot', 'hit', 'hog'}
//    // it will return ['hit', 'hog']
//    private ArrayList<String> getNextWords(String word, Set<String> dict) {
//        ArrayList<String> nextWords = new ArrayList<String>();
//        for (char c = 'a'; c <= 'z'; c++) {
//            for (int i = 0; i < word.length(); i++) {
//                if (c == word.charAt(i)) {
//                    continue;
//                }
//                String nextWord = replace(word, i, c);
//                if (dict.contains(nextWord)) {
//                    nextWords.add(nextWord);
//                }
//            }
//        }
//        return nextWords;
//    }
//}

// version: LeetCode
//public class Solution {
//    public int ladderLength(String start, String end, List<String> wordList) {
//        Set<String> dict = new HashSet<>();
//        for (String word : wordList) {
//            dict.add(word);
//        }
//
//        if (start.equals(end)) {
//            return 1;
//        }
//
//        HashSet<String> hash = new HashSet<String>();
//        Queue<String> queue = new LinkedList<String>();
//        queue.offer(start);
//        hash.add(start);
//
//        int length = 1;
//        while (!queue.isEmpty()) {
//            length++;
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                String word = queue.poll();
//                for (String nextWord: getNextWords(word, dict)) {
//                    if (hash.contains(nextWord)) {
//                        continue;
//                    }
//                    if (nextWord.equals(end)) {
//                        return length;
//                    }
//
//                    hash.add(nextWord);
//                    queue.offer(nextWord);
//                }
//            }
//        }
//
//        return 0;
//    }
//
//    // replace character of a string at given index to a given character
//    // return a new string
//    private String replace(String s, int index, char c) {
//        char[] chars = s.toCharArray();
//        chars[index] = c;
//        return new String(chars);
//    }
//
//    // get connections with given word.
//    // for example, given word = 'hot', dict = {'hot', 'hit', 'hog'}
//    // it will return ['hit', 'hog']
//    private ArrayList<String> getNextWords(String word, Set<String> dict) {
//        ArrayList<String> nextWords = new ArrayList<String>();
//        for (char c = 'a'; c <= 'z'; c++) {
//            for (int i = 0; i < word.length(); i++) {
//                if (c == word.charAt(i)) {
//                    continue;
//                }
//                String nextWord = replace(word, i, c);
//                if (dict.contains(nextWord)) {
//                    nextWords.add(nextWord);
//                }
//            }
//        }
//        return nextWords;
//    }
//}
