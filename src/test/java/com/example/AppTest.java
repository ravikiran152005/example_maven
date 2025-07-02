package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        App a=new App();
        int sum=a.add(5, 4);
        assertEquals(9, sum);
        
    }
}
