import java.util.Arrays;

public class FindStrayNum {
    public static int stray(int[] numbers)
    {
        Arrays.sort(numbers);
        int max = numbers[numbers.length - 1];
        int min = numbers[0];
        long countMaxNum = Arrays.stream(numbers)
                .filter(num -> num == max)
                .count();
        long countMinNum = Arrays.stream(numbers)
                .filter(num -> num == min)
                .count();
        return countMaxNum > countMinNum ? min : max;
    }
}
