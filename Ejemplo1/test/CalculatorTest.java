import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void AddBothPositive() {
        int n1 = 4;
        int n2 = 2;
        Calculator myCalc = new Calculator();
        assertEquals(6, myCalc.add(n1, n2));
    }

    @Test
    public void AddFirstPositiveSecondNegative() {
        int n1 = 5;
        int n2 = -3;
        Calculator myCalc = new Calculator();
        assertEquals(2, myCalc.add(n1, n2));
    }

    @Test
    public void AddFirstNegativeSecondPositive() {
        int n1 = -2;
        int n2 = 7;
        Calculator myCalc = new Calculator();
        assertEquals(5, myCalc.add(n1, n2));
    }

    @Test
    public void MultBothPositive() {
        int n1 = 4;
        int n2 = 7;
        Calculator myCalc = new Calculator();
        assertEquals(28, myCalc.Multiplication(n1, n2));
    }

    @Test
    public void MultFirstPositiveSecondNegative() {
        int n1 = 4;
        int n2 = -5;
        Calculator myCalc = new Calculator();
        assertEquals(-20, myCalc.Multiplication(n1, n2));
    }

    @Test
    public void MultFirstNegativeSecondPositive() {
        int n1 = -5;
        int n2 = 2;
        Calculator myCalc = new Calculator();
        assertEquals(-10, myCalc.Multiplication(n1, n2));
    }

    @Test
    public void MultBothNegative() {
        int n1 = -4;
        int n2 = -2;
        Calculator myCalc = new Calculator();
        assertEquals(8, myCalc.Multiplication(n1, n2));
    }
}
