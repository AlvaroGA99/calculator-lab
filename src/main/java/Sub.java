public class Sub {
    private static double memory = 0;
    public static double sub(double a, double b) {
        return a - b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static double sub(double a, double b, double c) {
        return a - b - c;
    }
    public static double sub (double a) {
        memory = sub(memory, a);
        return memory;
    }
}
