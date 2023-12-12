public class RandomWalker {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // Simulate a 2D random walk and compute the Manhattan distance
        int x = 0, y = 0;
        int r = 0;
        int steps = 0;
        while (r != n) {
            double move = Math.random();
            if (move < 0.25) y++;                       // Move north
            else if (move >= 0.25 && move < 0.50) x++;  // Move east
            else if (move >= 0.50 && move < 0.75) x--;  // Move west
            else y--;                                   // Move south
            System.out.println("(" + x + ", " + y + ")");
            r = Math.abs(x) + Math.abs(y);
            steps++;
        }
        System.out.println("steps = " + steps);
    }
}
