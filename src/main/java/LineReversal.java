import java.util.Arrays;

public class LineReversal {
    public static void main(String[] args) {
        String str = Arrays.toString(args);
        String result;
        int[] countReverse = {1000, 10_000, 100_000};
        result = cyclicalReverseStringAndAddTime(str, countReverse);

        System.out.println(result);
    }

    private static String cyclicalReverseStringAndAddTime(String str, int[] countReverse) {
        StringBuilder result = new StringBuilder();
        for (int i : countReverse) {
            String tempResult = "";
            long startTime = System.currentTimeMillis();
            for (int j = 0; j < i; j++) {
                tempResult = reverseString(str);
            }
            long endTime = System.currentTimeMillis();
            if (result.isEmpty()) {
                result.append(tempResult);
                result.append(" ");
                result.append(endTime - startTime);
            } else {
                result.append(" ");
                result.append(endTime - startTime);
            }
        }
        return result.toString();
    }

    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
