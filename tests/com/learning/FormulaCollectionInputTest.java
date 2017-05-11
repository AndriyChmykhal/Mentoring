package com.learning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value=Parameterized.class)
public class FormulaCollectionInputTest {
    private double expected1;
    private double expected2;
    private double a, b, c;
    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList( new Object[ ][ ] {
                { -1.0, -1.0, 1, 2, 1 },
                {-3.18, -0.31, 2, 7, 2 }
        });
    }
    public FormulaCollectionInputTest(double expected1, double expected2, double a, double b, double c) { // constructor
        this.expected1 = expected1;
        this.expected2 = expected2;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Test
    public void calculate() {
        assertEquals(expected1, new Formula().calculatex1(a, b, c), 0.01);
        assertEquals(expected2, new Formula().calculatex2(a, b, c),0.01);
    }
}
