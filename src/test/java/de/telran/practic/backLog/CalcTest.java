package de.telran.practic.backLog;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcTest {

    @BeforeEach
    void setUp() {
        System.out.println("----- Before Each -----");

    }

    @AfterEach
    void tearDown() {
        System.out.println("----- After Each -----");
    }

    @Test
    void addTest() {
        //Expected
        int expVal = 7;
        //When
        int arg1Test = 3;
        int arg2Test = 4;

        Calc calc = new Calc();
        int actualVal = calc.add(arg1Test, arg2Test);

        //Assert
        assertEquals(expVal, actualVal);
    }

    @Test
    void sub() {
    }

    @Test
    void mul() {
    }

    @Test
    void div() {
    }
}