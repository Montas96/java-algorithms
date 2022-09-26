package codingame;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public static void main(String[] args) {
        String s = "ababcabcd";
        System.out.println(getLengthOfSubstringV2(s));
    }

    private static int getLengthOfSubstring(String s){
        int maxLength = 0;
        Map<Character, Integer> substring = new HashMap<>();

        for (int right = 0, left =0; right < s.length(); right++) {
            char currentCharacter = s.charAt(right);
            if(substring.containsKey(currentCharacter) && substring.get(currentCharacter) >= left ) {
                left = substring.get(currentCharacter) + 1;
            }
            substring.put(currentCharacter, right);
            maxLength = Math.max(maxLength, right -left +1);
        }
        return maxLength;
    }
    private static int getLengthOfSubstringV2(String s){
        int maxLength = 0;
        for (int right = 0, left =0; right < s.length(); right++) {
            int indexOfFirstAppearanceInString = s.indexOf(s.charAt(right), left);
            if(indexOfFirstAppearanceInString != right){
                left = indexOfFirstAppearanceInString +1;
            }
            maxLength = Math.max(maxLength, right -left +1);
        }
        return maxLength;
    }

}
