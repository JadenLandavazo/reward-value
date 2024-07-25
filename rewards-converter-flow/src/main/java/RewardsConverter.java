import java.util.Scanner;


class RewardValue{
    double cashVal;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
   
    RewardValue(double cash){
        this.cashVal = cash; 
    }

    RewardValue(int milesC){
        this.cashVal = convertToCash(milesC);
        
    }

    double getCashValue(){
        return cashVal; 
    }

    int getMilesValue(){
        
        return convertToMiles(this.cashVal);
 
    }
      int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

      double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
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

