public class Dichotomy {

    private static void dichotomy(double a, double b) {
        double c = b;
        int counter = 1;
        while ((b - a) >= Globals.EPSILON) {
            c = (a + b) / 2;
            System.out.println(counter++ + "." + "f(c) == " + c);
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
        dichotomy(Globals.RANGE_MIN, Globals.RANGE_MAX);
    }

}