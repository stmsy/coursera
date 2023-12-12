public class ActivationFunction {
    // Returns the Heaviside function of x
    public static double heaviside(double x) {
        if (x == Double.NaN) return Double.NaN;
        else if (x < 0.0) return 0.0;
        else if (x == 0.0) return 0.5;
        // else if (x > 0.0) return 1.0;
        return 1.0;
    }

    // Returns the sigmoid function of x
    public static double sigmoid(double x) {
        if (x == Double.NaN) return Double.NaN;
        return 1.0 / (1.0 + Math.exp(-x));
    }

    // Returns the hyperbolic tangent of x
    public static double tanh(double x) {
        if (x == Double.NaN) return Double.NaN;
        return (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
    }

    // Returns the softsign function of x
    public static double softsign(double x) {
        if (x == Double.NaN) return Double.NaN;
        return x / (1 + Math.abs(x));
    }

    // Returns the square nonlinearity function of x
    public static double sqnl(double x) {
        if (x == Double.NaN) return Double.NaN;
        else if (x <= -2.0) return -1.0;
        else if (x > -2.0 && x < 0.0) return x + Math.pow(x, 2) / 4;
        else if (x > 0.0 && x < 2.0) return x - Math.pow(x, 2) / 4;
        // else if (x >= 2.0) return 1.0;
        return 1.0;
    }

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        StdOut.printf("heaviside(%.1f) = %f\n", x, heaviside(x));
        StdOut.printf("  sigmoid(%.1f) = %f\n", x, sigmoid(x));
        StdOut.printf("     tanh(%.1f) = %f\n", x, tanh(x));
        StdOut.printf(" softsign(%.1f) = %f\n", x, softsign(x));
        StdOut.printf("     sqnl(%.1f) = %f\n", x, sqnl(x));
    }
}
