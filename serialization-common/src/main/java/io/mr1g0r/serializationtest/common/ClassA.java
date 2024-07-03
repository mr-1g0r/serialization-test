package io.mr1g0r.serializationtest.common;

import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;
import org.jeasy.random.randomizers.number.BigDecimalRandomizer;

import java.io.Serializable;
import java.math.BigDecimal;

public class ClassA implements Serializable {
    // If the serialVersionUID field is not defined in a class,
    // the Java Virtual Machine (JVM) will automatically create one.
    //
    // Note generated or default serialVersionUID can change between
    // different Java versions or even different JVMs
    // (although the chance of a conflict is relatively low)
    //
    // Hence to avoid any unexpected InvalidClassExceptions during
    // the process of deserialization, it's generally a good idea
    // to specify a serialVersionUID in serializable classes.
    private static final long serialVersionUID = 1L;

    private ClassB classB;
    private int integerFieldA;
    private boolean booleanFieldA;
    private char charFieldA;
    private String stringFieldA;
    private double doubleFieldA;
    private long longFieldA;
    private BigDecimal bigDecimalFieldA;

    public static ClassA newWithRandomData() {
        final EasyRandomParameters params = new EasyRandomParameters();
        params.collectionSizeRange(1, 5);
        params.stringLengthRange(10, 100);
        params.randomize(BigDecimal.class, new BigDecimalRandomizer(Integer.valueOf(4)));
        final EasyRandom randomizer = new EasyRandom(params);
        return randomizer.nextObject(ClassA.class);
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "classB=" + classB +
                ", integerFieldA=" + integerFieldA +
                ", booleanFieldA=" + booleanFieldA +
                ", charFieldA=" + charFieldA +
                ", stringFieldA='" + stringFieldA + '\'' +
                ", doubleFieldA=" + doubleFieldA +
                ", longFieldA=" + longFieldA +
                ", bigDecimalFieldA=" + bigDecimalFieldA +
                '}';
    }
}
