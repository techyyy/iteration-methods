import static java.lang.Math.abs;

public class ModifiedNewtons {

    private static void modifiedNewtons(double x) {
        double e;
        double prev;
        int counter = 1;
        do {
            prev = x - Globals.f(x) * Globals.EPSILON / (Globals.f(x + Globals.EPSILON) - Globals.f(x));
            System.out.println(counter++ + "." + "f(c) == " + prev);
            e = abs(prev - x);
            x = prev;
        } while (e > Globals.EPSILON);

        System.out.printf("The result is : %.8f", prev);
    }

    public static void main(String[] args) {
        modifiedNewtons(Globals.RANGE_MAX);
    }
}
