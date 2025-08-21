package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    private List<Car> cars = new ArrayList<>();

    public CarDaoImp() {
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Honda", "Accord", 2019));
        cars.add(new Car("BMW", "X5", 2021));
        cars.add(new Car("Audi", "A4", 2018));
        cars.add(new Car("Mercedes", "C-Class", 2022));
        cars.add(new Car("Mercedes", "C-Class", 2022));
        cars.add(new Car("Tesla", "Model 3", 2023));
        cars.add(new Car("Ford", "Mustang", 2020));
        cars.add(new Car("Chevrolet", "Camaro", 2021));
        cars.add(new Car("Volkswagen", "Golf", 2019));
        cars.add(new Car("Hyundai", "Tucson", 2022));
    }

    @Override
    public List<Car> getCar(int count) {

        if (count < 6) {
            return cars.subList(0, count);
        }else {
            return cars;
        }
    }
}
