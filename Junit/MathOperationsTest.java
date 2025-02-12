package com.mphasis.junit;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MathOperationsTest {
    @Test
    public void testAdd() {
        MathOperations math = new MathOperations();
        int result = math.add(3, 5);
        assertEquals(8, result);
    }
}
