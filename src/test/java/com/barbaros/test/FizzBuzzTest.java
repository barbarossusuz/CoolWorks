package com.barbaros.test;

import com.barbaros.test.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

/**
 * Created by Bar-Mel on 1.09.2016.
 */
public class FizzBuzzTest {

    private FizzBuzz fizzbuzz;

    @Before //refactor--> extract--> field-setup
    public void setUp() throws Exception {
        fizzbuzz = new FizzBuzz();
    }


    @Test
    public void testingEquality () throws Exception{

        assertEquals("fizz", fizzbuzz.divisible(3));
        assertEquals("fizz", fizzbuzz.divisible(12));
        assertEquals("buzz", fizzbuzz.divisible(5));
        assertEquals("buzz", fizzbuzz.divisible(20));
        assertEquals("fizzbuzz", fizzbuzz.divisible(30));
        assertEquals("input must be 3 or 5", fizzbuzz.divisible(4));

    }


    @Test
    public void testingError () throws Exception{
        assertEquals("buzz", fizzbuzz.divisible(45));
    }
}
