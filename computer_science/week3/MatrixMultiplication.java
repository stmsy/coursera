public class MatrixMultiplication {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int o = Integer.parseInt(args[2]);
        int p = Integer.parseInt(args[3]);

        if (n != o) System.out.println("Matrix multiplication is not defined.");
        else {
            int[][] A = new int[m][n];
            int[][] B = new int[o][p];
            int[][] C = new int[m][p];

            // Define A with randomly chosen integer entries
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++)
                    A[i][j] = (int) (Math.random() * 10);
            }
            System.out.println("A =");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (j < n-1) System.out.print(A[i][j] + " ");
                    else System.out.println(A[i][j]);
                }
            }

            // Define B with randomly chosen integer entries
            for (int i = 0; i < o; i++) {
                for (int j = 0; j < p; j++)
                    B[i][j] = (int) (Math.random() * 10);
            }
            System.out.println("B =");
            for (int i = 0; i < o; i++) {
                for (int j = 0; j < p; j++) {
                    if (j < p-1) System.out.print(B[i][j] + " ");
                    else System.out.println(B[i][j]);
                }
            }

            // Perform matrix multiplication whenever defined
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < p; j++) {
                    for (int k = 0; k < n; k++) C[i][j] += A[i][k] * B[k][j];
                }
            }
            System.out.println("C =");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < p; j++) {
                    if (j < p-1) System.out.print(C[i][j] + " ");
                    else System.out.println(C[i][j]);
                }
            }
        }

    }
}
