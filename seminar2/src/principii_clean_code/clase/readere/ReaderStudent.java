package principii_clean_code.clase.readere;

import principii_clean_code.clase.Aplicant;
import principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderStudent extends ReaderAplicant {
    public ReaderStudent(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(this.fileName));
        input2.useDelimiter(",|\r\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Student stud = new Student();
            citesteAplicant(input2, stud);
            int anStudii = input2.nextInt();
            String facultate = input2.next();
            stud.setFacultate(facultate);
            stud.setAn_studii(anStudii);
            studenti.add(stud);
        }

        input2.close();
        return studenti;
    }
}
