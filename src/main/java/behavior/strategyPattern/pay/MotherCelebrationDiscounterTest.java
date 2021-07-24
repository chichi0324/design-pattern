package behavior.strategyPattern.pay;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MotherCelebrationDiscounterTest {

    @org.junit.jupiter.api.Test
    void applyDoubleEleventDiscount() {
        Discounter doubleElvenDiscounter = new DoubleElevenDiscounter();
        BigDecimal discountValue = doubleElvenDiscounter.applyDiscount(BigDecimal.valueOf(100));
        System.out.println(discountValue);
    }

    @Test
    void applyMotherDiscount() throws Exception{
        Discounter motherDiscounter = new MotherCelebrationDiscounter();
        BigDecimal discountValue = motherDiscounter.applyDiscount(BigDecimal.valueOf(100));
        System.out.println(discountValue);
    }
}