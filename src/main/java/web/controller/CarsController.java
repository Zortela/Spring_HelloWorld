package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count,
                          ModelMap model) {

        if (count == null) {
            count = 5;
        }

        model.addAttribute("ListCars", carService.getCars(count));

        return "cars";
    }
}
