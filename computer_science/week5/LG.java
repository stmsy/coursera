public class LG {
    public static int lg(int n) {
        int exp = 0;
        while (n / 2 > 0) {
            n /= 2;
            exp++;
        }
        return exp;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int exp = lg(n);
        // StdOut.println(exp);
        System.out.println(exp);
    }
}
