public class AreRelativelyPrime {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int l = Integer.parseInt(args[1]);
        while (m >= 1 && l >= 1) {
            if (m < l) l %= m;
            else m %= l;
        }
        boolean is_rp = (m == 1 && l == 1);
        System.out.println(is_rp);
    }
}
