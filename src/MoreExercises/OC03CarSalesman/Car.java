package MoreExercises.OC03CarSalesman;

public class Car {
    String model;
    Engine engine;
    Integer weight;
    String color;

    public Car(String model, Engine engine, Integer weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public String toString() {
        String engineDisplacement = (engine.displacement == 0) ? "n/a" : Integer.toString(engine.displacement);
        String engineEfficiency = (engine.efficiency == null) ? "n/a" : engine.efficiency;
        String carWeight = (weight == null) ? "n/a" : Integer.toString(weight);
        String carColor = (color == null) ? "n/a" : color;

        return String.format("%s:\n  %s:\n    Power: %d\n    Displacement: %s\n    Efficiency: %s\n  Weight: %s\n  Color: %s",
                model, engine.model, engine.power, engineDisplacement, engineEfficiency, carWeight, carColor);
    }
}
