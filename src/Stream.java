import java.util.ArrayList;
import java.util.Arrays;

public class Stream {
    private final static ArrayList<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) {
        setElementsToArray();
        if (isAllElementsGreaterThanZero())
            System.out.println("They are all greater than zero");

        int[] first = {1, 2, 3};
        int[] second = {0, 1};
        int[] x = concatenate(first, second);

        removeDuplicates(x, x.length);
//
        for(int z : x) System.out.println("222: " + z);
    }

    private static void setElementsToArray() {
        int MAX_RANGE = 6;
        for (int i = 1; i < MAX_RANGE; i++) numbers.add(i);
    }

    public static  boolean isAllElementsGreaterThanZero() {
        int[] c = {1, 2, 1, 3, 2, 4};

        removeDuplicates(c, c.length);

        return numbers.stream().allMatch(n -> n > 0);
    }

    public static int[] concatenate(int[] first, int[] second){
        int[] newArr = new int[first.length + second.length];
        int index = 0;

        for(int el1 : first)  {
            newArr[index] = el1;
            index++;
        }

        for(int el2: second) {
            newArr[index] = el2;
            index++;
        }

        return newArr;
    }

    public static void removeDuplicates(int[] a, int n) {
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[n - 1];

        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
    }

}
