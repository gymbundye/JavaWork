import java.util.Scanner;
public class Question1 {

    public static void main(String[] args) {

        int input;
        int num1 = 0;
        int num2 = 1;
        System.out.println("How many times should we fib the nocci?:");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        scanner.close();
        System.out.print( +input+" numbers: ");

        int i=1;
        while(i<=input)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }
}