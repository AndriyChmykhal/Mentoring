package com.learning;



import static org.junit.Assert.assertEquals;

import junit.framework.Assert;
import org.junit.Test;

public class FormulaTest {


    @Test
    public void testCalculate() {
        Formula formula = new Formula();
        Assert.assertEquals("Parameter 'a' cannot be equal to zero for such formula. Please, change it for another value", formula.calculate(0, 2, 3));


    }

}








