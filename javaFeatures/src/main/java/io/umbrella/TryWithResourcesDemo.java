package io.umbrella;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class TryWithResourcesDemo {

    public static void main(String[] args) throws IOException {

        Reader reader1 = new StringReader("This is a java 8 try with resources demo!");
        BufferedReader bufferedReader1 = new BufferedReader(reader1);
        try (BufferedReader bufferedReader = bufferedReader1) {
            System.out.println(bufferedReader.readLine());
        }

        Reader reader = new StringReader("This is a java 9+ try with resources demo!");
        BufferedReader bufferedReader = new BufferedReader(reader);
        try (bufferedReader) {
            System.out.println(bufferedReader.readLine());
        }
    }
}
