package sef.FinalActivity;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorSecondActivityTest {

    @Test
    public void testSum() {
        Assert.assertTrue(3 + 5 == Calculator_SecondActivity.sum(3, 5));
    }

    @Test
    public void testSubstract() {
        Assert.assertEquals(10 - 5, Calculator_SecondActivity.subtract(10, 5));
    }

    @Test
    public void testMultiply() {
        Assert.assertTrue(20 * 3 == Calculator_SecondActivity.multiply(20, 3));
    }

    @Test
    public void testDivision() {
        Assert.assertEquals((double) 20 / 4, Calculator_SecondActivity.divide(20, 4), 0);
    }

    @Test
    public void testDivisionByZero() {
        Assert.assertEquals((double) 10 / 0, Calculator_SecondActivity.divide(10, 0), 0);
    }

}
