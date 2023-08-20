package bitsBasedJavaAlgorithms;

import java.util.Scanner;

public class longestSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int p = 0;
        int m = 0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') { // 1 is char
                c++;
            } else {
                m = Math.max(m, c + p + 1);
                p =c;
                c = 0;
            }
        }
        System.out.println(Math.max(m, c + p + 1));
    }

}
