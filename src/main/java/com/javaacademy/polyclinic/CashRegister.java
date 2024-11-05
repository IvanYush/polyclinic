package com.javaacademy.polyclinic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static java.math.BigDecimal.*;

/**
 * Касса
 */
@Slf4j
@Component
public class CashRegister {
    private BigDecimal profit = ZERO; //доход

    //2.1 Умеет принимать платежи (т.е. увеличивать доход).
    public void addIncome (BigDecimal money) {
        profit = profit.add(money);
    }

    //2.2 Умеет печатать доход (лог, а не sout).
    public void printProfit() {
        log.info("доход: {}", profit);
    }
}
