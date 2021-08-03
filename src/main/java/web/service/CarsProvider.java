package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.model.CarColor;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarsProvider implements CarsProviderInterface {
    private final List<Car> cars = new ArrayList<>();

    public CarsProvider() {
        cars.add(new Car("VAZ", 9, CarColor.RED));
        cars.add(new Car("Mazda", 7, CarColor.BLACK));
        cars.add(new Car("Mercedes", 500, CarColor.WHITE));
        cars.add(new Car("Opel", 66, CarColor.GREEN));
        cars.add(new Car("Porshe", 911, CarColor.YELLOW));
    }

    @Override
    public List<Car> getCars(int limit) {
        return cars.stream().limit(limit).collect(Collectors.toList());
    }
}
