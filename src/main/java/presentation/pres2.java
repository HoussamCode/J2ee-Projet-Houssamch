package presentation;

import Dao.IDao;
import Metier.Imetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.reflect.InvocationTargetException;

public class pres2 {
    public static void main(String[] args)throws  FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner s = new Scanner(new File("config.txt"));

        String daoClassName = s.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getConstructor().newInstance();
        System.out.println(dao.getData());

        String metierClassName =s.nextLine();
        Class cMetier =Class.forName(metierClassName);
        Imetier metier = (Imetier) cMetier.getConstructor(IDao.class).newInstance(dao);
        System.out.println("RESULTAT = " + metier.calcul());
    }
}
