package LeetCode;

public class LicenseKeyFormatting {
    static String licenseKeyFormatting(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        int sLength = s.length();
        int counter = 0;

        for(int i = sLength - 1; i >= 0; i--){
            if (s.charAt(i) == '-') continue;

            if (counter == k) {
                stringBuilder.append('-');
                counter = 0;
            }

            stringBuilder.append(s.charAt(i));
            counter++;
        }

        return stringBuilder.reverse().toString().toUpperCase();
    }
    public static void main(String[] args) {
        String result = licenseKeyFormatting("2-5g-3-J", 2);
        System.out.println(result);
    }
}

/*PseudoCode
create 'stringBuilder' to store the answer
create a 'counter' to keep the track of count
loop through the given string backward
add the characters with length of 'k'
keep the track of the characters you add by increasing the counter each time
and if the length is equal to 'k' add '-' and restart the counter
do this to the ever character of the string until the end
then return the reversed 'stringBuilder' and make upperCase
*/
