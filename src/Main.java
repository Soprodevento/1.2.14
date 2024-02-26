public class Main {
    public static void main(String[] args) {
        double area =123;
        calcCircleRaduis(area);
    }

    public static void calcCircleRaduis(double area) {
        System.out.printf("Радиус окружности: %.3f", + Math.sqrt(area / Math.PI));
    }
}
