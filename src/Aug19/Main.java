package Aug19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        int ans = max(num1, num2, num3);
        System.out.println("Maximum Value: " + ans);
    }
    public static int max(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        }
        if (z > y && z > x) {
            return z;
        }
        return y;
    }
}