import java.util.Scanner;

/*
    Title: Checking a number even or odd
    >> Write down a program that will take an integers as input and will check the given number is even or odd
    ## Test Case ##
    input: 6 output: even
    input: 7 output: odd
*/
public class Number02 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
