package teste;

import clase.IPersoana;
import clase.PachetTuristic;
import dubluri.StubPersoana;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StubPersoanaTest {
    @Test
    void poateRezervaPachet(){
        IPersoana persoana = new StubPersoana();
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"Dubai",1500.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    void nuPoateRezervaPachet() {
        IPersoana persoana = new StubPersoana();
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Maldive", 2000.0);
        assertFalse(pachetTuristic.poateRezerva());
    }


}
