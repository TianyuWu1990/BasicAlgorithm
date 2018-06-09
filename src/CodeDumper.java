public class CodeDumper {
    int n = 0;
    public int test(){
        helper();
        return n;
    }
    private void helper(){
        n = 1;
    }
}
