package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.ServiceCar;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {


    @Autowired
    private ServiceCar serviceCar;


    @GetMapping("/")
    public String createTableCars(Model model) {
        List<Car> listCars = serviceCar.getAllCars();
        model.addAttribute("listCars", listCars);
        return "cars";
    }

    @GetMapping("/cars")
    public String showCountCar(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> carsToShow = serviceCar.getAllCars(count);
        model.addAttribute("listCars", carsToShow);
        return "cars";
    }
}
