package Metier;

import DAO.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImp implements Imetier {


 /*   public MetierImp(Idao dao) {
        this.dao = dao;
    }
*/
    //couplage faible
    //on injecter avec annotation @Autowired
    //@Autowired
   // @Qualifier("dao2")
    private Idao dao;


    //injection dans la variable DAO un objet
    // d une classe qui implements l interfcae Idao
    public void setDao(Idao dao) {
        this.dao = dao;
    }

    public Idao getDao() {
        return dao;
    }

    @Override
    public double calcul() {
        double temperatrure = dao.getData();
        double resultat = temperatrure+100;
        return resultat;
    }
}
