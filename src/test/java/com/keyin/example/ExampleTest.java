package com.keyin.example;

import com.keyin.Example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    public void testMultiply(){
        Example exampleUnderTest = new Example();
        Assertions.assertEquals( 10,exampleUnderTest.multiply(10,1));
    }


    @Test
    public void testFormat() {

        Example exampleUnderTest = new Example();

        String source = "Test string formatting method";
        String expectedResult = "Test,string,formatting,method";
        Assertions.assertEquals(expectedResult, exampleUnderTest.format(source));

        source = " Test string formatting method ";
        expectedResult = "Test,string,formatting,method";
        Assertions.assertEquals(expectedResult, exampleUnderTest.format(source));


    }

}
