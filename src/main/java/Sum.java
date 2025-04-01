public class Sum {
    private static double memory = 0;
    public static double sum (double a, double b) {
        return a + b;
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static double sum(double a, double b, double c) {
        return a + b + c;
    }
    public static double sum(double a) {
        memory = sum(memory, a);
        return memory;
    }
}
