import java.util.*;
public class qtwo {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your temperature");
        double temperature= sc.nextDouble();
        if (temperature >100) {
            System.out.println("You have a fever");
        }else{
            System.out.println("You don't have a fever");
        }
    }
    
}
