package LeetCode;

public class AddStrings_415 {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        StringBuilder answer = new StringBuilder();
        int num1Last = num1.length() - 1;
        int num2Last = num2.length() - 1;

        while(num1Last >= 0 || num2Last >= 0 || carry > 0) {
            int sum = carry;
            if(num1Last >= 0) sum += num1.charAt(num1Last--) - '0';
            if(num2Last >= 0) sum += num2.charAt(num2Last--) - '0';
            carry = sum / 10;
            answer.append(sum % 10);
        }

        return answer.reverse().toString();
    }

    public static void main(String[] args) {
        AddStrings_415 object = new AddStrings_415();
        String result = object.addStrings("15", "85");
    }
}
