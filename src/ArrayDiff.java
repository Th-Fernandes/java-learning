import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayDiff {
    public int[] arrayDiff(int[] a, int[] b) {
        return removeAllCurrenciesFromArray(a, b);
    }

   static int[] removeAllCurrenciesFromArray(int[] a, int[] b) {
        int[] arrayDiff = Arrays.copyOf(a, a.length);

        for(int element : b) {
            int index = findIndexOf(arrayDiff, element);
            arrayDiff = removeElementByIndex(arrayDiff, index);
        }
        return  arrayDiff;
   }

    static int findIndexOf(int[] numbers, int target) {
        return IntStream.range(0, numbers.length)
                .filter(i -> numbers[i] == target)
                .findFirst()
                .orElse(-1);
    }

    static int[] removeElementByIndex(int[] arr, int index) {
        return IntStream.range(0, arr.length)
                .filter(i -> i != index)
                .map(i -> arr[i])
                .toArray();
    }
}
