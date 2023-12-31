package mathBasedJavaAlgorithms;

import java.util.Scanner;

public class simpleSieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }
        for (int j = 2; j * j <= n; j++) {
            if (prime[j] == true) {
                for (int i = j * j; i <= n; i += j) {
                    prime[i] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true) {
                System.out.print(i + " ");
            }
        }
    }

}
