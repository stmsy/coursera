public class RamanujansTaxi {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int ub = (int) Math.ceil(Math.cbrt(n));

        // Print to standard output if the input is a Ramanujan's taxi number
        for (int i = 1; i <= ub; i++) {
            for (int j = 1; j <= ub; j++) {
                for (int k = 1; k <= ub; k++) {
                    for (int l = 1; l <= ub; l++) {
                        if (i < j && k < l && i < k && n == i*i*i + j*j*j && i*i*i + j*j*j == k*k*k + l*l*l)
                            System.out.println(i + "^3 + " + j + "^3 = " + k + "^3 + " + l + "^3");
                            // break;
                    }
                }
            }
        }
    }
}
