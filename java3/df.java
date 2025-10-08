public class df {
public static void main(String[] args){

double y = 1;
for(double x = -1; x <= 1; x +=0.1 )
    {
        y = Math.pow(2, -x) * Math.exp(x);
        System.out.print(";  число: "+ y);
    }
}
}
