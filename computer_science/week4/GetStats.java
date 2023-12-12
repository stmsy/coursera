public class GetStats {
    public static void main(String[] args) {
        // Degenerate case with no ipnuts
        if (StdIn.isEmpty()) {
            StdOut.println("No stats to compute");
            return;
        }

        int n = 1;
        double prev = StdIn.readDouble();  // Init with the 1st line of real number
        double aveMagnitude = Math.abs(prev);
        double avePower = prev * prev;
        int numZeroCrossings = 0;

        while (!StdIn.isEmpty()) {
            // Read the 2nd and after line of real number
            double current = StdIn.readDouble();

            // Update numerators of two averages
            aveMagnitude += Math.abs(current);
            avePower += current * current;

            // Update 'numZeroCrossing' if 'prev' and 'current' have distinct signs
            if (prev * current < 0.0) numZeroCrossings++;

            // Update 'prev' with 'current' and increment 'n'
            prev = current;
            n++;
        }

        aveMagnitude /= n;
        avePower /= n;

        StdOut.println("Average Magnitude: " + aveMagnitude);
        StdOut.println("Average Power: " + avePower);
        StdOut.println("Number of Zero Crossings: " + numZeroCrossings);
    }
}
