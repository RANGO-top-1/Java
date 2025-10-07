import java.util.Scanner; 

public class HelloWorld {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.print("Введите число: ");
        double x = scanner.nextDouble();
        System.out.print("Введите число: ");
        double y = scanner.nextDouble();
        double z = (x * Math.pow(y, 2) - Math.sqrt(Math.pow(x, 2) - 2.5 * Math.pow(10, -3) * y)) / (2 * Math.sin(x * y)) + 0.5; 
        System.out.println("Ваше число: " + z);
        
        scanner.close();
    }
}