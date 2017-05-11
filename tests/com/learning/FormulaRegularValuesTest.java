package com.learning;

import org.junit.Test;
import static org.junit.Assert.*;

public class FormulaRegularValuesTest {

    @Test
    public void testDZero() {
        Formula formula = new Formula();
        assertEquals("x1 = " + (-1.0), formula.calculatex1(1, 2, 1));

    }
    @Test
    public void testDPositive() {
        Formula formula = new Formula();
        assertEquals("x1 = " + (-3.186140661634507) + "x2 = " + (-0.31385933836549285), formula.calculatex1(2, 7, 2));

    }
}