package behavior.strategyPattern.pay;

import java.math.BigDecimal;

public class DoubleElevenDiscounter implements Discounter{

    @Override
    public BigDecimal applyDiscount(BigDecimal account) {
        return account.multiply(BigDecimal.valueOf(0.88));
    }
}
