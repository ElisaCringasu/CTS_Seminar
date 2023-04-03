package principii_clean_code.main;

import principii_clean_code.clase.Angajat;
import principii_clean_code.clase.Aplicant;
import principii_clean_code.clase.Student;
import principii_clean_code.clase.readere.ReaderAngajat;
import principii_clean_code.clase.readere.ReaderStudent;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        List<Aplicant> listaStudenti;
        try {
            ReaderAngajat readerAng = new ReaderAngajat("angajati.txt");
            ReaderStudent readerStud = new ReaderStudent("studenti.txt");
//            listaAngajati = readerAng.readAplicanti();
            listaStudenti = readerStud.readAplicanti();
            Angajat.setSumaFinantata(10);
            Student.setSumaFinantata(8);

            for (Aplicant angajat : listaStudenti) {
                System.out.println(angajat.toString());
                angajat.afisareFinantare();
                angajat.afisareStatus();
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
