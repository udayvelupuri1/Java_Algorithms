package bitsBasedJavaAlgorithms;
import java.util.Scanner;
public class swapping2nibbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n&0X0F)<<4|(n&0XF0)>>4);
    }
    
}
