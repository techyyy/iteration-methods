import static java.lang.Math.pow;

public class Dichotomy {

    private static final float EPSILON = 0.0001f;

    private static double f(double x) {
        return pow(x, 3) - 3 * pow(x,2) - 14 * x - 8;
    }

    private static void dichotomy(double a, double b) {
        double c = a;
        while ((b - a) >= EPSILON) {
            c = (a + b) / 2;
            if (f(c) == 0.0) break;
            else if (f(c) * f(a) < 0) {
                b = c;
            } else {
                a = c;
            }
        }

        System.out.printf("The result is : %.8f", c);
    }

    public static void main(String... args) {
        double a = -10, b = 50;
        dichotomy(a, b);
    }

}