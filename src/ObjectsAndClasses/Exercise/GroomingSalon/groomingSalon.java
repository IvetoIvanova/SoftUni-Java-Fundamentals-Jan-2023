package ObjectsAndClasses.Exercise.GroomingSalon;

import java.util.ArrayList;
import java.util.List;

public class groomingSalon {
    private List<Pet> data;
    private int capacity;

    public groomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (this.data.size() < this.capacity) {
            this.data.add(pet);
        }
    }

    public boolean remove(String name) {

        for (Pet pet : this.data) {
            if (pet.getName().equals(name)) {
                this.data.remove(pet);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner) {

        for (Pet pet : this.data) {
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)) {
                return pet;
            }
        }
        return null;
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder output = new StringBuilder();

        output.append("The grooming salon has the following clients:\n");

        for (Pet pet : this.data) {
            output.append(pet.getName()).append(" ").append(pet.getOwner()).append("\n");
        }

        return output.toString();
    }
}