package exercises.technology;

public class Laptop extends Computer{

    private final double weight;

    public Laptop(int storage, int ram, boolean hasKeyboard, boolean hasMouse, double weight) {
        super(storage, ram, hasKeyboard, hasMouse);
        this.weight = weight;
    }

    public boolean isClunky() {
        if (weight > 5.0) {
            return true;
        } else {
            return false;
        }
    }
}
