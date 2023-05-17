package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImp implements CarDao {
    @Override
    public List<Car> getCountByCarList(List<Car> carList, int count) {

        List<Car> carsByCount = new ArrayList<>();

        if (count < 5) {
            int i = 0;
            while ((count--) > 0) {
                carsByCount.add(carList.get(i++));
            }
        } else {
                return carList;
        }
        return carsByCount;
    }
}
