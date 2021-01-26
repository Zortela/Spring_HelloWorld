package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count,
                          ModelMap model) {

        if (count == null) {
            count = 5;
        }
        CarService cars = new CarServiceImp();

        model.addAttribute("ListCars", cars.getCars(count));

        return "cars";
    }

}
