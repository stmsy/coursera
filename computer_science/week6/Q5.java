public class Q5 {
    public static int q5(int n) {
        int[] b = new int[n+1];
        b[0] = 1;

        for (int i = 2; i <= n; i++) {
            b[i] = 0;
            for (int j = 0; j < i; j++) {
                b[i] += b[j];
            }
        }

        return b[n];
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int value = q5(n);
        StdOut.println(value);
    }
}
