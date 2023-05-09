package template.clase;

public class BancomatBitcoin extends BancomatAbstract{

    public BancomatBitcoin(String adresa) {
        super(adresa);
    }

    @Override
    protected void introduceCard() {
        System.out.println("A fost introdus cardul Bitcoin in bancomatul din "+super.getAdresa());
    }

    @Override
    protected void introducePin() {
        System.out.println("A fost introdus PIN-ul pentru cardul Bitcoin in bancomatul din "+super.getAdresa());
    }

    @Override
    protected void specificareSuma(int suma) {
        System.out.println("A fost specificata suma de criptomoneda pentru retragere "+ suma);
    }

    @Override
    protected void retrageSuma() {
        System.out.println("A fost retrasa suma de criptomoneda solicitata din bancomatul din "+super.getAdresa());
    }

    @Override
    protected void retrageCard() {
        System.out.println("A fost retras cardul bitcoin din bancomatul din "+super.getAdresa());
    }
}
