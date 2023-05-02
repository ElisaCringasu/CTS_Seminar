package decorator.clase;

public class BiletDecorat extends Decorator{

    public BiletDecorat(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printareMesajSustinere() {
        System.out.println("Sustine echipa "+ super.getBilet().getNumeEchipa1());
    }



}
