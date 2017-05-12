package com.learning;

import org.junit.Test;
import static org.junit.Assert.*;
public class FormulaBoundaryValuesTest {
    @Test
    public void testMaxValue() {
        Formula formula = new Formula();
        assertNotEquals(1.7976931348623157E308, formula.calculatex1(Double.MAX_VALUE, Double.MAX_VALUE, Double.MIN_VALUE), 0.01);
    }
    @Test
    public void testMinValue() {
        Formula formula = new Formula();
        assertNotEquals(0, formula.calculatex1(Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE), 0.01);
    }
}