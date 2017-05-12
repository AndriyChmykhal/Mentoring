package com.learning;

import org.junit.Test;

public class FormulaExtremeValuesTest {
    @Test(expected = Exception.class, timeout = 100)
    public void testВEqualsZero() {
        Formula formula = new Formula();
        formula.calculatex1(1, 0, 1);
    }
}
