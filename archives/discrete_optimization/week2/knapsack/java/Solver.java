import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class Solver {
    public static int OPTIMALITY = 1;

    public static void solve(List<String> lines) throws IOException {
        // Parse the lines from standard input and fill items
        String[] firstLine = lines.get(0).split("\\s+");
        int n = Integer.parseInt(firstLine[0]);
        int K = Integer.parseInt(firstLine[1]);

        int[] values = new int[n];
        int[] weights = new int[n];
        for(int i = 1; i <= n; i++){
            String line = lines.get(i);
            String[] parts = line.split("\\s+");
            values[i-1] = Integer.parseInt(parts[0]);
            weights[i-1] = Integer.parseInt(parts[1]);
        }

        // Initialize variables
        long[][] matrix = new long[n+1][K+1];
        int item_i, value_i, weight_i;
        int[] is_taken = new int[n];
        for (int i = 1; i <= n; i++) {
            value_i = values[i-1];
            weight_i = weights[i-1];
            for (int j = 1; j <= K; j++) {
                // Unselect the i-th item if the weight is bigger than the specified capacity
                if (j < weight_i) matrix[i][j] = matrix[i-1][j];
                // Otherwise select the i-th item if its value makes the sum of values bigger
                else matrix[i][j] = Math.max(matrix[i-1][j], matrix[i-1][j-weight_i] + value_i);
            }
        }

        // Select the highest total value
        long value = matrix[n][K];

        // Determine which items achieve the highest total value
        int j = K;
        for (int i = n; i > 0; i--) {
            if (matrix[i][j] != matrix[i-1][j]) {
                is_taken[i-1] = 1;
                j -= weights[i-1];
            }
        }

        // Prepare the solution in the specified output format
        System.out.println(value + " " + OPTIMALITY);
        for (int i=  0; i < n; i++){
            System.out.print(is_taken[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        // Get the filepath from standard input
        String fileName;
        if (args[0].startsWith("-file=")) fileName = args[0].substring(6);
        else fileName = args[0];
        Path filePath = Paths.get(fileName);

        // Read the file content and solve the knapsack problem
        try {
            List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
            solve(lines);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
