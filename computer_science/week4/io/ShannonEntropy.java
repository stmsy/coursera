public class ShannonEntropy {
    public static void main(String args[]) {
        // Read the upper bound for the sequence
        int m = Integer.parseInt(args[0]);

        int[] sequence = new int[m+1];
        int n = 0;  // Get the length of sequence
        double H = 0.0;

        while (!StdIn.isEmpty()) {
            int i = StdIn.readInt();
            sequence[i]++;
            n++;
        }

        // Compute the Shannon Entropy
        for (int i = 1; i <= m; i++) {
            if (sequence[i] > 0) {
                double p = ((double) sequence[i]) / n;
                H -= p * (Math.log(p) / Math.log(2));
            }
        }

        StdOut.println(H);
    }
}
