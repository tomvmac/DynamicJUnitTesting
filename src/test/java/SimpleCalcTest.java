import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Tom Mac
 * Date: 7/19/14
 * Time: 12:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleCalcTest {

    @Test
    public void TestAddNumbers() {
        int a = 1;
        int b = 2;
        int c = 3;
        int expectedResult = 6;

        int actualResult = a + b +c;

        assertEquals(actualResult, expectedResult);

    }

}
