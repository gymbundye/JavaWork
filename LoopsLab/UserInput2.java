import java.util.Scanner;
class UserInput2{
    public static void main(String agrs[]){
        int num;
        int sum=0;
         Scanner scan = new Scanner(System.in);
       System.out.println("Enter Integer");
       num = scan.nextInt();
    
        for(int loop =1; loop<=10; loop++){
            int out= loop*num;
            sum += out;
            System.out.println(out);
        }

    }
}