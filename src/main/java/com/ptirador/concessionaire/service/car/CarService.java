package com.ptirador.concessionaire.service.car;

import com.ptirador.concessionaire.model.car.Car;

/**
 * Interface service for car management.
 *
 * @author ptirador
 */
public interface CarService {

    /**
     * Obtains a full list of cars.
     *
     * @return List of all available cars.
     */
    Iterable<Car> getAllCars();
}
