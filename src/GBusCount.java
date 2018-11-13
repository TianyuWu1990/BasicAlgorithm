import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 10
 10 15 5 12 40 55 1 10 25 35 45 50 20 28 27 35 15 40 4 5
 3
 5
 10
 27
 */
public class GBusCount {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/wutianyu/Downloads/A-large.txt");

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String st;
        List<List<String>> list = new ArrayList<List<String>>();

        assert br != null;
        int caseNum = Integer.parseInt(br.readLine());
        while ((st = br.readLine()) != null){
            List<String> new_list = new ArrayList<>();
            while(st != null && !st.equals("")){
                new_list.add(st);
                st = br.readLine();
            }
            list.add(new_list);
        }
        List<List<Integer>> ansList = new ArrayList<List<Integer>>();
        for (List<String> l : list) {
//            int busNum = Integer.parseInt(l.get(0));
            String[] stops_arr = l.get(1).split(" ");
            int[] city = new int[Integer.parseInt(l.get(2))];
            for (int i = 0; i < city.length; i++) {
                city[i] = Integer.parseInt(l.get(i+3));
            }
            int busCount;
            List<Integer> case_list = new ArrayList<>();
            for (int c : city) {
                busCount = count(stops_arr, c);
                case_list.add(busCount);
            }
            ansList.add(case_list);
        }

        PrintWriter writer = new PrintWriter("/Users/wutianyu/Downloads/output.txt", "UTF-8");

        for (int i = 0; i < ansList.size(); i++) {
            String s = "";
            s = ansList.get(i).toString().substring(1);
            s = s.substring(0, s.length()-1);
            s = s.replace(",", "");
            writer.println("Case #" + (i+1) + ": " + s);

        }
        writer.close();

    }

    private static int count(String[] stops, int city) {
        int ans = 0;
        int[] stops_arr = new int[stops.length];
        for (int i = 0; i < stops.length; i++) {
            stops_arr[i] = Integer.parseInt(stops[i]);
        }
        boolean start = true;
        for (int i = 0; i < stops.length - 1; i++) {
            if (start) {
                if (stops_arr[i] <= city && city <= stops_arr[i + 1] ) {
                    ans++;
                }
                start = !start;
                continue;
            }
            start = !start;

        }
        return ans;
    }
}

