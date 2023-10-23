import java.util.ArrayList;

public class Stream {
    private final static ArrayList<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) {
        setElementsToArray();
        if (isAllElementsGreaterThanZero())
            System.out.println("They are all greater than zero");
    }

    private static void setElementsToArray() {
        int MAX_RANGE = 6;
        for (int i = 1; i < MAX_RANGE; i++) numbers.add(i);
    }

    public static  boolean isAllElementsGreaterThanZero() {
        return numbers.stream()
                      .allMatch(n -> n > 0);
    }
}
