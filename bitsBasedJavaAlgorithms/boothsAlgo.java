package bitsBasedJavaAlgorithms;
import java.util.Scanner;

public class boothsAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = 0;
        
        while (a > 0) {
            if (a % 2 == 1) {
                p += b;
            }
            a >>= 1;
            b <<= 1;
        }
        
        while (b > 0) {
            if (b % 2 == 1) {
                p += a;
            }
            b >>= 1;
            a <<= 1;
        }
        
        System.out.println(p);
    }
}

