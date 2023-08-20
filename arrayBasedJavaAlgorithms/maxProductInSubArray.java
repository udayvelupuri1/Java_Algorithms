package arrayBasedJavaAlgorithms;

import java.util.Scanner;

public class maxProductInSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int f = 1;
        int r = 1;
        int m = 1;
        for (int i = 0; i < n; i++) {
            if (f == 0) {
                f = 1;
            }
            if (r == 0) {
                r = 1;
            }
            f = f * arr[i];
            r = r * arr[n - i - 1];
            m = Math.max(m, Math.max(f, r));
        }
        System.out.println(m);
    }

}
