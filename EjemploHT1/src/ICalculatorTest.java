import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ICalculatorTest {

    ICalculator miCalculadora = new Calculador1();

    @Test
    public void testAdd() {
        assertEquals(5, miCalculadora.add(3, 2));
    }

    @Test
    public void testMult2Positives() {
        assertEquals(6, miCalculadora.mult(3, 2));
    }

    @Test
    public void testMult2Negatives() {
        assertEquals(6, miCalculadora.mult(-3, -2));
    }
}
