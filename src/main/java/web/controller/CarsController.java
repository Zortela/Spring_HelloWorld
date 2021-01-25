package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count,
                          ModelMap model) {
        
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Lada", 99, "Sedan"));
        cars.add(new Car("Opel", 111, "Astra"));
        cars.add(new Car("Nisan", 222, "Zhyk"));
        cars.add(new Car("Lada", 333, "Priora"));
        cars.add(new Car("Lada", 444, "kalina"));

        if (count != null && count > 0 && count < 6) {
            cars = cars.subList(0, count);
        }

            model.addAttribute("ListCars", cars);

            return "cars";
        }

    }
