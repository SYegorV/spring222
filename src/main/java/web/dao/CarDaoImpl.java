package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> carList;

    {
        carList  = new ArrayList<>();
        carList.add(new Car("Bentley", "Blue", 8888));
        carList.add(new Car("BMW", "Green", 8448));
        carList.add(new Car("Tesla", "Red", 884488));
        carList.add(new Car("Chevrolet ", "White", 3384833));
        carList.add(new Car("Mazda", "Yellow", 228844));
    }

    @Override
    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public List<Car> getCountCarList(List<Car> allCarList, int count) {
        if (count == 0 || count > 5) return allCarList;
        return allCarList.stream().limit(count).collect(Collectors.toList());
    }
}
