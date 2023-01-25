import java.util.Scanner;
public class conditional1 {

    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
        System.out.println("enter marks ");
        int marks = inr.nextInt();
        if(marks>90){
        
            System.out.println("excellent");
        }
        else if(marks>80){
            System.out.println("good");
        }
         else if(marks>70){
            System.out.println("fair");
        }
         else if(marks>60){
            System.out.println("meet expectation");
        }
         else {
            System.out.println("below par");
        
        }
    }
}