package service;

import model.Car;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarServiseImpl implements CarService {
    @Override
    public List<Car> getCars(List<Car> cars, Integer amount) {
        List<Car> resultList = cars.stream().limit(amount).toList();
        return resultList;
    }

}
