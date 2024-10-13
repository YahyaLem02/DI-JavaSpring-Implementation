package DAO;

import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImp2 implements Idao{
    @Override
    public double getData() {
        double tmp = 10;
        return tmp;
    }
}
