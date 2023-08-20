package mathBasedJavaAlgorithms;

import java.util.Scanner;

public class toggleSwitchAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b[] = new boolean[n + 1]; // i =1
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j += i) {
                if (b[j] == true) {
                    b[j] = false;
                } else {
                    b[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] == true) {
                count++;
            }
        }
        System.out.println("Switches on = " + count);
    }
}
