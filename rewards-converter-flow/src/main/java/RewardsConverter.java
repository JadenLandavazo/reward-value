import java.util.Scanner;


class RewardValue{
    double cashVal; 
    int miles; 
    RewardValue(double cash){
        this.cashVal = cash; 
    }

    RewardValue(int milesC){
        this.miles = milesC; 
    }

    double getCashValue(double cash){
        return cash; 
    }

    int getMilesValue(double cash){
        double rate = 0.0035; 
        double toCash = cash * rate; 

        return (int)toCash; 
 
    }



}

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}

