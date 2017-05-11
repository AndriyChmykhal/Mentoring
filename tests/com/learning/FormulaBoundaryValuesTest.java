package com.learning;

import org.junit.Test;
import static org.junit.Assert.*;
public class FormulaBoundaryValuesTest {
    @Test
    public void testMaxValue() {
        Formula formula = new Formula();
        assertNotEquals(1.7976931348623157E308, formula.calculatex1(2, Double.MAX_VALUE, 2));

    }
}