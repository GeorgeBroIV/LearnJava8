package com.stoneplayground.learnjava8.lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld(){

        Person george = new Person();
        assertEquals( "Hello World", george.helloWorld() );
    }
}
