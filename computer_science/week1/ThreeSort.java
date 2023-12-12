public class ThreeSort {
	public static void main (String[] args) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        int third = Integer.parseInt(args[2]);

        // Sort three integers in ascending order
        int min = Math.min(Math.min(first, second), third);
		int mid = Math.max(Math.min(first, second), third);
        int max = Math.max(Math.max(first, second), third);

		System.out.println(min);
    	System.out.println(mid);
    	System.out.println(max);
   }
}
