package builder.main;

import builder.clase.BuilderPacient;
import builder.clase.BuilderPacientV2;
import builder.clase.IBuilder;
import builder.clase.Pacient;

public class Program {
    public static void main(String[] args) {
        IBuilder builderPacient = new BuilderPacient("Sergiu");
        Pacient pacient1;
        Pacient pacient2;
        pacient1 = builderPacient.setHalatInterior(true).build();
        pacient2 = builderPacient.setHalatInterior(true).setMicDejun(true).build();

        System.out.println(pacient1);
        System.out.println(pacient2);

        IBuilder builderPacient2 = new BuilderPacientV2();
        Pacient pacient3 = builderPacient2.setNume("Gigi").setMicDejun(true).build();
        Pacient pacient4 = builderPacient2.setNume("Marius").build();

        System.out.println(pacient3);
        System.out.println(pacient4);
    }
}
