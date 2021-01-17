package com.temp.junit.temptestcase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
public class FirstTestTest 
{
	
	@BeforeAll
    static void beforeAll() {
        System.out.println("Before all First test methods");
    }

     @AfterAll
    static void afterAll() {
        System.out.println("After all First test methods");
    }

/*    @Test
    @DisplayName("First test")
    void firstTest() {
        System.out.println("First test First method");
    }

    @Test
    @DisplayName("Second test")
    void secondTest() {
        System.out.println("Second test First method");
    }
    */
    @Test
    @DisplayName("Second test")
    void addtest() {
    	int c = FirstTest.add(10, 10);
    	assertEquals(30, c);
        System.out.println("Second test First method");
    }
    
    @Test
    @DisplayName("Second test")
    void subTest() {
    	int c = FirstTest.sub(10, -4);
    	assertEquals(5, c);
        System.out.println("Second test First method");
    }
}
