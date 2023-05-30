package dubluri;

import clase.IPersoana;

import java.lang.reflect.Array;

public class FakePersoana implements IPersoana {

    private String getSexValue;
    private int getVarstaValue;
    private boolean checkCNPValue;

    public void setGetSexValue(String getSexValue) {
        this.getSexValue = getSexValue;
    }

    public void setGetVarstaValue(int getVarstaValue) {
        this.getVarstaValue = getVarstaValue;
    }

    public void setCheckCNPValue(boolean checkCNPValue) {
        this.checkCNPValue = checkCNPValue;
    }

    @Override
    public String getSex() {
        return getSexValue;
    }

    @Override
    public int getVarsta() {
        return getVarstaValue;
    }

    @Override
    public boolean checkCNP() {
        return checkCNPValue;
    }
}
