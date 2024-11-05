package com.javaacademy.polyclinic;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Поликлиника
 */
@Slf4j
@Component
@AllArgsConstructor
public class Polyclinic {
    private CashRegister cashRegister;
    private Doctor dentist;
    private Doctor therapist;
    private Doctor surgeonJunior;
    private Doctor surgeonSenior;

    //лечить у стоматолога
    public void toHealDentist() {
        toHeal(dentist);
    }

    //лечить у терапевта
    public void toHealTherapist() {
        toHeal(therapist);
    }

    //лечить у младшего хирурга
    public void toHealSurgeonJunior() {
        toHeal(surgeonJunior);
    }

    //лечить у старшего хирурга
    public void toHealSurgeonSenior() {
        toHeal(surgeonSenior);
    }

    //лечить
    private void toHeal (Doctor doctor) {
        BigDecimal money = doctor.toHeal();
        cashRegister.addIncome(money);
    }

}
