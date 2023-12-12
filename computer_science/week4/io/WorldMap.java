public class WorldMap {
    public static void main(String[] args) {
        // Define the bounding box with width and height
        int width = StdIn.readInt();
        int height = StdIn.readInt();

        // Set the canvas with appropriate scales
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        // Read region name and polygon, and draw a map
        while (!StdIn.isEmpty()) {
            String region_name = StdIn.readString();
            int numVertices = StdIn.readInt();
            double[] x = new double[numVertices];
            double[] y = new double[numVertices];
            for (int i = 0; i < numVertices; i++) {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
            }

            StdDraw.polygon(x, y);
        }
    }
}
