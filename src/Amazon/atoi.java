package Amazon;

public class atoi {
    public static int myAtoi(String str) {
        if (str == null || str.equals("")) {
            return 0;
        }

        String slim = str.trim();
        long result = 0;

        if (slim.equals("")) {
            return 0;
        }

        boolean isNeg = false;
        int i = 0;
        char firstChar = slim.charAt(0);
        if (firstChar == '-') {
            isNeg = true;
            i = 1;
        } else if (firstChar == '+') {
            i = 1;
        } else if (!Character.isDigit(firstChar)) {
            return 0;
        }

        while (i < slim.length() && Character.isDigit(slim.charAt(i))) {
            result = result * 10 + Character.getNumericValue(slim.charAt(i));
            if (result > Integer.MAX_VALUE) {
                return isNeg? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            i++;
        }
        return isNeg? (int)result * -1 : (int)result;
    }

    public static void main(String[] args) {
        String t = "  1223422342323253ae";
        System.out.println(myAtoi(t));
    }

}
