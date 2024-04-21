import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        // Задані значення h і p
        double h = 4.87;
        double p = 1.44;

        // Обчислення виразу m
        double m = p + (h - 7 * sin(p + 2 * pow(h, 2))) / (3 * p - 4 * h);

        // Обчислення виразу v
        double v = pow(cos(p + 1), 2) - 4 * (h + p);

        // Виведення результатів
        System.out.println("Значення виразу m: " + m);
        System.out.println("Значення виразу v: " + v);
    }
}
