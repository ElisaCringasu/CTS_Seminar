package principii_clean_code.clase.readere;

import principii_clean_code.clase.Angajat;
import principii_clean_code.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderAngajat extends ReaderAplicant {

    public ReaderAngajat(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(this.fileName));
        input2.useDelimiter(",|\r\n");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat ang = new Angajat();
            super.citesteAplicant(input2, ang);
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            ang.setSalariu(salariu);
            ang.setOcupatie(ocupatie);
            angajati.add(ang);
        }
        input2.close();
        return angajati;
    }
}