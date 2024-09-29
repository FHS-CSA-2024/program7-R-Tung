//import stuff here
import java.util.Scanner;
import java.text.DecimalFormat;
//Your code here
public class Program{
    public static void main(String[] args){
        //conversion rates
        final int convertKlevins = 20;
        final int convertSN = 240;
        
        //getting input
        Scanner userSchruteBucks = new Scanner(System.in);
        System.out.println("Enter schrute-bucks: ");
        double user_SchruteBucks = userSchruteBucks.nextDouble();
        
        Scanner userKlevins = new Scanner(System.in);
        System.out.println("Enter klevins: ");
        double user_Klevins = userKlevins.nextDouble();
        
        Scanner userStanleyNickels = new Scanner(System.in);
        System.out.println("Enter stanley-nickels: ");
        double user_StanleyNickels = userStanleyNickels.nextDouble();
        
        //converting inputs to new system
        user_Klevins = user_Klevins / convertKlevins;
        user_StanleyNickels = user_StanleyNickels / convertSN;
        
        double output = user_Klevins + user_StanleyNickels + user_SchruteBucks; 
        
        //printing output
        System.out.printf("Decimal schrute-bucks = " + "%,.2f %n", + output);
    }
}
//Paste console output below:
/*
Enter schrute-bucks: 
7
Enter klevins: 
17
Enter stanley-nickels: 
9
Decimal schrute-bucks = 7.89 


*/
