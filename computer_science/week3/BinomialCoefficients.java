public class BinomialCoefficients {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // Compute a binomial distribution
        double[][] a = new double[n+1][n+1];
        if (n <= 0) System.out.println("An integer must be > 1");
        else {
            for (int i = 1; i <= n; i++) a[i][0] = 0.0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i == 1 && j == 1) a[i][j] = 1.0;
                    else a[i][j] = (a[i-1][j] + a[i-1][j-1]) / 2.0;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j < n) System.out.printf("a[%d][%d] = %f ", i, j, a[i][j]);
                else System.out.printf("a[%d][%d] = %f\n", i, j, a[i][j]);
            }
        }
    }
}
