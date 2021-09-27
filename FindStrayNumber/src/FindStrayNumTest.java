import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindStrayNumTest
{
    @Test
    public void simpleArray1()
    {
        assertEquals(2, getActualFor(1, 1, 2));
        assertEquals(3, getActualFor(3, 5, 5, 5, 5));
        assertEquals(1, getActualFor(2, 1, 2, 2, 2));
    }

    private int getActualFor(int... numbers)
    {
        return FindStrayNum.stray(numbers);
    }

}
