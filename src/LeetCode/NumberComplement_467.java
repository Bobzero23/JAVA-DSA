package LeetCode;

public class NumberComplement_467 {
    public static void main(String[] args) {
        int num = 5;
        String binaryString = Integer.toBinaryString(num);
        binaryString = binaryString.replaceFirst("^0+(?!$)", "");

        char[] binaryStrArray = binaryString.toCharArray();

        int length = binaryStrArray.length;
        boolean checker = true;
    }
}
