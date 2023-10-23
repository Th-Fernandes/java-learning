import java.util.ArrayList;

public class MultidimensionalArray {
    final private ArrayList<int[]> gameBoard = new ArrayList<int[]>();
    private int[] t = new int[5];


    public void setRow(int[] row) {
        gameBoard.add(row);
    }

    public void getGameBoard() {
        for(int[] row : gameBoard) {
            System.out.println("row number: " + row);

            for(int item : row)
                System.out.print(item + " ");
            System.out.println();
        }
    }
}

