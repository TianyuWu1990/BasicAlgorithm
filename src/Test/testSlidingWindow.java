package Test;

import DoublePointers.SlidingWindowMedian;
import com.sun.tools.javac.util.ArrayUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class testSlidingWindow {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner s = new Scanner(new File("/Users/wutianyu/Documents/BasicAlgorithm/src/Test/test.txt"));
        ArrayList<Integer> list = new ArrayList<Integer>();
        String st = "";
        while (s.hasNext()){
            st = st + s.next();
//            list.add(Integer.parseInt(s.next()));
        }
        s.close();
        String[] star = st.split(",");
        int[] array = new int[star.length];
        for (int i = 0; i < star.length; i++) {
            array[i] = Integer.parseInt(star[i]);
        }


        SlidingWindowMedian swm = new SlidingWindowMedian();
        System.out.println(swm.medianSlidingWindow(array, 9009));
    }
}
