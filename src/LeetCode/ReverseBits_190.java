package LeetCode;

public class ReverseBits_190 {
        static int reverseBits(int n) {
        String binaryString = Integer.toBinaryString(n);
        StringBuilder binaryStringBuilder = new StringBuilder(binaryString);

         while(binaryStringBuilder.length() < 32) {
             binaryStringBuilder.insert(0, "0");
         }

        binaryStringBuilder.reverse();
        int answer = Integer.parseInt(binaryStringBuilder.toString(), 2);
        return answer;
     }

    public static void main(String[] args) {
        // impossible :- by thanos
    }
}
