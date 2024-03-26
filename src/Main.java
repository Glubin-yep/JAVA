import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public class Main {

        public static void main(String[] args) {
            final double a = 2.4;
            final double u = 0.14;
            final double xMin = 1.0;
            final double xMax = 5.0;
            final double dx = 0.01;

            int n = (int) Math.ceil((xMax - xMin) / dx);
            double[] y = new double[n];

            for (int i = 0; i < n; i++) {
                double x = xMin + i * dx;
                if (x > a) {
                    y[i] = x * Math.sqrt(x - a);
                } else if (x == a) {
                    y[i] = x * Math.sin(a * x);
                } else {
                    y[i] = Math.exp(-u * x) * Math.cos(a * x);
                }
            }

            // Вивід результатів на екран
            for (double value : y) {
                System.out.println(value);
            }
        }
    }

}