public class RandomWalk {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // Simulate a 2D random walk
        int north = 0;
        int east = 0;
        int west = 0;
        int south = 0;
        int count = 0;
        while (north < n || east < n || west < n || south < n) {
            double move = Math.random();
            if (move < 0.25) north++;
            else if (move >= 0.25 && move < 0.50) east++;
            else if (move >= 0.50 && move < 0.75) west++;
            else south++;
            count++;
        }
        System.out.println(count);
    }
}
