import static java.lang.Math.pow;
import static java.lang.Math.sin;

public class Globals {
    public static final float EPSILON = 0.0001f;
    public static final double RANGE_MIN = 0.0d;
    public static final double RANGE_MAX = 1.d;

    public static double f(double x) {
        return pow(x, 2) + 5 * sin(x) - 1;
    }

}
