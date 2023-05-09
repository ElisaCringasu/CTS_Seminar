package state.clase;

public class StareArePinIntrodus implements IStare{
    @Override
    public void modificaStare(Bancomat bancomat) {
        if(bancomat.getStare() instanceof StareAreCard){
            bancomat.setStare(this);
            System.out.println("A fost introdus pinul");
        }else{
            System.out.println("Introduceti pinul corect");
        }
    }
}
