package leetcode;

import java.util.*;

public class RomantoInteger {

    /**
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     */

    public static void main(String[] args) {
        int mcmxciv1994 = romanToInt("MCMXCIV");
        System.out.println(mcmxciv1994 + " expected " +mcmxciv1994);

        int LVIII58 = romanToInt("LVIII");
        System.out.println(LVIII58 + " expected " +LVIII58);
    }

    public static int romanToInt(String s) {

        int number = 0;
        Map<Character, Integer> characters =  Map.of('M', 1000, 'D',500, 'C', 100, 'L', 50,'X', 10,'V', 5, 'I', 1);
        int length = s.length();
        for (int index = 0; index < length; index++) {
            int value = characters.get(s.charAt(index));
            if(index+1  < length && characters.get(s.charAt(index)) < characters.get(s.charAt(index + 1))){
                value *= -1;
            }
            number += value;
        }
        return number;

    }
}
