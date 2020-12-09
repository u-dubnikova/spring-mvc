package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String printCars(@RequestParam(value = "count",required = false) Integer n, ModelMap model) {
        if( n == null || n > 5 ){
            n = 5;
        }
        CarService cs = new CarService();
        List<Car> cars = cs.getCars(n);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
