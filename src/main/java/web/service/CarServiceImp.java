package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Lada", 99, "Sedan"));
        cars.add(new Car("Opel", 111, "Astra"));
        cars.add(new Car("Nisan", 222, "Zhyk"));
        cars.add(new Car("Lada", 333, "Priora"));
        cars.add(new Car("Lada", 444, "kalina"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count > 0 && count < 6) {
            cars = cars.subList(0, count);
        }
        return cars;
    }
}
