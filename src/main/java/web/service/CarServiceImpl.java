package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "Red", 1987));
        cars.add(new Car("Audi", "Blue", 2001));
        cars.add(new Car("Honda", "Yellow", 1983));
        cars.add(new Car("Mercedes", "Yellow", 2011));
        cars.add(new Car("Ford", "Green", 2014));
    }

    @Override
    public List<Car> getCars(Integer count) {
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
