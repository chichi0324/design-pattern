package behavior.strategyPattern.pay;

import java.math.BigDecimal;

public class MotherCelebrationDiscounter implements Discounter{

    @Override
    public BigDecimal applyDiscount(final BigDecimal account){
        return account.multiply(BigDecimal.valueOf(0.85));
    }
}
