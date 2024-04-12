package MoreExercises.OC02RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split("\\s+");
            String model = carInfo[0];
            int speed = Integer.parseInt(carInfo[1]);
            int power = Integer.parseInt(carInfo[2]);
            int weight = Integer.parseInt(carInfo[3]);
            String type = carInfo[4];

            List<Tire> tires = new ArrayList<>();
            for (int j = 5; j < carInfo.length; j += 2) {
                double pressure = Double.parseDouble(carInfo[j]);
                int age = Integer.parseInt(carInfo[j + 1]);
                tires.add(new Tire(pressure, age));
            }

            cars.add(new Car(model, new Engine(speed, power), new Cargo(weight, type), tires));
        }

        String command = scanner.nextLine();
        if (command.equals("fragile")) {
            cars.stream()
                    .filter(Car::isFragile)
                    .forEach(car -> System.out.println(car.getModel()));
        } else if (command.equals("flamable")) {
            cars.stream()
                    .filter(Car::isFlammable)
                    .forEach(car -> System.out.println(car.getModel()));
        }
    }
}