package principii_clean_code.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
    private String ocupatie;

    private static Integer sumaFinantata;
    private Integer salariu;

    public String getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public Integer getSalariu() {
        return salariu;
    }

    public void setSalariu(Integer salariu) {
        this.salariu = salariu;
    }

    public static void setSumaFinantata(Integer suma) {
        Angajat.sumaFinantata = suma;
    }

    public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumire_Proiecte, int salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumire_Proiecte);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }

    public Angajat() {
        super();
    }


    @Override
    public String toString() {
        return "Angajat: Nume=" + nume + ", Prenume=" + prenume
                + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", nrProiecte=" + nrProiecte + ", denumiriProiect="
                + Arrays.toString(denumiriProiect) + " Ocupatie=" + ocupatie + ", salariu=" + salariu;
    }

    @Override
    public void afisareFinantare() {
        // TODO Auto-generated method stub
        System.out.println("Angajatul " + super.getNume() + " " + super.getPrenume() + " primeste " + Angajat.sumaFinantata + " Euro/zi in proiect.");
    }
}
