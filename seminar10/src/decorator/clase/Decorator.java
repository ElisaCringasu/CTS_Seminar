package decorator.clase;

public abstract class Decorator implements IBilet{

    private IBilet bilet;

    public IBilet getBilet() {
        return bilet;
    }

    @Override
    public String getNumeEchipa1() {
        return bilet.getNumeEchipa1();
    }

    public Decorator(IBilet bilet) {
        super();
        this.bilet = bilet;
    }

    @Override
    public void printareBilet() {
        this.bilet.printareBilet();
        this.printareMesajSustinere();
    }

    public abstract void printareMesajSustinere();
}
