import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public  int[] arrayDiff(int[] a ,int[] b)  {
        int[] concatenatedArray = concatenate(a, b);
        int[] arrayDiff = removeDuplicates(concatenatedArray);

        return arrayDiff;
    }

    public static int[] concatenate(int[] first, int[] second) {
        return IntStream
                .concat(
                        Arrays.stream(first),
                        Arrays.stream(second)
                )
                .toArray();
    }

    public static int[] removeDuplicates(int[] a) {
        return Arrays.stream(a)
                .distinct()
                .toArray();
    }
}
