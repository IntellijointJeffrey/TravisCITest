package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        assertTrue( true );
    }

    @Test
    public void addTest1(){
        assertEquals(2, App.addNums(1,1));
    }

    @Test
    public void addTest2(){
        assertEquals(1, App.addNums(1,1));
    }
}
