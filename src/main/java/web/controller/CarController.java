package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final WebApplicationContext webApplicationContext;

    public CarController(WebApplicationContext webApplicationContext) {
        this.webApplicationContext = webApplicationContext;
    }

    @GetMapping(value = "/cars")
    public String printTableCars(@RequestParam(value = "count" , required = false) Integer count, Model model) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "Red", 1987));
        cars.add(new Car("Audi", "Blue", 2005));
        cars.add(new Car("Honda", "Yellow", 2008));
        cars.add(new Car("Mercedes", "Green", 2011));
        cars.add(new Car("Ford", "Yellow", 2024));

        CarService carService = webApplicationContext.getBean(CarService.class);
        model.addAttribute("cars", carService.getCars(cars, count));
        return "cars";
    }
}
