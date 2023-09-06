package LeetCode_Premium;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings_271 {

    final char DELIMITER = '#';

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for(String str : strs) {
            encoded.append(str.length()).append(DELIMITER).append(str);
        }
        return encoded.toString();
    }


    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        char[] arr = str.toCharArray();

        return res;
    }
}
