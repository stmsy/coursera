public class UniformRandomNumbers {
    public static void main(String[] args) {
        double[] random_numbers = new double[5];

        // Generate five random numbers between 0.0 and 1.0
        for (int i = 0; i < 5; i++)	{
            random_numbers[i] = Math.random();
		}

        // Get the average, max, and min of values in random_numbers
        double sum = 0.0;
        double min = 1.1;
        double max = -0.1;
        for (int i = 0; i < 5; i++) {
            sum += random_numbers[i];
			min = Math.min(min, random_numbers[i]);
            max = Math.max(max, random_numbers[i]);
		}
		double ave = sum / 5;

        // Print the results to standard output
        System.out.println("Average: " + ave);
        System.out.println("Minimum: " + min);
        System.out.println("Max: " + max);
	}
}
