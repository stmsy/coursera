public class Factors {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);

        // Print to standard out all the prime factors with duplicates
        long factor = 2;
        while (factor*factor <= n) {
            while (n % factor == 0) {
                System.out.print(factor + " ");
                n /= factor;
            }
            factor++;
        }
        if (n > 1) System.out.print(n);
        System.out.println();
    }
}
