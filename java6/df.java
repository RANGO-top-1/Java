import java.util.Scanner;

public class df {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        int arr[] = { 9, 5, 98, 9, 2, 56, -4, -77, 100 };
            int maxEl = arr[0];
            for (int i = 0; i < arr.length; i++){
                if (maxEl > arr[i]){
                    continue;
                }else maxEl = arr[i];
            }
            System.out.print("max: "+maxEl);

        scanner.close();
    }
}
