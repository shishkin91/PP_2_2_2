package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
@Service
public class CarServiseImpl implements CarService {
    @Override
    public List<Car> getCars(List<Car> cars, Integer amount) {
        List<Car> resultList = cars.stream().limit(amount).toList();
        return resultList;
    }

    @Override
    public List<Car> carList() {
        return Arrays.asList(new Car("color1", "manufacturer1", 1)
                , new Car("color2", "manufacturer2", 2)
                , new Car("color3", "manufacturer3", 3)
                , new Car("color4", "manufacturer4", 4)
                , new Car("color5", "manufacturer5", 5));
    }

}
