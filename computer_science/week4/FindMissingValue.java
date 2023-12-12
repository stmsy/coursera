public class FindMissingValue {
    public static void main(String[] args) {
        // Degenerate case with no ipnuts
        if (StdIn.isEmpty()) {
            StdOut.println("No missing value to find");
            return;
        }

        int n = StdIn.readInt();
        boolean[] isFound = new boolean[n+1];

        while (!StdIn.isEmpty()) {
            int j = StdIn.readInt();
            isFound[j] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!isFound[i]) StdOut.println(i);
        }
    }
}
