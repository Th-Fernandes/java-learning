import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//      printSamples();
        printArrayDiff();

//        int[] arr = {1, 2, 3, 2, 4, 4, 4, 4 ,4 ,4 };
//        int[] arr2 = Arrays.stream(arr).distinct().toArray();
//
//        for(int i = 0; i < arr2.length; i++)
//            System.out.println(arr2[i]);
//        Set<Integer> set = new HashSet<Integer>();
//        for (int i = 0; i < arr.length; i++)
//            set.add(arr[i]);
//        for(int el : set)
//            System.out.println(el);


    }

    private static void printSamples() {
        printUserFullName();
        printSquareNumbers();
        printMultidimensionalArray();
    }

    private static void printUserFullName() {
        User user =  new User();
        user.setName(getUserFullName());

        System.out.println(user.getFullName());
    }

    private static PersonName getUserFullName() {
        PersonName name = new PersonName();

        name.first = "Thiago";
        name.last = "Fernandes";

        return name;
    }
    private static void printSquareNumbers() {
        MethodOverLoading x = new MethodOverLoading();
        System.out.println(x.getSquare(3));
        System.out.println(x.getSquare(34.5f));
    }

    private static void printMultidimensionalArray() {
        MultidimensionalArray gameboard = new MultidimensionalArray();
        gameboard.setRow(new int[]{1, 2, 4});
        gameboard.setRow(new int[]{4, 8, 32});
        gameboard.getGameBoard();
    }

    private static void printArrayDiff() {
        int[] a = new int[] {1, 2, 3, 4};
        int[] b = new int[] {1, 4, 3};

        int[] Arr = new ArrayDiff().arrayDiff(a, b);

        for(int i = 0; i < Arr.length; i++)
            System.out.println(Arr[i]);
    }

}

