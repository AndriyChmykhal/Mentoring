package com.learning;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by ASUS on 5/10/2017.
 */
public class FormulaTest {

    @Test
    public void testDZero() {
        Formula formula = new Formula();
        assertEquals("x1 = " + (-1.0), formula.calculate(1, 2, 1));

    }
    @Test
    public void testDPositive() {
        Formula formula = new Formula();
        assertEquals("x1 = " + (-3.186140661634507) + "x2 = " + (-0.31385933836549285), formula.calculate (2, 7, 2));

    }
}