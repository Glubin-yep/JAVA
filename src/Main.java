import Labs.Lab2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
        public static void main(String[] args) {
            double a = 2.4;
            double xStart = 1.0;
            double xEnd = 5.0;
            double step = 0.01;

            Labs.Lab2 function = new Lab2(a);
            function.createArrays(xStart, xEnd, step);

            int maxIndex = function.findMaxIndex();
            int minIndex = function.findMinIndex();

            System.out.println("Найбільше значення: y[" + maxIndex + "] = " + function.getY()[maxIndex] + " при x = " + function.getX()[maxIndex]);
            System.out.println("Найменше значення: y[" + minIndex + "] = " + function.getY()[minIndex] + " при x = " + function.getX()[minIndex]);

            System.out.println("Сума: " + function.getSum());
            System.out.println("Середнє арифметичне: " + function.getAverage());
        }


}