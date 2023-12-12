public class UnduplicateConsecutives {
    public static void main(String[] args) {
        // Degenerate case with no ipnuts
        if (StdIn.isEmpty()) {
            StdOut.println("No consecutive run");
            return;
        }

        int start = StdIn.readInt();  // Init with the 1st line of integer
        int count = 1;
        int longest = start;
        int longestCount = count;

        StdOut.print(start);

        while (!StdIn.isEmpty()) {
            // Read the 2nd and after line of integer
            int current = StdIn.readInt();

            // Update 'count' if 'current' is equal to 'start', or reinit them and print the value otherwise
            if (current == start) count++;
            else {
                start = current;
                count = 1;
                StdOut.print(" " + start);
            }
        }

        StdOut.println("");
    }
}
