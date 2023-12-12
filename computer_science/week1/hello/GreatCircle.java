public class GreatCircle {
    public static void main(String[] args) {
        double r = 6371.0;
        double half = 0.5;

        // Read from standard input two points in degrees and convert to radians
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        // Compute the great-circle distance
        double firstTerm = Math.pow(Math.sin(half*(x2-x1)), 2);
		double secondTerm = Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin(half*(y2-y1)), 2);
        double distance = 2*r * Math.asin(Math.sqrt(firstTerm + secondTerm));

        System.out.println(distance + " kilometers");
	}
}
