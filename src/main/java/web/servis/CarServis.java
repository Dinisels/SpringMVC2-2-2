package web.servis;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServis implements CarServ {

    @Autowired
private CarDao carDao;

    @Override
    public List<Car> getCar(int count) {
        return carDao.getCar(count);
    }

}
