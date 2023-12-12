public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int w = Integer.parseInt(args[1]);

        // Mark "*"s at main and off diagonal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) System.out.print("*");                  // Main diagonal
                else if (i < j && i+w >= j) System.out.print("*");  // Off diagonal, upper
                else if (j < i && j+w >= i) System.out.print("*");  // Off diagonal, lower
                else System.out.print(0);
                if (j < n-1) System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
