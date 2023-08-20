package mathBasedJavaAlgorithms;

import java.util.Scanner;

public class StrobogramaticNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                s1 += '0';
            } else if (s.charAt(i) == '1') {
                s1 += '1';
            } else if (s.charAt(i) == '8') {
                s1 += '8';
            } else if (s.charAt(i) == '6') {
                s1 += '6';
            } else if (s.charAt(i) == '9') {
                s1 += '9';
            }

        }
        if (s1.equals(s)) {
            System.out.println("Strobogramatic Number!");
        } else {
            System.out.println("Not a Strobogramatic Number!");
        }
    }
}
