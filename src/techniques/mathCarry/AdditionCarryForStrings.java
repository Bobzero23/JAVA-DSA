package techniques.mathCarry;

public class AdditionCarryForStrings {

    public static String addString(String num1, String num2){
        StringBuilder sb = new StringBuilder();

        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while(i >= 0 || j >= 0) {
            int sum = carry;
            if (i < num1.length()) sum += num1.charAt(i--) - '0';
            if (j < num2.length()) sum += num2.charAt(j--) - '0';
            sb.append(sum % 10);
            carry = sum >= 10 ? 1 : 0;
        }

        return sb.reverse().toString();
    }

    public static int[] addArray(int[] array1, int[] array2) {
        int[] answer = new int[10];

        int carry = 0;
        int i = array1.length - 1;
        int j = array2.length - 1;

        while(i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += array1[i--];
            if (j >= 0) sum += array2[j--];
        }

        return answer;
    }

    public static void main(String[] args) {
        String result = addString("275", "875");
        System.out.println(result);
    }
}
