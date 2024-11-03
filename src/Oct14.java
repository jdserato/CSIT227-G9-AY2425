import Oct28.NegativeNumberException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Oct14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an age: ");
        int num;
        num = sc.nextInt();
        if (num < 0) {
            try {
                throw new NegativeNumberException();
            } catch (NegativeNumberException e) {

            }
        }
        System.out.println("Your age is " + num);
    }
}
