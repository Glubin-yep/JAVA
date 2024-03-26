import Labs.Lab4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionTest {

    @Test
    public void testCalculate() {
        Lab4 function = new Lab4(2.4);
        double xStart = 1.0;
        double xEnd = 5.0;
        double step = 0.01;
        function.createArrays(xStart, xEnd, step);

        int testCaseIndex = 0;
        assertEquals(-0.06689484864237705, function.calculate(function.getXfromIndex(testCaseIndex)), 0.001);
        assertEquals(1.1590539551544452, function.calculate(function.getYfromIndex(testCaseIndex)), 0.001);

         testCaseIndex = 140;
        assertEquals(5.057621821307285E-8, function.calculate(function.getXfromIndex(testCaseIndex)), 0.001);
        assertEquals(0.9999998786170763, function.calculate(function.getYfromIndex(testCaseIndex)), 0.001);

         testCaseIndex = 400;
        assertEquals( 0, function.calculate(function.getXfromIndex(testCaseIndex)), 0.001);
        assertEquals(0, function.calculate(function.getYfromIndex(testCaseIndex)), 0.001);
    }}
