package MoreExercises.OC02RawData;

import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;

    public Car(String model, Engine engine, Cargo cargo, List<Tire> tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public boolean isFragile() {
        if (cargo.getType().equals("fragile")) {
            for (Tire tire : tires) {
                if (tire.getPressure() < 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isFlammable() {
        return cargo.getType().equals("flamable") && engine.getPower() > 250;
    }

    public String getModel() {
        return model;
    }
}
