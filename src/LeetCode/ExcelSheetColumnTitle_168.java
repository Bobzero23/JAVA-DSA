package LeetCode;

public class ExcelSheetColumnTitle_168 {

    public String convertToTitle(int columnNumber) {
        StringBuilder title = new StringBuilder();

        while(columnNumber > 0) {
            columnNumber--;
            char c = (char) ('A' + columnNumber % 26);
            title.append(c);
            columnNumber /= 26;

        }

        return title.reverse().toString();
    }
    public static void main(String[] args) {
        int columnNumber = 701;
        ExcelSheetColumnTitle_168 object = new ExcelSheetColumnTitle_168();
        String result = object.convertToTitle(columnNumber);
        System.out.println(result);
    }
}
