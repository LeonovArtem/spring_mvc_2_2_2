package web.service;

import web.model.Car;

import java.util.List;

interface CarService {
    List<Car> getCars(int limit);
}
