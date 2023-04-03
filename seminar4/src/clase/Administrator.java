package clase;

public class Administrator {
    private String nume;
    private Integer varsta;

    private Administrator(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    //eager init
    public static Administrator instanta = new Administrator("Gigel", 30);

    public static Administrator getInstance() {
        return instanta;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}
