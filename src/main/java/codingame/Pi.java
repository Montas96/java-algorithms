package codingame;

public class Pi {
    /**
     * Approximate pi using the given points.
     */

    public static void main(String[] args) {
        double[][] rands = new double[100000][2];
        for (int i = 0; i < rands.length; i++) {
            rands[i][0] = Math.random(); // x
            rands[i][1] = Math.random(); // y
        }
        System.out.println(Pi.approx(rands));
    }
    static double approx(double[][] pts) {
        double sum = 0;
        for (int i = 0; i < pts.length; i++) {
            double x = pts[i][0];
            double y = pts[i][1];
            double power = Math.pow(x,2) + Math.pow(y,2);
            if( power <= 1){
                sum ++;
            }
        }
        return sum * 4 /pts.length;
    }
}