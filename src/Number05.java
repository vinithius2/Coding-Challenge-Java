import java.util.Scanner;

/*
    Title: find min, max of two numbers
    >> Write down a program that will takes two number as input and
    >> find min and max using ternary operator
    ## Test ##
    input: 1 2 output: Min= 1 Max= 2
    input: 6 5 output: Min= 5 Max= 6
*/
public class Number05 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int min = n1 > n2 ? n2 : n1;
        int max = n1 > n2 ? n1 : n2;
        /*
        * TIP:
        * int min = Math.min(n1, n2);
        * int max = Math.max(n1, n2);
        */
        System.out.println("Min=" + min);
        System.out.println("Max=" + max);
    }
}
