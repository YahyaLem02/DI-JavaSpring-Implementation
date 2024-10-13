package DAO;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImp implements Idao{
    @Override
    public double getData() {
        double tmp;
        tmp = 20;
        return tmp;
    }
}
