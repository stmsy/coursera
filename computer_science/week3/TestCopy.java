public class TestCopy {
    public static void main(String[] args) {
        int[] b = {1, 2, 3};
        int[] c = b;

        c[0] += b[2];
        c[1] += b[1];
        c[2] += b[0];

        System.out.println(c[0] + c[1] + c[2]);
    }
}
