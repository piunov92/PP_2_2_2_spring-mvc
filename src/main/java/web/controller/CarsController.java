package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
public class CarsController {

    CarService carService = new CarServiceImp();

    @GetMapping(value = "/cars")
    public String testController(@RequestParam(value = "count", defaultValue = "5") Integer count, ModelMap model) {
        model.addAttribute("carList", carService.getCountByCarList(count));
        return "cars_page";
    }
}
