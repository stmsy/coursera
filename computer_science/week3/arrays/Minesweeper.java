public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        // Define locations of k mines
        boolean[][] mines = new boolean[m][n];
        int num_mines = 0;
        while (num_mines < k) {
            int row = (int) (m * Math.random());
            int column = (int) (n * Math.random());
            if (mines[row][column] != true) {
                mines[row][column] = true;
                num_mines++;
            }
        }

        // Draw a Minesweeper map
        String marker = "";
        if (m == 1) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                if (mines[0][j]) marker = "*";
                // Left corner
                else if (j == 0) {
                    if (!mines[0][j]) {
                        if (mines[0][j+1]) count++;
                    }
                    marker = String.valueOf(count);
                }
                // Right corner
                else if (j == n-1) {
                    if (!mines[0][j]) {
                        if (mines[0][j-1]) count++;
                    }
                    marker = String.valueOf(count);
                }
                else if (j > 0 && j < n-1) {
                    if (mines[0][j-1]) count++;
                    if (mines[0][j+1]) count++;
                    marker = String.valueOf(count);
                }
                if (j < n-1) System.out.print(marker + "  ");
                else System.out.println(marker);
            }
        }
        else if (n == 1) {
            for (int i = 0; i < m; i++) {
                int count = 0;
                if (mines[i][0]) marker = "*";
                // Top corner
                else if (i == 0) {
                    if (!mines[i][0]) {
                        if (mines[i+1][0]) count++;
                    }
                    marker = String.valueOf(count);
                }
                // Bottom corner
                else if (i == m-1) {
                    if (!mines[i][0]) {
                        if (mines[i-1][0]) count++;
                    }
                    marker = String.valueOf(count);
                }
                else if (i > 0 && i < m-1) {
                    if (mines[i-1][0]) count++;
                    if (mines[i+1][0]) count++;
                    marker = String.valueOf(count);
                }
                System.out.println(marker);
            }
        }
        else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int count = 0;
                    if (mines[i][j]) marker = "*";
                    // Left top corner
                    else if (i == 0 && j == 0) {
                        if (mines[i][j+1]) count++;
                        if (mines[i+1][j]) count++;
                        if (mines[i+1][j+1]) count++;
                        marker = String.valueOf(count);
                    }
                    // Right top corner
                    else if (i == 0 && j == n-1) {
                        if (mines[i][j-1]) count++;
                        if (mines[i][j-1]) count++;
                        if (mines[i+1][j]) count++;
                        marker = String.valueOf(count);
                    }
                    // Left down corner
                    else if (i == m-1 && j == 0) {
                        if (mines[i-1][j]) count++;
                        if (mines[i-1][j+1]) count++;
                        if (mines[i][j+1]) count++;
                        marker = String.valueOf(count);
                    }
                    // Right down corner
                    else if (i == m-1 && j == n-1) {
                        if (mines[i-1][j-1]) count++;
                        if (mines[i-1][j]) count++;
                        if (mines[i][j-1]) count++;
                        marker = String.valueOf(count);
                    }
                    else if (i > 0 && i < m-1 && j > 0 && j < n-1) {
                        if (mines[i-1][j-1]) count++;
                        if (mines[i-1][j]) count++;
                        if (mines[i-1][j+1]) count++;
                        if (mines[i][j-1]) count++;
                        if (mines[i][j+1]) count++;
                        if (mines[i+1][j-1]) count++;
                        if (mines[i+1][j]) count++;
                        if (mines[i+1][j+1]) count++;
                        marker = String.valueOf(count);
                    }
                    else if ((i == 0 || i == m-1) && j > 0 && j < n-1) {
                        if (mines[i][j-1]) count++;
                        if (mines[i][j+1]) count++;
                        if (i == 0) {
                            if (mines[i+1][j-1]) count++;
                            if (mines[i+1][j]) count++;
                            if (mines[i+1][j+1]) count++;
                        }
                        else if (i == m-1) {
                            if (mines[i-1][j-1]) count++;
                            if (mines[i-1][j]) count++;
                            if (mines[i-1][j+1]) count++;
                        }
                        marker = String.valueOf(count);
                    }
                    else if (i > 0 && i < m-1 && (j == 0 || j == n-1)) {
                        if (mines[i-1][j]) count++;
                        if (mines[i+1][j]) count++;
                        if (j == 0) {
                            if (mines[i-1][j+1]) count++;
                            if (mines[i][j+1]) count++;
                            if (mines[i+1][j+1]) count++;
                        }
                        else if (j == n-1) {
                            if (mines[i-1][j-1]) count++;
                            if (mines[i][j-1]) count++;
                            if (mines[i+1][j-1]) count++;
                        }
                        marker = String.valueOf(count);
                    }
                    if (j < n-1) System.out.print(marker + "  ");
                    else System.out.println(marker);
                }
            }
        }
    }
}
