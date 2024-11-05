package com.javaacademy.polyclinic.configuration;

import com.javaacademy.polyclinic.Doctor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = PriceProperty.class)
public class PolyclinicConfiguration {
    private PriceProperty priceProperty;

    public PolyclinicConfiguration(PriceProperty priceProperty) {
        this.priceProperty = priceProperty;
    }

    @Bean
    public Doctor dentist() {
        return new Doctor("Стоматолог", priceProperty.getDentistPrice());
    }

    @Bean
    public Doctor therapist() {
        return new Doctor("Терапевт", priceProperty.getTherapistPrice());
    }

    @Bean
    public Doctor surgeonJunior() {
        return new Doctor("Младший хирург", priceProperty.getSurgeonJuniorPrice());
    }

    @Bean
    public Doctor surgeonSenior() {
        return new Doctor("Старший хирург", priceProperty.getSurgeonSeniorPrice());
    }

}
