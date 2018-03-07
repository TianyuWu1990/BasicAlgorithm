import java.lang.reflect.Array;
import java.util.ArrayList;

public class blooming {

    public static int latest(int[] input, int k){
        int[] bloom = new int[input.length];
        int result = -1;
        int date = 0;
        for(int slot:input){
            date += 1;
            bloom[slot-1] = 1;
            int continues = 0;
            int index_pre = -1;
            for(int i = 0; i < bloom.length; i++){
                if(bloom[i] == 1 && i == index_pre+1){
                    continues += 1;
                    index_pre = i;
                }else{
                    if(bloom[i] == 0 && continues == k){
                        result = date;
                    }
                    if(bloom[i] == 1 && i != index_pre+1) {
                        index_pre = i;
                        continues = 1;

                    }

                }
            }if(k == continues){
                result = date;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] input = {3,1,5,4,2};
        int k = 5;
        System.out.println(latest(input, k));
    }
}
