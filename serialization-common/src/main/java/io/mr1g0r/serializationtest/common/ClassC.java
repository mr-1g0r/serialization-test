package io.mr1g0r.serializationtest.common;

import java.io.Serializable;
import java.math.BigDecimal;

public class ClassC implements Serializable {
    private static final long serialVersionUID = 1L;

    private float floatFieldC;
    private byte byteFieldC;
    private BigDecimal bigDecimalFieldC;
    private String stringFieldC;
    private double doubleFieldC;
    private long longFieldC;

    @Override
    public String toString() {
        return "ClassC{" +
                "floatFieldC=" + floatFieldC +
                ", byteFieldC=" + byteFieldC +
                ", bigDecimalFieldC=" + bigDecimalFieldC +
                ", stringFieldC='" + stringFieldC + '\'' +
                ", doubleFieldC=" + doubleFieldC +
                ", longFieldC=" + longFieldC +
                '}';
    }
}
