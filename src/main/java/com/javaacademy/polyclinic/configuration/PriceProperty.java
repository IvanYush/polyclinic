package com.javaacademy.polyclinic.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.math.BigDecimal;

/**
 * Настройка стоимости приёма
 */
@ConfigurationProperties(prefix = "doctor")
@Data
public class PriceProperty {
    private BigDecimal dentistPrice;
    private BigDecimal therapistPrice;
    private BigDecimal surgeonJuniorPrice;
    private BigDecimal surgeonSeniorPrice;
}
