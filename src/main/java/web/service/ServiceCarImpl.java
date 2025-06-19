package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;

@Component
public class ServiceCarImpl implements ServiceCar {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getAllCars(Integer count) {
        if (count != null && count <= 5) {
            return carDao.getAllCars().subList(0, count);
        } else {
            return carDao.getAllCars();
        }
    }
}

