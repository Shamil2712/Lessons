package Lesson_12_junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
@Test
    public void testFactorial(){
    Factorial util=new Factorial();
    int result=util.calculateFactorial(5);
    assertEquals(120, result);
}

    private void assertArrayEquals(int i, int result) {
    }


}