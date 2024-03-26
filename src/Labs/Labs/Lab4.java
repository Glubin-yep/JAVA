package Labs;
public class Lab4 {
    private final double a;
    private double[] x;
    private double[] y;

    public Lab4(double a) {
        this.a = a;
    }

    public double calculate(double x) {
        if (x > a) {
            return x * Math.sqrt(x - a);
        } else if (x == a) {
            return 0.14;
        } else {
            return Math.exp(-a * x) * Math.cos(a * x);
        }
    }
    public static int calculateSteps(double xStart, double xEnd, double step) {
        return (int) Math.ceil((xEnd - xStart) / step);
    }
    public void createArrays(double xStart, double xEnd, double step) {
        int n = calculateSteps(xStart, xEnd, step);
        x = new double[n];
        y = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = xStart + i * step;
            y[i] = calculate(x[i]);
        }
    }

    public double[] getX() {
        return x;
    }

    public double getXfromIndex(int index) {
        return x[index];
    }

    public double[] getY() {
        return y;
    }

    public double getYfromIndex(int index) {
        return y[index];    }

    public int findMaxIndex() {
        int maxIndex = 0;
        for (int i = 1; i < y.length; i++) {
            if (y[i] > y[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int findMinIndex() {
        int minIndex = 0;
        for (int i = 1; i < y.length; i++) {
            if (y[i] < y[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public double getSum() {
        double sum = 0;
        for (double value : y) {
            sum += value;
        }
        return sum;
    }

    public double getAverage() {
        return getSum() / y.length;
    }

    public  int getTask4(int minIndex) {
        int result = 0;
        for (int i = y.length -1; i >= minIndex; i--){
            if(y[i] > 0){
                result += 1;
            }
        }
        return result;
    }
}

