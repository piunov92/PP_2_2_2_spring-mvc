package web.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service("carService")
public class CarService {
    public List<Car> getCars(List<Car> cars, Integer count) {
        List<Car> carList = new ArrayList<>();
        if (count == null) {
            count = cars.size();
        }
        for (int i = 0; i < count && i < cars.size(); i++) {
            carList.add(cars.get(i));
        }
        return carList;
    }
}
