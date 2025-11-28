package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import com.driver.*;

public class TestCases {

    @Test
    public void testParentMethod(){
        A obj = new A();
        assertEquals("Invoking method from class A", obj.meth());
    }

    @Test
    public void testOverriddenMethod(){
        A obj = new B(); // parent reference holding child object
        assertEquals("Method is overridden in Extended class B", obj.meth());
    }

    @Test
    public void testDirectChildCall(){
        B obj = new B();
        assertEquals("Method is overridden in Extended class B", obj.meth());
    }
}
