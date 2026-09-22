import java.util.*;

class Solution {

    public int firstUniqChar(String str) {

        int index = -1;

        Map<Character, Integer> charFreqMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int freq = charFreqMap.getOrDefault(c, 0);
            charFreqMap.put(c, freq + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (charFreqMap.get(str.charAt(i)) == 1) {
                index = i;
                break;
            }
        }

        return index;
    }
}
