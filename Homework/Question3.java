public class Question3{  
public static void main(String[] args) {

         int num=8;

         if(num%2==1){
             System.out.println("Cool");
         }
         else if((num%2==0) && (num>=2&num<=5)){
             System.out.println("Not Cool");
         }
        else if((num%2==0) && (num>=6 & num<=20)){
            System.out.println("Not Cool");
        }

    }
}