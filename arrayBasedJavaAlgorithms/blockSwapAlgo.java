package arrayBasedJavaAlgorithms;

import java.util.Scanner;

public class blockSwapAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int r = sc.nextInt();
        r = r % n;
        for (int i = r; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < r; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
