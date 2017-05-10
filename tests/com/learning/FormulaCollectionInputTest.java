package com.learning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value=Parameterized.class)
public class FormulaCollectionInputTest {
    private String expected;
    private double a, b, c;
    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList( new Object[ ][ ] { { "x1 = " + (-1.0), 1, 2, 1 }, {"x1 = " + (-3.186140661634507) + "x2 = " + (-0.31385933836549285), 2, 7, 2 } });
    }
    public FormulaCollectionInputTest(String expected, double a, double b, double c) { // constructor
        this.expected = expected;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Test
    public void calculate() {
        assertEquals(expected, new Formula().calculate(a, b, c));
    }
}
