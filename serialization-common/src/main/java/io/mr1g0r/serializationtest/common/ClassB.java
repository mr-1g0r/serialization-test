package io.mr1g0r.serializationtest.common;

import java.io.Serializable;
import java.math.BigDecimal;

public class ClassB implements Serializable {
    private static final long serialVersionUID = 1L;

    private ClassC classC;
    private double doubleFieldB;
    private long longFieldB;
    private BigDecimal bigDecimalFieldB;
    private String stringFieldB;

    @Override
    public String toString() {
        return "ClassB{" +
                "classC=" + classC +
                ", doubleFieldB=" + doubleFieldB +
                ", longFieldB=" + longFieldB +
                ", bigDecimalFieldB=" + bigDecimalFieldB +
                ", stringFieldB='" + stringFieldB + '\'' +
                '}';
    }
}
