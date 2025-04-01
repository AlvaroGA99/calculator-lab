public class Product {

    public static double realProduct(double a, double b) {
        return a * b;
    }

    public static int intProduct(int a, int b) {
        return a * b;
    }

    public static double tripleRealProduct(double a, double b, double c) {
        return a * b * c;
    }

    public static double pow(int base, int exponent) {

        if(exponent == 0) {
            return 1;
        }else {
            double res = 1;
            int absExponent = Math.abs(exponent);
            for (int i = 0; i < absExponent; i++) {
                res*= base;
            }
            if(exponent < 0) {
                return 1.0/res;
            }else{
                return res;
            }
        }

    }
}
