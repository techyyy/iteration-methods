import static java.lang.Math.*;

public class FixedPointIteration {

    private static double getLambda(double x) {
        return 1.d / (5 * cos(x) + pow(x, 2));
    }

    private static void fixedPointIteration(double x) {
        double lambda = getLambda(x);
        double prev;
        int counter = 1;
        do {
            prev = x;
            System.out.println(counter++ + "." + "f(c) == " + prev);
            x -= lambda * Globals.f(x);
        } while (abs(x - prev) >= Globals.EPSILON);

        System.out.printf("The result is : %.8f", prev);
    }


    public static void main(String... args) {
        fixedPointIteration(Globals.RANGE_MAX);
    }
}