package LeetCode;

public class ExcelSheetColumnNumber_171 {

        static int titleToNumber(String columnTitle) {
            int columnNumber = 0;
            int n = columnTitle.length();
            for (int i = n - 1; i >= 0; i--) {
                int value = columnTitle.charAt(i) - 'A' + 1;
                columnNumber += value * Math.pow(26, n - i - 1);
            }
            return columnNumber;
        }

    public static void main(String[] args) {
        String columnTitle = "AA";

        int result = titleToNumber(columnTitle);

        System.out.println(result);

    }


}
