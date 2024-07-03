package io.mr1g0r.serializationtest.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomizedTest {

    @Test
    void newWithRandomData() {
        final ClassA classA = ClassA.newWithRandomData();
        assertNotNull(classA);
        assertFalse(classA.toString().isEmpty());
        System.out.println(classA);
    }
}