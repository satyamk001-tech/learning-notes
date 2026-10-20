import java.util.*;
public class eve {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= sc.nextInt();

        if (isEven(n)) {
            System.out.println("Number is Even");
            
        } else {
            System.out.println("Number is odd");
            
        }

    }
    public static boolean isEven(int n) {
        boolean isEven=true;
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    
}
