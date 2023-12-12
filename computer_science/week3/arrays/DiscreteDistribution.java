public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);

        // Read from sandard input a squence of integers
        int[] a = new int[args.length-1];  // args.length = n+1
        int total = 0;  // Cumulative sum

        for (int i = 0; i < a.length && i < args.length; i++) {
            a[i] = Integer.parseInt(args[i+1]);
            total += a[i];
        }

        // Generate random integers with probability proportional to frequency
        for (int i = 0; i < m; i++) {
            int r = (int) (total * Math.random()); // r in [0, total)
            int sum = 0;
            int event = -1;
            for (int j = 0; j < a.length && sum <= r; j++) {
                sum += a[j];
                event = j+1;  // event labeled from 1 to n
            }
            if (i < m-1) System.out.print(event + " ");
            else System.out.println(event);
        }
    }
}
