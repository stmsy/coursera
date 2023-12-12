public class FourierSpikes {
    public static void fourierSpikes(int n, int m) {
        double[] t = new double[m+1];
        double[] f = new double[m+1];
        int s = m / 2;
        for (int i = 0; i <= m; i++) {
            t[i] = Math.PI * (i - s) / m;
            for (int j = 1; j <= n; j++) {
                f[i] += Math.cos(j * t[i]);
                f[i] /= n;
            }
        }

        // Plot the approximation to the smooting function
        for (int i = 0; i < m; i++) {
            StdDraw.line(t[i], f[i], t[i+1], f[i+1]);
        }
    }

    public static void main(String[] args) {
        int m = 10000;
        int n = Integer.parseInt(args[0]);

        // Define the bounding box with width and height
        int width = 500;
        int height = 500;

        // Set the canvas with appropriate scales
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(-10, 10);
        StdDraw.setYscale(-10, 10);

        fourierSpikes(n, m);
    }
}
