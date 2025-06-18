package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.ServiceCarImpl;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {


    @Autowired
    private ServiceCarImpl serviceCar;

    private List<Car> listCars = List.of(
            new Car("Car1", "Color1", 1000),
            new Car("Car2", "Color2", 2000),
            new Car("Car3", "Color3", 3000),
            new Car("Car4", "Color4", 4000),
            new Car("Car5", "Color5", 5000));

    @GetMapping("/")
    public String createTableCars(Model model) {
        List<Car> listCars = this.listCars;
        model.addAttribute("listCars", listCars);
        return "cars";
    }

    @GetMapping("/cars")
    public String showCountCar(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count != null && count <= 5) {
            List<Car> countCarList = serviceCar.returnCountCar(listCars, count);
            model.addAttribute("listCars", countCarList);
            return "cars";
        } else {
            List<Car> listCars = this.listCars;
            model.addAttribute("listCars", listCars);
            return "cars";
        }
    }
}
