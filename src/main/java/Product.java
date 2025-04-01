public class Product {

    public static double realProduct(double a, double b) {
        return a * b;
    }

    public static int intProduct(int a, int b) {
        return a * b;
    }

    public static double tripleRealProduct(int a, double b, double c) {
        return a * b * c;
    }

    public static int pow(int base, int exponent) {
        int res = 1;
        for (int i = 0; i < exponent; i++) {
            res*= base;
        }
        return res;
    }
}
