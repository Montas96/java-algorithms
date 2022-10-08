package io.umbrella;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner stringJoinerWhiteSpaceDelimiter = new StringJoiner(" ");
        stringJoinerWhiteSpaceDelimiter.add("Hello");
        stringJoinerWhiteSpaceDelimiter.add("World");
        stringJoinerWhiteSpaceDelimiter.add("!");

        StringJoiner stringJoiner = new StringJoiner(" ", "[","]");
        stringJoiner.add("TN");
        stringJoiner.add("FR");
        stringJoiner.add("USA");
        stringJoiner.add("UK");

        System.out.println(stringJoinerWhiteSpaceDelimiter);
        System.out.println(stringJoiner);
        System.out.println(stringJoiner.merge(stringJoinerWhiteSpaceDelimiter));
        System.out.println(stringJoiner.merge(stringJoinerWhiteSpaceDelimiter));

    }
}
