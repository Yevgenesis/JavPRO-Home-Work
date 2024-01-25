package de.telran.homeWork.hw_22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayHandlerTest {

    @Test
    void removeDuplicatesTest() {
        //expected
        int[] expected = {0, 3, -2, 4, 2};
        //when

        int[] array = {0, 3, -2, 4, 3, 2};
        int[] actualValues = ArrayHandler.removeDuplicates(array);

        //Assert
        assertArrayEquals(expected, actualValues);
    }

    @Test
    void getSecondMinNumTest() {
        //expected:
        int expected = -1;
        //when

        int[] arr = {-1, 4, 0, 2, 7, -3};
        int actualValue = ArrayHandler.getSecondMinNum(arr);

        //Assert
        assertEquals(expected, actualValue);
    }

    @Test
    void getSecondMaxNumTest() {
        //expected:
        int expected = 4;
        //when

        int[] arr = {-1, 4, 0, 2, 7, -3};
        int actualValue = ArrayHandler.getSecondMaxNum(arr);

        //Assert
        assertEquals(expected, actualValue);
    }

    @Test
    void getCommonArrayElementsTest() {
        //expected
        int[] expected = {1, 7};
        //when

        int[] Array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] Array2 = {1, 0, 6, 15, 6, 4, 7, 0};
        int[] actualValue = ArrayHandler.GetCommonArrayElements(Array1, Array2);

        // Assert

        assertArrayEquals(expected, actualValue);
    }
}