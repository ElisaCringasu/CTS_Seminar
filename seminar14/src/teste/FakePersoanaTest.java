package teste;

import categorii.Categorie1;
import clase.PachetTuristic;
import dubluri.FakePersoana;
import jdk.jfr.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FakePersoanaTest {

//    @Category(Categorie1.class)
    @Test
    void poatePrimiDiscount(){
        FakePersoana persoana = new FakePersoana();
        persoana.setGetVarstaValue(66);
        PachetTuristic pachet = new PachetTuristic(persoana, "Baile Herculane", 1000.0);
        pachet.aplicaDiscountVarstnici(20);
        assertEquals(800, pachet.getPret());
    }


    @Test
    void nuPrimesteDiscount(){
        FakePersoana persoana = new FakePersoana();
        persoana.setGetVarstaValue(25);
        PachetTuristic pachet = new PachetTuristic(persoana, "Baile Herculane", 1000.0);
        pachet.aplicaDiscountVarstnici(20);
        assertEquals(1000, pachet.getPret());
    }

}