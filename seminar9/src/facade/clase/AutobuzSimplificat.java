package facade.clase;

public class AutobuzSimplificat {
    Autobuz autobuz;
    public AutobuzSimplificat(String nrInmatriculare){
        this.autobuz = new Autobuz(nrInmatriculare);
    }

    public void deschideUsi(){
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }

    public void ramaneLiber(){
        autobuz.ramaneLiberUsaFata();
        autobuz.ramaneLiberUsaMijloc();
        autobuz.ramaneLiberUsaSpate();
    }
}
