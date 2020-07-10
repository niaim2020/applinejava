import calculator.Operations;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {
    @Test
    public void testAddition() {
        Operations operation = new Operations();
        Assert.assertEquals(11, operation.addition(5,6), 0.0001);
        Assert.assertEquals(11.95f, operation.addition(8.95f,3f), 0.0001);
    }

    @Test
    public void testSubtraction() {
        Operations operation = new Operations();
        Assert.assertEquals(11, operation.subtraction(17,6), 0.0001);
        Assert.assertEquals(11.95f, operation.subtraction(14.95f,3f), 0.0001);
    }

    @Test
    public void testDivision() {
        Operations operation = new Operations();
        Assert.assertEquals(11, operation.division(66,6), 0.0001);
        Assert.assertEquals(11.95f, operation.division(35.85f,3f), 0.0001);
    }

    @Test
    public void testMultiplication() {
        Operations operation = new Operations();
        Assert.assertEquals(10, operation.multiplication(5,2), 0.0001);
        Assert.assertEquals(11.95f, operation.multiplication(2.9875f,4f), 0.0001);
    }
}
