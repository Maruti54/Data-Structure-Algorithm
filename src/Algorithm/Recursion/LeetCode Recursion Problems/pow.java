import java.util.*;
public class pow{

    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        else if (n == -1) return 1 / x;
        double res = myPow(x, n / 2);
        if (n % 2 == 0) return res * res;
        else if (n % 2 == -1) return res * res * (1/x);
        else return res * res * x;
    }
    public static void main(String[] args) {
        float x = (float) 2.00000;
        int n = 10;
        System.out.println(myPow(x, n));
    }    
}
