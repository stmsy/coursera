public class FindDuplicates {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // Init an array of length n with integer entries between 1 to n
        int[] a = new int[n];
        if (n > 1000) System.out.println("n must be <= 1000");
        else {
            for (int i = 0; i < n; i++) {
                int r = (int) (Math.random()*1000);
                int j = (r % n) + 1;
                a[i] = j;
                if (i < n-1) System.out.print(a[i] + " ");
                else System.out.println(a[i]);
            }
        }

        // Check whether or not an array contains duplicated values
        boolean is_duplicated = false;
        for (int i = 0; i < n-1; i++) {
            int j = i+1;
            while (!is_duplicated && j < n) {
                if (a[i] == a[j]) is_duplicated = true;
                else j++;
            }
            break;
        }
        System.out.println(is_duplicated);
    }
}
