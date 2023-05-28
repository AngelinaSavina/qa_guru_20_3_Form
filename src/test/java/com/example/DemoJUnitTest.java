package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DemoJUnitTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("There are new tests");
    }

    @Test
    void FirstTest(){
        Assertions.assertTrue(3>2);
    }

    @Test
    void SecondTest(){
        int result = 2+2;
        Assertions.assertTrue(3< result);
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Wow");
    }

}
