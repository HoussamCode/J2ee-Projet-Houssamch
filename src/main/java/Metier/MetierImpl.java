package Metier;

import Dao.IDao;

public class MetierImpl implements Imetier{
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double temp = dao.getData();
        return temp*43/3;
    }
}
