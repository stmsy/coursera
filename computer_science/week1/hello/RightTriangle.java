public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Check whether or not a triangle is right
		boolean isRightTriangle = ((a > 0 && b > 0 && c > 0) && (a*a == b*b + c*c || b*b == c*c + a*a || c*c == a*a + b*b));
		System.out.println(isRightTriangle);
	}
}
