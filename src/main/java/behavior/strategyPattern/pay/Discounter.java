package behavior.strategyPattern.pay;

/*
* 當一種任務有不同的算法，並讓客戶端執行程式實決定要用哪種算法
* 舉例: 一間電商可能依據不同狀況下進行折扣，1111購物節、父親節、母親節等
*
* */

import java.math.BigDecimal;

public interface Discounter {
    BigDecimal applyDiscount(BigDecimal account);
}
