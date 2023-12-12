public class TrinomialBrute {
    // Returns the trinomial coefficient T(n, k)
    public static long trinomial(int n, int k) {
        long coeff;
        if (n == 0 && k == 0) coeff = 1;
        else if (k < -n || k > n) coeff = 0;
        else coeff = trinomial(n-1, k-1) + trinomial(n-1, k) + trinomial(n-1, k+1);
        return coeff;
    }

    // Takes two integer command-line arguments n and k and prints T(n, k)
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        long coeff = trinomial(n, k);
        StdOut.println(coeff);
    }
}
