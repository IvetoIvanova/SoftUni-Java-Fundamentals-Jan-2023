package MoreExercises.OC03CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Engine> engines = new HashMap<>();
        int enginesCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < enginesCount; i++) {
            String[] engineInfo = scanner.nextLine().split("\\s+");
            String model = engineInfo[0];
            int power = Integer.parseInt(engineInfo[1]);
            int displacement = 0;
            String efficiency = null;

            if (engineInfo.length > 2) {
                try {
                    displacement = Integer.parseInt(engineInfo[2]);
                } catch (NumberFormatException e) {
                    efficiency = engineInfo[2];
                }
            }

            if (engineInfo.length > 3) {
                efficiency = engineInfo[3];
            }

            Engine engine = new Engine(model, power, displacement, efficiency);
            engines.put(model, engine);
        }

        int carsCount = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < carsCount; i++) {
            String[] carInfo = scanner.nextLine().split("\\s+");
            String model = carInfo[0];
            Engine engine = engines.get(carInfo[1]);
            Integer weight = null;
            String color = null;

            if (carInfo.length >= 3) {
                try {
                    weight = Integer.parseInt(carInfo[2]);
                } catch (NumberFormatException e) {
                    color = carInfo[2];
                }
            }

            if (carInfo.length == 4) {
                color = carInfo[3];
            }

            Car car = new Car(model, engine, weight, color);
            cars.add(car);
        }

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
