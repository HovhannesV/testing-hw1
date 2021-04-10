package math;

public class MathUtils {
    public static int signum(double x) {
        if (x == 0) return 0;
        return x > 0 ? 1 : -1;
    }

    public static double reciprocal(double x) throws Exception {
        if(x == 0) throw new Exception("Division by zero");
        return 1 / x;
    }

    public static double module(double x) {
        if(x < 0) return -x;
        return x;
    }

    public static String positionWithRespectToCircle(int x, int y, int R) {
        if (x * x + y * y == R * R) return "on";
        if (x * x + y * y < R * R) return "inside";
        return "outside";
    }

}
