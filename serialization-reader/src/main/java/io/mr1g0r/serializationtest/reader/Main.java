package io.mr1g0r.serializationtest.reader;

import io.mr1g0r.serializationtest.common.ClassA;

import java.io.*;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("Deserializing Class A->Class B->Class C");

        var classA = readObjectFromFile("classA_data.ser");
        if (classA.isPresent()) {
            final var expectedClassAStr = readTextFromFile("classA_string.txt");
            if (expectedClassAStr.compareToIgnoreCase(classA.get().toString()) == 0) {
                System.out.println("Deserialized and Serialized objects have the same payload");
            } else {
                System.out.printf("Expected:'%s'%nActual:'%s'%n", expectedClassAStr, classA.get());
            }
        }
    }

    private static Optional<ClassA> readObjectFromFile(final String fileName) {
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return Optional.of((ClassA) objectInputStream.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }


    public static String readTextFromFile(final String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}