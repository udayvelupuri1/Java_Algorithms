package stringBasedJavaAlgorithms;

import java.util.Scanner;

public class moveHypenToStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                s1 = '-' + s1;
            } else {
                s1 = s1 + s.charAt(i);
            }
        }
        System.out.println(s1);
    }

}
