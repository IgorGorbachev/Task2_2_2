package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceCarImpl implements ServiceCar {


    @Override
    public List<Car> returnCountCar(List<Car> list, int count) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i <= count - 1; i++) {
            carList.add(list.get(i));
        }
        return carList;
    }
}
