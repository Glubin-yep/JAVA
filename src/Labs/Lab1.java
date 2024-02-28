package Labs;

public class Lab1 {
    public static double CalculateY(double a, double b, double t) {
        double firstPart = Math.exp(-b * t) * Math.sin(a * t + b);
        double secondPart = Math.sqrt(Math.abs(b * t + a));
        return firstPart - secondPart;
    }

    public static double CalculateS(double a, double b, double t) {
        return b * Math.sin(a * t * t * Math.cos(2 * t)) - 1;
    }
}
