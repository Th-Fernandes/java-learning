import java.util.ArrayList;
import java.util.Arrays;

public class MultidimensionalArray {
    final private ArrayList<int[]> gameBoard = new ArrayList<int[]>();

    public void setRow(int[] row) {
        gameBoard.add(row);
    }

    public void getGameBoard() {
        for(int i = 0; i < gameBoard.size(); i++) {
            printRowIndex(i);
            int[] row = gameBoard.get(i);
            printRowElements(row);
            printBackSpaceAfterPrintAllRowElements();
        }
    }

    private void printRowIndex(int i) {
        System.out.println("row " + i);
    }

    private void  printBackSpaceAfterPrintAllRowElements() {
        System.out.println();
    }

    private void printRowElements(int[] row) {
        Arrays.stream(row)
                .forEach(el -> System.out.print(el + " "));
    }
}

