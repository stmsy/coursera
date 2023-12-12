public class Combinations {
    public static void powerSet(String s) {
        powerSet("", s);
    }

    public static void powerSet(String prefix, String s) {
        StdOut.println(prefix);
        for (int i = 0; i < s.length(); i++) powerSet(prefix + s.charAt(i), s.substring(i+1));
    }

    public static void powerSetTest(String s) {
        powerSetTest("", s);
    }

    public static void powerSetTest(String prefix, String s) {
        StdOut.println("=========================================");
        StdOut.printf("powerSetTest(%s, %s) called\n", prefix, s);
        StdOut.printf("prefix: %s\n", prefix);
        StdOut.printf("s: %s\n", s);
        for (int i = 0; i < s.length(); i++) {
            StdOut.printf("i: %d\n", i);
            StdOut.printf("s.charAt(i): %s\n", s.charAt(i));
            StdOut.printf("s.substring(i+1): %s\n", s.substring(i+1));
            powerSetTest(prefix + s.charAt(i), s.substring(i+1));
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        if (n > alphabet.length()) return;
        String elements = alphabet.substring(0, n);

        powerSetTest(elements);
    }
}
