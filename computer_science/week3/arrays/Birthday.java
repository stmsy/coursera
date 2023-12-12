public class Birthday {
    public static void main(String[] args) {
        double PROB = 0.50;

        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int i = 1;
        double fraction = 0.0;
        int[] counts = new int[n+2];
        // Repeat experiment until fraction exceeds 0.50
        // Upper bound for i is n, for n distinct birtdays
        while (fraction < PROB && i <= n) {
            for (int j = 0; j < trials; j++) {
                int found = 0;
                boolean[] birthdays = new boolean[n];
                int entered = 1;
                // Generate ith person's birthday and check duplicates
                while (entered < i + 1) {
                    int b = (int) (n * Math.random());
                    entered++;
                    if (!birthdays[b]) birthdays[b] = true;
                    else found++;
                }
                counts[i] += found;
            }
            fraction = ((double) counts[i]) / trials;
            System.out.printf("%d\t%d\t%f\n", i, counts[i] - counts[i-1], fraction);
            i++;
        }
    }
}
