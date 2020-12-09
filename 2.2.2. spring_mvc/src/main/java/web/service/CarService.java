package web.service;

import web.model.Car;

import java.util.LinkedList;
import java.util.List;

public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new LinkedList<>();

        cars.add(new Car("lada", 60, "white"));
        cars.add(new Car("renault", 60, "white"));
        cars.add(new Car("lada", 60, "green"));
        cars.add(new Car("saab", 60, "white"));
        cars.add(new Car("fiat", 60, "blue"));
    }

    public List<Car> getCars(int n) {
        return cars.subList(0, n);
    }
}
