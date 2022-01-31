package br.com.johnidouglasmarangon;

import java.util.ArrayList;

public class StringSimilatity {

    public static Integer calc(String input) {

        ArrayList<String> suffixes = new ArrayList<String>();
        for (Integer i = 0; i < input.length(); i++) {
            suffixes.add(input.substring(i));
        }

        Integer count = 0;

        for (String string : suffixes) {
            for (Integer i = 0; i < string.length(); i++) {
                if (string.charAt(i) == input.charAt(i)) {
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }

}
