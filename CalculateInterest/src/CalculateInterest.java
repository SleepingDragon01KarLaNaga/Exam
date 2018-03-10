import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[]args){
        String AccountType;
        double amt = 0.0;
        int year = 0;
        double interest = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Account Type: ([Normal] or [Deluxe])");
        AccountType = input.nextLine();

        System.out.print("Enter amount: ");
        amt = input.nextDouble();

        System.out.print("Enter year: ");
        year = input.nextInt();

        if (AccountType.equalsIgnoreCase("Normal")){
            if (year<5){
                interest = (amt*15)/100;
            }else {
                interest = (amt*17)/100;
            }
        }
        else if (AccountType.equalsIgnoreCase("Deluxe")){
            if (year<10){
                interest = (amt*14)/100;
            }else if (year>=10 && year<=15){
                interest = (amt*16)/100;
            }else if (year>15){
                interest = (amt*18)/100;
            }else {
                interest = (amt*18)/100;
            }
        }
        System.out.println("Interest: "+ interest);
    }
}
