package com.learning;

import org.junit.Test;

public class FormulaExeptionsTest {

    @Test(expected = Exception.class, timeout = 100)

    public void testAZero() {
        Formula formula = new Formula();
        formula.calculatex1(0, 2, 1);

    }
}