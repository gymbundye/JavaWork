//grades
public class Question1 {  
public static void main(String[] args) {  
    int grade=88;  
      
    if(grade<55){  
        System.out.println("F Grade");  
    }   
    else if(grade>=55 && grade<70){  
        System.out.println("D grade");  
    }  
    else if(grade>=70 && grade<80){  
        System.out.println("C grade");  
    }  
    else if(grade>=80 && grade<90){  
        System.out.println("B grade");  
    }else if(grade>=90 && grade<100){  
        System.out.println("A grade");  
    }else{  
        System.out.println("Invalid!");  
    }  
}  
}