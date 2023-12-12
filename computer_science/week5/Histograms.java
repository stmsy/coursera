public class Histograms {
    public static int[] histogram(int[] a, int m) {
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[a[i]]++;
        }
        return b;
    }

    public static void main(String args[]) {
        int[] a = StdArrayIO.readInt1D();
        int m = a.length;
        int[] b = histogram(a, m);
        StdArrayIO.print(b);
        StdOut.println();
    }
}
