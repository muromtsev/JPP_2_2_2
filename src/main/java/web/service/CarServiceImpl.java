package web.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("BMW", "x1", 2021));
        cars.add(new Car("BMW", "x5", 2023));
        cars.add(new Car("Mersedes", "x1", 2024));
        cars.add(new Car("Lada", "Kalina", 2020));
        cars.add(new Car("Chevrolet", "Impala", 1967));
    }

    @Override
    public List<Car> getCarList(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }

}
