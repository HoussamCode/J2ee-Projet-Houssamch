package presentation;

import ext.DaoImplV2;
import Metier.MetierImpl;

public class pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl m =new MetierImpl(d);
        System.out.println("Resultat = "+m.calcul());

    }
}
