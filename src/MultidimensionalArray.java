import java.util.ArrayList;

public class MultidimensionalArray {
    final private ArrayList<int[]> gameBoard = new ArrayList<int[]>();

    public void setRow(int[] row) {
        gameBoard.add(row);
    }

    public void getGameBoard() {
        for(int i = 0; i < gameBoard.size(); i++) {
            System.out.println("row " + i);
            int[] row = gameBoard.get(i);

            for(int item : row)
                System.out.print(item + " ");
            System.out.println();
        }
    }
}

