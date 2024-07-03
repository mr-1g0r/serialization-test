package io.mr1g0r.serializationtest.writer;

import io.mr1g0r.serializationtest.common.ClassA;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main (String[]args) throws IOException {
        System.out.println("Serializing Class A->Class B->Class C ...");

        ClassA classA = ClassA.newWithRandomData();
        serializeObjectToFile(classA, "classA_data.ser");
        serializeStringToFile(classA.toString(), "classA_string.txt");
    }

    private static void serializeObjectToFile(final Serializable object, final String fileName) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(object);
        }
    }

    private static void serializeStringToFile(final String text, final String fileName) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8)) {
            osw.write(text);
        }
    }
}