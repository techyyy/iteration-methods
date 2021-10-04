import static java.lang.Math.pow;

public class Globals {
    public static final float EPSILON = 0.0001f;

    public static double f(double x) {
        return pow(x, 3) - 3 * pow(x,2) - 14 * x - 8;
    }
}
