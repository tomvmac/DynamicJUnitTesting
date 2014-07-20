package addnumbers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import addnumbers.Addition;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AdditionTest {

    private String testName;
    private String expected;
    private String first;
    private String second;

    public AdditionTest(String testName, String expectedResult, String firstNumber,
                             String secondNumber) {
        this.testName = testName;
        this.expected = expectedResult;
        this.first = firstNumber;
        this.second = secondNumber;
    }

    @Parameters
    public static Collection<String[]> addedNumbers() {
        return Arrays.asList(new String[][] { { "AdditionTest1", "3", "8", "2" }, { "AdditionTest2", "5", "2", "3" },
                { "AdditionTest3", "7", "3", "4" }, { "AdditionTest4", "9", "4", "5" }, });
    }

    @Test
    public void sum() {
        Addition add = new Addition();
        System.out.println("Test Case  - " + testName + ": " + first + " and "
                + second);
        assertEquals(expected, add.addNumbers(first, second));
    }
}