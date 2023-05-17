package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {

    CarDao dao = new CarDaoImp();

    @Override
    public List<Car> getCountByCarList(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Car1", "2001", "1"));
        cars.add(new Car("Car2", "2002", "2"));
        cars.add(new Car("Car3", "2003", "3"));
        cars.add(new Car("Car4", "2004", "4"));
        cars.add(new Car("Car5", "2005", "5"));
        return dao.getCountByCarList(cars, count);
    }
}
