import java.util.Scanner; 

public class df {
    public static double function1(double x1 ,double x2, double x3, double y1, double y2, double y3){
    double r = 1 / 2 * (x1 - x2 )*(y3 - y1) - (x3 - x1)*(y2- y1);
    return r;
    };
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.print("Введите A1: ");
        double A1 = scanner.nextDouble();
        System.out.print("Введите A2: ");
        double A2 = scanner.nextDouble();
        System.out.print("Введите A3: ");
        double A3 = scanner.nextDouble();
        System.out.print("Введите A4: ");
        double A4 = scanner.nextDouble();
        System.out.print("Введите A5: ");
        double A5 = scanner.nextDouble();
        System.out.print("Введите A6: ");
        double A6 = scanner.nextDouble();
        
        double r1 = function1(A1, A2, A3, A4, A5, A6);
        System.out.print("Ответ: " +r1);



        scanner.close();
    }
}