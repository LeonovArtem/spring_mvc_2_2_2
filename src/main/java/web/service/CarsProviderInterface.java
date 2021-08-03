package web.service;

import web.model.Car;

import java.util.List;

interface CarsProviderInterface {
    List<Car> getCars(int limit);
}
