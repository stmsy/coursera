public class RelativelyPrime {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // Determine inside the table whether i and j are relatively prime
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                boolean is_rp;
                String marker;
                if (i == 1 || j == 1) {
                    is_rp = true;
                }
                else {
                    int a = i, b = j;
                    int d;
                    is_rp = true;
                    if (a >= b) d = b;
                    else d = a;
                    for (int k = 2; k <= d; k++) {
                        if (i % k == 0 && j % k == 0) {
                            is_rp = false;
                            break;
                       }
                    }
                }
                if (is_rp) marker = "*";
                else marker = " ";
                if (j < n) System.out.print(marker + " ");
                else System.out.println(marker);
            }
        }
    }
}
