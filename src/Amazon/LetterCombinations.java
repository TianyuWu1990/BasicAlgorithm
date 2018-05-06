package Amazon;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinations {
    public List<String> letterCombination(String str) {
        LinkedList<String> ans = new LinkedList<>();
        if (str.isEmpty()) {
            return ans;
        }
        String[] mapping = new String[]{"", "", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"};

        ans.add("");
        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            while (ans.peek().length() == i) {
                String x = ans.remove();
                for (char c : mapping[digit].toCharArray()) {
                    ans.add(x + c);
                }
            }
        }
        return ans;
    }
}
