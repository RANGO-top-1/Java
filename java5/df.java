import java.util.Scanner;

public class df {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        double arr[] = { 9, 5, 98, 9, 2, 56, -4, -77, 68 };
        int start = 0;
        int end = 0;

        double arrayMin = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arrayMin) {
                start = i;
                arrayMin = arr[i];
            }
        }
        double arrayMax = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arrayMax) {
                end = i;
                arrayMax = arr[i];
            }
        }
        if (start > end) {
            int c = start;
            start = end;
            end = c;
        }
        double sum = 0;
        for (int i = start + 1; i < end; i++) {
            sum += arr[i];
        }
        System.out.println("Max: "+arrayMax);
        System.out.println("Min: "+arrayMin);
        System.out.println("Сумма чисел: "+sum);

        scanner.close();
    }
}
