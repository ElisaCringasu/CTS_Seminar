package teste;

import clase.ExceptieCNPInexistent;
import clase.ExceptieVarsta;
import clase.IPersoana;
import clase.Persoana;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {

    @Test
    void getVarsta() {
        IPersoana persoana = new Persoana("Adrian", "5010512415523");
        assertEquals(22, persoana.getVarsta());
    }

    @Test
    void testGetVarstaBoundaryNouNascut(){
        IPersoana persoana = new Persoana("Marcel", "5230523551122");
        assertEquals(0, persoana.getVarsta());
    }

    @Test
    void testGetVarstaBoundaryAn2000(){
        IPersoana persoana = new Persoana("Maria", "6000101442233");
        assertEquals(23, persoana.getVarsta());
    }

    @Test
    void testGetVarstaBoundaryAn1999(){
        IPersoana persoana = new Persoana("Andrei", "1991231551177");
        assertEquals(23, persoana.getVarsta());
    }

    @Test
    void testGerVarstaError(){
        IPersoana persoana = new Persoana("Daria", "6230724661122");
        assertThrows(ExceptieVarsta.class, () -> persoana.getVarsta());
    }

    @Test
    void testGetVarstaPerformance(){
        IPersoana persoana = new Persoana("Daria", "5010423553344");
        assertTimeout(Duration.ofMillis(100), () -> persoana.getVarsta());
    }

    @Test
    void testConstructorPersoanaConformance(){
        Persoana persoana = new Persoana("Daria", "5010423553344");
        assertEquals(13, persoana.CNP.length());
    }

    @Test
    void testGetVarstaOrder(){
        IPersoana persoana1 = new Persoana("Daria", "5010212667788");
        IPersoana persoana2 = new Persoana("Daria", "5020309558899");

        assertTrue(persoana1.getVarsta() > persoana2.getVarsta());
    }

    @Test
    void testGetVarstaNoCNP(){
        IPersoana persoana = new Persoana(null, null);
        assertThrows(ExceptieCNPInexistent.class, () -> persoana.getVarsta());
    }

    @Test
    void testGetVarstaCardinality(){
        IPersoana persoana = new Persoana("Darian", "5220523553344");
        assertEquals(1, persoana.getVarsta());
    }
    

}