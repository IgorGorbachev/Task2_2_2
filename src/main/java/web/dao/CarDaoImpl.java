package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    private final List<Car> listCars;

    private CarDaoImpl() {
        this.listCars = getAllCars();
    }

    @Override
    public List<Car> getAllCars() {
        if (this.listCars==null) {
            return List.of(
                    new Car("Car1", "Color1", 1000),
                    new Car("Car2", "Color2", 1000),
                    new Car("Car3", "Color3", 1000),
                    new Car("Car4", "Color4", 1000),
                    new Car("Car5", "Color5", 1000));
        } else {
            return listCars;
        }
    }

    @Override
    public List<Car> getAllCars(Integer count) {
            return listCars;
    }
}
