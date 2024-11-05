package com.javaacademy.polyclinic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;

import static java.math.BigDecimal.*;

/**
 * Врач
 */
@Slf4j
@AllArgsConstructor
@Data
public class Doctor {
    private String specialization; //специализация
    private BigDecimal price; //стоимость приёма

    //Умеет лечить человека (логирует "{Специализация врача} вылечил человека", возвращает стоимость приема.
    public BigDecimal toHeal () {
        log.info("{} вылечил человека", specialization);
        return price;
    }
}
