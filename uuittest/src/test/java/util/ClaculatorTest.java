package util;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorTest {


    @Test
    void testPowerBasePositivePowerZero() {

        Calculator calculator = new Calculator();
        int result = calculator.power(5,0);
        assertEquals(1, result);

    }

    @Test
    void testPowerBasePositivePowerOne() {
        Calculator calculator = new Calculator();
        int result = calculator.power(5,1);


        assertEquals(5, result);
    }



}

