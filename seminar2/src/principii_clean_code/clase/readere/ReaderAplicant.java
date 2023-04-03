package principii_clean_code.clase.readere;

import principii_clean_code.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class ReaderAplicant {
    public String fileName;

    public ReaderAplicant(String file) {
        this.fileName = file;
    }

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    public void citesteAplicant(Scanner input2, Aplicant aplicant) {
        aplicant.setNume(input2.next());
        aplicant.setPrenume(input2.next());
        aplicant.setVarsta(input2.nextInt());
        aplicant.setPunctaj(input2.nextInt());
        aplicant.setNrProiecte(input2.nextInt());
        String[] denumiriProiecte = new String[aplicant.getNrProiecte()];
        for (int i = 0; i < aplicant.getNrProiecte(); i++) {
            denumiriProiecte[i] = input2.next();
        }
        aplicant.setDenumiriProiect(denumiriProiecte);
    }
}