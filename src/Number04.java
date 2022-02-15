import java.util.Scanner;

/*
    Title: Swap value of two variables
    >> Write down a program that will swap value of two variable
    ## Test ##
    input: n1 = 2, n2 = 3  output: n1 = 3, n2 = 2
*/
public class Number04 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: n1: ");
        int n1 = scanner.nextInt();
        System.out.println("Input: n2: ");
        int n2 = scanner.nextInt();
        int aux = n1;
        n1 = n2;
        n2 = aux;
        System.out.println("Output: n1 = " + n1 + ", n2 = " + n2);
        /* TIP:
        * n1 = n1 + n2;
        * n2 = n1 - n2;
        * n1 = n1 - n2;
        *
        * OTHER
        *
        *  n1 = n1 * n2;
        * n2 = n1 / n2;
        * n1 = n1 / n2;
        */
    }
}
