package stringBasedJavaAlgorithms;

import java.util.*;

public class Manchesters {

    static void findLongestPalindromicString(String text) {
        int N = text.length();
        if (N == 0)
            return;
        N = 2 * N + 1; // Position count
        int[] L = new int[N + 1]; // LPS Length Array
        L[0] = 0;
        L[1] = 1;
        int C = 1; // centerPosition
        int R = 2; // centerRightPosition
        int i = 0; // currentRightPosition
        int iMirror; // currentLeftPosition
        int maxLPSLength = 0;
        int maxLPSCenterPosition = 0;
        int start = -1;
        int end = -1;
        int diff = -1;

        for (i = 2; i < N; i++) {

            iMirror = 2 * C - i;
            L[i] = 0;
            diff = R - i;

            if (diff > 0)
                L[i] = Math.min(L[iMirror], diff);

            while (((i + L[i]) + 1 < N && (i - L[i]) > 0) &&
                    (((i + L[i] + 1) % 2 == 0) ||
                            (text.charAt((i + L[i] + 1) / 2) == text.charAt((i - L[i] - 1) / 2)))) {
                L[i]++;
            }

            if (L[i] > maxLPSLength) {
                maxLPSLength = L[i];
                maxLPSCenterPosition = i;
            }

            if (i + L[i] > R) {
                C = i;
                R = i + L[i];
            }

        }

        start = (maxLPSCenterPosition - maxLPSLength) / 2;
        end = start + maxLPSLength - 1;
        System.out.printf("LPS of string is %s : ", text);
        for (i = start; i <= end; i++)
            System.out.print(text.charAt(i));
        System.out.println();
    }

    public static void main(String[] args) {
        String text = "babcbabcbaccba";
        findLongestPalindromicString(text);

    }
}
