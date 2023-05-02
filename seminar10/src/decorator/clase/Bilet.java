package decorator.clase;

public class Bilet implements IBilet {
    private String numeCumparator;
    private String numeEchipa1;
    private String getNumeEchipa2;


    public String getNumeEchipa1() {
        return numeEchipa1;
    }

    public Bilet(String numeCumparator, String numeEchipa1, String getNumeEchipa2) {
        this.numeCumparator = numeCumparator;
        this.numeEchipa1 = numeEchipa1;
        this.getNumeEchipa2 = getNumeEchipa2;
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "numeCumparator='" + numeCumparator + '\'' +
                ", numeEchipa1='" + numeEchipa1 + '\'' +
                ", getNumeEchipa2='" + getNumeEchipa2 + '\'' +
                '}';
    }

    @Override
    public void printareBilet() {
        System.out.println(this.toString());
    }


}
