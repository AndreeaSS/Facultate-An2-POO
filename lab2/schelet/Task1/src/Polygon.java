public class Polygon {

    int n;
    Point[] corners;

    public Polygon( int n) {
        this.n = n;
        this.corners = new Point[n];
    }

    public Polygon(float[] points) {
        this(points.length/2);

        float[] x = new float[points.length/2];
        float[] y = new float[points.length/2];
        int countx = 0;
        int county = 0;
        for(int i = 0; i < points.length; i++) {
            if(i % 2 == 0) {
                x[countx] = points[i];
                countx++;
            }
            else {
                y[county] = points[i];
                county++;
            }
        }

        for(int i = 0; i < points.length/2; i++) {
            this.corners[i] = new Point(x[i], y[i]);
        }

    }
}
