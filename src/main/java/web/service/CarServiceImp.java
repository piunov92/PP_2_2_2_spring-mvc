package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    List<Car> cars = List.of(
            new Car("Car1", "2001", "1"),
            new Car("Car2", "2002", "2"),
            new Car("Car3", "2003", "3"),
            new Car("Car4", "2004", "4"),
            new Car("Car5", "2005", "5")
    );

    @Override
    public List<Car> getCountByCarList(int count) {
        List<Car> carsByCount = new ArrayList<>();
        if (count < 5) {
            int i = 0;
            while ((count--) > 0) {
                carsByCount.add(cars.get(i++));
            }
        } else {
            return cars;
        }
        return carsByCount;
    }
}
