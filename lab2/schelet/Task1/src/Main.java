public class Main {
    public static void main (String[] args) {
        int n = 10;
        float[] no = new float[n];
        for(int i = 0; i < n; i++) {
            no[i] = i;
        }
        Polygon p = new Polygon(no);

        for(int i = 0; i < p.corners.length; i++) {
            p.corners[i].showPoint();
        }
    }
}
