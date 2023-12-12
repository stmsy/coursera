public class RandomWalkers {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int t = Integer.parseInt(args[1]);

        // Simulate a 2D random walk and compute the Manhattan distances
        int sum_steps = 0;
        for (int i = 0; i < t; i++) {
            int x = 0, y = 0;
            int r = 0;
            int steps = 0;
            while (r != n) {
                double move = Math.random();
                if (move < 0.25) y++;                       // Move north
                else if (move >= 0.25 && move < 0.50) x++;  // Move east
                else if (move >= 0.50 && move < 0.75) x--;  // Move west
                else y--;                                   // Move south
                r = Math.abs(x) + Math.abs(y);
                steps++;
            }
            sum_steps += steps;
        }
        double average_steps = sum_steps / (double) t;
        System.out.println("average number of stemps = " + average_steps);
    }
}
