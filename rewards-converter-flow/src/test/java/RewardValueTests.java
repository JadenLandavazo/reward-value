import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 1000; 
        double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
        double test = cashValue / MILES_TO_CASH_CONVERSION_RATE; 
        int result = (int)test; 
        var rewardValue = new RewardValue(cashValue); 
        assertEquals(result, rewardValue.convertToMiles(cashValue));
        
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000; 
        double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

        var rewardsValue = new RewardValue(milesValue); 

        assertEquals(milesValue * MILES_TO_CASH_CONVERSION_RATE, rewardsValue.convertToCash(milesValue));
        
    }
}
