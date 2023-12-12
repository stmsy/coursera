public class GeneralizedHarmonic {
    public static void main(String args[]) {
        double n = Double.parseDouble(args[0]);
        int r = Integer.parseInt(args[1]);

        // Compute the generalized harmonic number
        double ghm = 0.0;
        for (int i = 1; i <= n; i++) ghm += 1 / Math.pow(i, r);

        System.out.println(ghm);
    }
}
