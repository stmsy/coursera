public class Kary {
    public static void main(String[] args) {
        long i = Long.parseLong(args[0]);
        int k = Integer.parseInt(args[1]);

        // Determine the largest power of k
        int power = 1;
        while (power <= i/k) power *= k;

        // Convert i into k-ary number and print to standard output
        while (power > 0 && i > 0) {
            long q = i / power;
            if (k >= 11) {
                if (q <= 9) System.out.print(q);
                else if (q == 10) System.out.print('A');
                else if (q == 11) System.out.print('B');
                else if (q == 12) System.out.print('C');
                else if (q == 13) System.out.print('D');
                else if (q == 14) System.out.print('E');
                else if (q == 15) System.out.print('F');
            }
            else System.out.print(q);
            i %= power;
            power /= k;
        }
        System.out.println();
    }
}
