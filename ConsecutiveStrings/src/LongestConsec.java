import java.util.Arrays;
import java.util.Comparator;

public class LongestConsec
{
    public static String longestConsec(String[] strarr, int k)
    {
        String bigString = "";
        Integer arrSize = strarr.length;
        if(arrSize < k) return bigString;
        for(Integer i = 0; i < arrSize; i++)
        {
            String newBigString = "";
            Integer stringsAdded = 0;
            while(stringsAdded < k && i + stringsAdded < arrSize)
            {
                newBigString += strarr[i+stringsAdded];
                stringsAdded++;
            }
            if(newBigString.length() > bigString.length())
                bigString = newBigString;
        }
        return bigString;
    }

}
