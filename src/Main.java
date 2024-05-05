public class Main {
    static final double[][] a = {{1d, 2d, 0d}, {0d, 1d, 0d}, {0d, 0d, 1d}};
    static final double[] b = {1d, 1d, 1d};

    public static void main(String[] args) {
        double[] c = new double[3];
        ScalarProduct[] sp = new ScalarProduct[3];

        for (int i = 0;  i < c.length; i++) {
            sp[i] = new ScalarProduct(a[i], b);
            sp[i].start();
        }

        for (int i = 0; i < c.length; i++) {
            try {
                sp[i].join();
                c[i] = sp[i].getScalarProduct();
            } catch(InterruptedException e) {
                System.out.println("Oops");
                e.printStackTrace();
                return;
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}