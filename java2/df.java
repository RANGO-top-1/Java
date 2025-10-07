import java.util.Scanner; 

public class df {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.print("Введите x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите y: ");
        double y = scanner.nextDouble();
        System.out.print("Введите a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите b: ");
        double b = scanner.nextDouble();
        double z ;

        if(x > 0 && y > 0) {
    double maxEl = a/x;
    if (maxEl < b/x) {
        maxEl = b/x;
    }
    if (maxEl < Math.sqrt(y)){
        maxEl = Math.sqrt(y);
    }
    z = maxEl;
} else if(x < 0 && y > 0){
    double minEl = Math.pow(a*x,3);
    if (minEl >  Math.pow(b*y,2)){
        minEl = Math.pow(b*y,2);
    }
    z = minEl;
} else {
    z = Math.pow(2,x+y);
}

System.out.print("Ответ: "+ z);

        scanner.close();
    }
}

