public class TrinomialDP {
    // Returns the trinomial coefficient T(n, k)
    public static long trinomial(int n, int k) {
        if (n == 0 && k == 0) return 1;
        if (k < -n || k > n) return 0;

        long[][] coeffs = new long[n+1][n+1];
        coeffs[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) coeffs[i][j] = coeffs[i-1][j] + 2 * coeffs[i-1][j+1];
                else if (i == j) coeffs[i][j] = coeffs[i-1][j-1];
                else coeffs[i][j] = coeffs[i-1][j-1] + coeffs[i-1][j] + coeffs[i-1][j+1];
            }
        }
        if (k < 0) return coeffs[n][Math.abs(k)];

        return coeffs[n][k];
    }

    // Takes two integer command-line arguments n and k and prints T(n, k)
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        long coeff = trinomial(n, k);
        StdOut.println(coeff);
    }
}
