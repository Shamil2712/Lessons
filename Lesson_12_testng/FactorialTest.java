package Lesson_12_testng;

import Lesson_12_junit5.Factorial;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.*;

public class FactorialTest {
    @Test
    public void testFactorial(){
        Lesson_12_junit5.Factorial util=new Factorial();
        int result=util.calculateFactorial(5);
        assertEquals(120, result);
    }

    private void assertArrayEquals(int i, int result) {
    }
}