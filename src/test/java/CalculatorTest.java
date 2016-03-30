package ru.lesson.lessons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author EgloUser
 * @date 16.02.2016.
 */
public class CalculatorTest {

    Calculator calc;

    @Before
    public void setUP(){
        calc = new Calculator();
    }

    @Test
    public void testAddSum() throws Exception {
        calc.addSum(2, 3);
        assertEquals(5, calc.getResult(), 0.0);
    }

    @Test
    public void testAddMinus() throws Exception {
        calc.addMinus(5, 2);
        assertEquals(3, calc.getResult(), 0.0);
    }

    @Test
    public void testAddMultiply() throws Exception {
        calc.addMultiply(5, 2);
        assertEquals(10, calc.getResult(), 0.0);
    }

    @Test
    public void testAddSharing() throws Exception {
        calc.addSharing(5, 2);
        assertEquals(2.5, calc.getResult(), 0.0);
    }

    @Test
    public void testAddDegree() throws Exception {
        calc.addDegree(5, 2);
        assertEquals(25, calc.getResult(), 0.0);
    }

    @Test
    public void testActionSelection() throws Exception {
        calc.actionSelection(33, 44, '+');
        assertEquals(77, calc.getResult(), 0.0);
    }
}