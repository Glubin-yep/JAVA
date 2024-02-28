import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        double a = -0.5;
        double b = 1.7;
        double t = -0.44;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MM yyyy");

        System.out.println(Labs.Lab1.CalculateY(a,b,t));
        System.out.println(Labs.Lab1.CalculateS(a,b,t));
        System.out.println(LocalDate.now().format(format));
    }
}