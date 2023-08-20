package mathBasedJavaAlgorithms;

import java.util.Scanner;

public class eulerPhi {
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (gcd(j, i) == 1)
                    count++;
            }
            System.out.println("phi(" + i + ") =" + count);
        }
    }

}
