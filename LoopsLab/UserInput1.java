import java.util.Scanner;
class UserInput1{
    public static void main(String agrs[]){
        int num;

         Scanner scan = new Scanner(System.in);
       System.out.println(" How Many Rows? ");
       num = scan.nextInt();

        {  
    for(int r=1;r<=num;r++){  
        for(int c=1;c<=r;c++){  
        System.out.print(r);  
        }  
    System.out.println();//new line  
        }  


    }  
    for(int r=1;r<=num;r++){  
        for(int c=num;c>=r;c--){  
        System.out.print(r);  
        }  
    System.out.println();//new line  
        }  
    }  



}






    
