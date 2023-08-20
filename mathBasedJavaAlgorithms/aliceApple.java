package mathBasedJavaAlgorithms;
import java.util.Scanner;
public class aliceApple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int side = 0;
        int total_apples =0;
        while(total_apples<n){
            side++;
            total_apples = total_apples = 12*side*side;
        }
        System.out.println(8*side);
    }
    
}



