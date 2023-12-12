public class Q2 {
    public static int q2(int n) {
        if (n <= 0) return 1;
        return 1 + q2(n-2) + q2(n-3);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int value = q2(n);
        StdOut.println(value);
    }
}
