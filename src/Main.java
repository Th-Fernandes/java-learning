import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//      printSamples();
        printArrayDiff();

        Director paul = new Director();
        paul.getEmployeeName();
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
        int[] a = new int[] {1, 2};
        int[] b = new int[] {1};

        int[] Arr = new ArrayDiff().arrayDiff(a, b);

        for(int i = 0; i < Arr.length; i++)
            System.out.println(Arr[i]);
    }

}

