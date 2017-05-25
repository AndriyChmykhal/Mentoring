package com.learning;

import org.junit.Test;

public class FormulaExeptionsTest {
    @Test(expected = NullPointerException.class, timeout = 100)
    public void testAEqualsZero() {
        Formula formula = new Formula();
        formula.calculatex1(0, 2, 1);
    }
    @Test(expected = NullPointerException.class, timeout = 100)
    public void testDLessZero() {
        Formula formula = new Formula();
        formula.calculatex1(0.5, 1, 1);
    }
}