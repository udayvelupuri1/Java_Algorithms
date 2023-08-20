package mathBasedJavaAlgorithms;

import java.util.Scanner;

class chineeseRemainderTheorm {
    static int crt(int a[], int b[], int n) {
        int x = 1;
        while (true) {
            int i;
            for (i = 0; i < n; i++)
                if (x % a[i] != b[i])
                    break;
            if (i == n)
                return x;
            x++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            b[i] = sc.nextInt();
        System.out.println(crt(a, b, n));

    }

}
