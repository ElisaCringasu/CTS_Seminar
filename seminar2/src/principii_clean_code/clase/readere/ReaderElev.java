package principii_clean_code.clase.readere;

import principii_clean_code.clase.Aplicant;
import principii_clean_code.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderElev extends ReaderAplicant {

    public ReaderElev(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(this.fileName));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Elev e = new Elev();
            citesteAplicant(input2, e);
            int clasa = input2.nextInt();
            String tutore = input2.next();
            e.setClasa(clasa);
            e.setTutore(tutore);
            elevi.add(e);
        }

        input2.close();
        return elevi;
    }
}
