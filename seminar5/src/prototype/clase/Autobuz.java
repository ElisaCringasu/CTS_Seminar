package prototype.clase;

public class Autobuz implements MijlocTransport {
    private String nrInmatriculare;

    private int nrLocuri;

    public Autobuz() {
        this.nrInmatriculare = "AAAAAAA";
        this.nrLocuri = 10;
    }

    public Autobuz(String nrInmatriculare, int nrLocuri) {
        if (nrInmatriculare.length() == 7 || nrInmatriculare.length() == 6) {
            this.nrInmatriculare = nrInmatriculare;
        }
        if (nrLocuri >= 10 && nrLocuri <= 50) {
            this.nrLocuri = nrLocuri;
        }
    }

    public void setNrInmatriculare(String nr) {
        this.nrInmatriculare = nr;
    }

    @Override
    public MijlocTransport copiaza() {
        Autobuz a = new Autobuz();
        a.nrInmatriculare = this.nrInmatriculare;
        a.nrLocuri = this.nrLocuri;

        return a;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "nrInmatriculare='" + nrInmatriculare + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
