public class PrimeCounter {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);

        // Print to standard out put all the prime numbers
        if (n > 2) {
            for (int i = 2; i <= n; i++) {
                boolean is_prime = true;
                for (int j = 2; j*j <= i; j++) {
                    if (i % j == 0) {
                        is_prime = false;
                        break;
                    }
                }
                if (is_prime) System.out.print(i + " ");
            }
        }
        else if (n == 2) System.out.print(n);
        System.out.println();
    }
}
