package telran.introduction;

import static org.junit.jupiter.api.Assertions.*;
import static telran.introduction.Calculations.*;
import org.junit.jupiter.api.Test;

public class CalculationsTest {
    @Test
    void sumTest() {
        assertEquals(4, sum(2, 2));
    }
    @Test
    void multiplyTest() {
        assertEquals(6, multiply(2, 3));
    }
    @Test
    void devideTest() {
        assertEquals(2, devide(6, 3));
        assertEquals(0, devide(6, 0));
    }
    @Test
    void subtractTest() {
        assertEquals(3, subtract(6, 3));
    }
    @Test
    void sumOfDigitsTest() {
        assertEquals(6, sumOfDigits(123));
        assertEquals(6, sumOfDigits(-123));
        assertEquals(1, sumOfDigits(1));
        assertEquals(0, sumOfDigits(0));
    }
    @Test
    void maxDigitTest() {
        assertEquals(3, maxDigit(123));
        assertEquals(3, maxDigit(-123));
        assertEquals(1, maxDigit(1));
        assertEquals(0, maxDigit(0));
    }
    @Test
    void isDevidedOnTest() {
        assertEquals(true, isDevidedOn(6, 3));
        assertEquals(false, isDevidedOn(6, 5));
        assertEquals(false, isDevidedOn(6, 0));
    }
}