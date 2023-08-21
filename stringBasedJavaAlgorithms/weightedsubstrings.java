package stringBasedJavaAlgorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class weightedsubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int weight = sc.nextInt();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int sum = 0;
            String s1 = "";
            for (int j = i; j < s.length(); j++) {
                sum = sum + (s.charAt(j) - 'a') + 1;
                s1 = s1 + s.charAt(j);
                if (sum <= weight) {
                    count++;
                    System.out.println(s1);
                }
            }
        }
        System.out.println(count);
    }
}

