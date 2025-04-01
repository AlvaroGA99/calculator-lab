public class Division {
    public static double realDivision(double a, double b) {
        if(b == 0.0) {
            System.out.println("Division by zero");
            return Double.MAX_VALUE;
        }
        return a / b;
    }
    public static int intDivision(int a, int b) {
        if(b == 0) {
            System.out.println("Division by zero");
            return Integer.MAX_VALUE;
        }
        return a /b;
    }
    public static double realInverse(double a) {
        if(a == 0) {
            System.out.println("Division by zero");
            return Integer.MAX_VALUE;
        }
        return 1 / a;
    }
}
