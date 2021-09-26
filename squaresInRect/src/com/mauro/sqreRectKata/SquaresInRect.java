package com.mauro.sqreRectKata;

import java.util.List;
import java.util.*;

public class SquaresInRect
{
    public static List<Integer> sqInRect(int lng, int wdth)
    {
        if(lng == wdth)
            return null;
        int areaNotFilled = lng*wdth;
        List<Integer> squareArray = new ArrayList<>();
        while(areaNotFilled > 0)
        {
            int square = findClosestSquareBelow(areaNotFilled, lng, wdth);
            int root = (int) Math.sqrt(square);
            squareArray.add(root);
            areaNotFilled -= square;
            if(lng > wdth)
            {
                lng -= root;
            }
            else
            {
                wdth -= root;
            }
        }
        return squareArray;
    }

    private static int findClosestSquareBelow(int inputNumber, int length, int width)
    {
        int closestSquare = inputNumber;
        while(Math.sqrt(closestSquare) % 1 != 0 || (Math.sqrt(closestSquare) > length || Math.sqrt(closestSquare) > width))
        {
            closestSquare -= 1;
        }
        return closestSquare;
    }
}
