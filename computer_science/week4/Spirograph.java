public class Spirograph {
    public static void main(String[] args) {
        // Number of line segments to plot
        int n = 100000;

        double R = StdIn.readDouble();
        double r = StdIn.readDouble();
        double a = StdIn.readDouble();

        double[] t = new double[n+1];
        double[] x = new double[n+1];
        double[] y = new double[n+1];

        for (int i = 0; i <= n; i++) {
            t[i] = Math.PI * i / n;
            x[i] = (R + r)*Math.cos(t[i]) - (r + a)*Math.cos((R + r)*t[i] / r);
            y[i] = (R + r)*Math.sin(t[i]) - (r + a)*Math.sin((R + r)*t[i] / r);
        }

        // Rescale the coordinate system
        StdDraw.setXscale(-Math.PI, Math.PI);
        StdDraw.setYscale(-(R + r), R + r);

        // Plot the approximation to the function
        for (int i = 0; i <= n; i++) {
            StdDraw.line(x[i], y[i], x[i+1], y[i+1]);
        }
    }
}
