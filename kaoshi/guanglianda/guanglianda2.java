package guanglianda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class guanglianda2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        char shuzu[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            shuzu[i] = read.next().toCharArray();

        }
        spiralOrder(shuzu);

    }
    public static List<Character> spiralOrder(char[][] matrix) {
        List<Character> order = new ArrayList<Character>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return order;
        }
        int rows = matrix.length, columns = matrix[0].length;
        boolean[][] visited = new boolean[rows][columns];
        int total = rows * columns;
        int row = 0, column = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0;
        for (int i = 0; i < total; i++) {
            order.add(matrix[row][column]);
            if (matrix[row][column] != '0') {
                System.out.println(matrix[row][column]);
            }
            visited[row][column] = true;
            int nextRow = row + directions[directionIndex][0], nextColumn = column + directions[directionIndex][1];
            if (nextRow < 0 || nextRow >= rows || nextColumn < 0 || nextColumn >= columns || visited[nextRow][nextColumn]) {
                directionIndex = (directionIndex + 1) % 4;
            }
            row += directions[directionIndex][0];
            column += directions[directionIndex][1];

        }
        return order;
    }
}


