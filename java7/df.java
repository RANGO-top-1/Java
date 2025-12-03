import java.util.Scanner; 

public class df {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in, "UTF-8");

        int arr [] = {1, 4, 5, 9, 99};
        for (int i = 0; i < arr.length; i++){
            System.out.print(" "+arr[i]);
        }

        scanner.close();
    }
}