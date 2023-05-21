package hackerrank;

import java.util.Scanner;


public class Anagram {

        static boolean isAnagram(String a, String b) {

            String aString = a.toLowerCase();
            String bString = b.toLowerCase();

            char[] aCharArray = new char[26];
            char[] bCharArray = new char[26];

            for(char c: aString.toCharArray()) {
                aCharArray[c - 'a']++;
            }

            for(char c: bString.toCharArray()) {
                bCharArray[c - 'a']++;
            }

            for(int i = 0; i < aCharArray.length; i++) {
                if(aCharArray[i] != bCharArray[i]) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }


}
