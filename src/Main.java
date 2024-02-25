import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double area = 0;
        double result = calcCircleRadius(area);
        System.out.println("Радиус окружности " + result );
    }
        public static double calcCircleRadius(double area) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите площадь окружности");
            double S = scanner.nextDouble();
            area = S/Math.PI;
            String round = String.format("%.3f", area);
            System.out.println("Округленный формат"+ round);
            return area;
    }
}