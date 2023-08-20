package bitsBasedJavaAlgorithms;

import java.util.Scanner;

public class binaryPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        String s1 = "";
        while (n > 0) {
            s = n % 2 + s;
            s1 = s1 + n % 2;
            n = n / 2;
        }
        if (s.equals(s1)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not a Palindrom");
        }
    }

}
