package web.dao;

import web.model.Car;
import java.util.List;

public interface CarDao {
    List<Car> getCountByCarList(List<Car> carList, int count);
}
