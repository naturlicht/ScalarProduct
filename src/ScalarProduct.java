public class ScalarProduct extends Thread {
    private double[] a;
    private double[] b;
    private double result = 0d;

    public ScalarProduct(double[] a, double[] b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        for(int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }
    }
    public double getScalarProduct() {
        return result;
    }
}
