public class LongestRun {
    public static void main(String[] args) {
        // Degenerate case with no ipnuts
        if (StdIn.isEmpty()) {
            StdOut.println("No longest consecutive run");
            return;
        }

        int start = StdIn.readInt();  // Init with the 1st line of integer
        int count = 1;
        int longest = start;
        int longestCount = count;

        while (!StdIn.isEmpty()) {
            // Read the 2nd and after line of integer
            int current = StdIn.readInt();

            // Update 'count' if 'current' is equal to 'start', or reinit them otherwise
            if (current == start) count++;
            else {
                start = current;
                count = 1;
            }

            // Update the 'longest' and 'longestCount' if applicable
            if (count > longestCount) {
                longest = current;
                longestCount = count;
            }
        }

        StdOut.println("Longest run: " + longestCount + " concescutive " + longest + "s");
    }
}
