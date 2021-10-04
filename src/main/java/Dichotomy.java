public class Dichotomy {

    private static void dichotomy(double a, double b) {
        double c = a;
        while ((b - a) >= Globals.EPSILON) {
            c = (a + b) / 2;
            if (Globals.f(c) == 0.0) break;
            else if (Globals.f(c) * Globals.f(a) < 0) {
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