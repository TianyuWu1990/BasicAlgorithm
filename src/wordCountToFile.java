import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.*;

public class wordCountToFile {

        public static void main(String args[]) {
            try {

                String pathname = "src/input.txt";
                File filename = new File(pathname);
                InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
                BufferedReader br = new BufferedReader(reader);
                String line = "";
                StringBuilder sb = new StringBuilder();

                while (line != null) {
                    line = br.readLine();
                    sb.append(line);
                }

                String[] words = sb.toString().replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+");

                Map<String, Integer> wordCount = new HashMap<>();
                for (String word: words) {
                    if (wordCount.containsKey(word)) {
                        wordCount.put(word, wordCount.get(word) + 1);
                    } else {
                        wordCount.put(word, 1);
                    }
                }

                StringBuilder rst = new StringBuilder();
                wordCount.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEachOrdered(e -> rst.append(e.getKey() + ":" + e.getValue() + " "));


                File writename = new File("output.txt");
                writename.createNewFile();
                BufferedWriter out = new BufferedWriter(new FileWriter(writename));
                out.write(rst.toString());
                out.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

