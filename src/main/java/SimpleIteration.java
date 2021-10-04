import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class SimpleIteration {

    private static final double MAX = 50d;

    private static double getLambda(double x) {
        return 1.d / (3 * pow(x, 2) - 6 * x - 14);
    }

    private static void simpleIteration(double x) {
        double lambda = getLambda(x);
        double prev;
        do {
            prev = x;
            x = x - lambda * Globals.f(x);
        } while (abs(x - prev) >= Globals.EPSILON);

        System.out.printf("The result is : %.8f", prev);
    }


    public static void main(String... args) {
        simpleIteration(MAX);
    }
}