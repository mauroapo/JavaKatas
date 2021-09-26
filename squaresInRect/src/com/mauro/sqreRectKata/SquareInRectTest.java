package com.mauro.sqreRectKata;

import org.junit.Test;
import java.util.List;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class SquareInRectTest
{
    @Test
    public void test1()
    {
        assertEquals(new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1)), SquaresInRect.sqInRect(5, 3));
    }
    @Test
    public void test2()
    {
        assertEquals(null, SquaresInRect.sqInRect(5, 5));
    }

    @Test
    public void test3()
    {
        assertEquals(new ArrayList<Integer>(Arrays.asList(102, 102, 102, 102, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 2, 2, 2, 2, 2)), SquaresInRect.sqInRect(418, 102));
    }
}
