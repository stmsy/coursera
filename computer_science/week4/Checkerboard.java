public class Checkboard {
    public static void main(String[] args) {
        // Set the canvas scales
        int n = StdIn.readInt();
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);

        // Draw a checkboard with predefined grids
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 != 0) StdDraw.setPenColor(StdDraw.GRAY);
                else StdDraw.setPenColor(StdDraw.BLUE);
                StdDraw.filledSquare(i + 0.5, j + 0.5, 0.5);
            }
        }
    }
}
