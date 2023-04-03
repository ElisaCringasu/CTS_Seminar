package principii_clean_code.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
    private int clasa;
    private String tutore;

    private static Integer sumaFinantata;

    public int getClasa() {
        return clasa;
    }


    public static void setSumaFinantata(Integer suma) {
        Elev.sumaFinantata = suma;
    }

    public void setClasa(int i) {
        this.clasa = i;
    }

    public String getTutore() {
        return tutore;
    }

    public void setTutore(String tutore) {
        this.tutore = tutore;
    }


    @Override
    public String toString() {
        return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
                + varsta + ", Punctaj=" + punctaj + ", nrProiecte=" + nrProiecte + ", denumiriProiect="
                + Arrays.toString(denumiriProiect) + "Clasa=" + clasa + ", Tutore=" + tutore;
    }

    public Elev() {
        super();
    }

    public Elev(String nume, String prenume, int varsta, int punctaj,
                int nrProiecte, String[] denumiriProiect, int clasa, String tutore) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumiriProiect);
        this.clasa = clasa;
        this.tutore = tutore;
    }

    @Override
    public void afisareFinantare() {
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste " + Elev.sumaFinantata + " Euro/zi in proiect.");
    }
}
