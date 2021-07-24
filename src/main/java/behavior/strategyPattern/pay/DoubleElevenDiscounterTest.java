package behavior.strategyPattern.pay;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import java.math.BigDecimal;



class DoubleElevenDiscounterTest {


    @Test
    void applyDiscount() throws Exception{
        Discounter motherDiscounter = new MotherCelebrationDiscounter();
        BigDecimal discountValue = motherDiscounter.applyDiscount(BigDecimal.valueOf(100));
        System.out.println(discountValue);
    }
}