import java.util.Scanner;
public class ifelsein {
    public static void main(String[] args) {
        //Conditional Statements
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }
        
    }
}
