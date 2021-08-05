package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceIml implements CarService {
    private final List<Car> cars = new ArrayList<>();

    public CarServiceIml() {
        cars.add(new Car("VAZ", 9, "red"));
        cars.add(new Car("Mazda", 7, "black"));
        cars.add(new Car("Mercedes", 500, "white"));
        cars.add(new Car("Opel", 66, "green"));
        cars.add(new Car("Porshe", 911, "yellow"));
    }

    @Override
    public List<Car> getCars(int limit) {
        return cars.stream().limit(limit).collect(Collectors.toList());
    }
}
