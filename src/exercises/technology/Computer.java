package exercises.technology;
// parent class
public class Computer {

    private int ram;
    private int storage;
    private boolean hasKeyboard;
    private boolean hasMouse;

    public Computer(int storage, int ram, boolean hasKeyboard, boolean hasMouse) {
        super();
        this.storage = storage;
        this.ram = ram;
        this.hasKeyboard = hasKeyboard;
        this.hasMouse = hasMouse;
    }

    public void increaseRAM (int n) {
        this.ram = this.ram + n;
    }

    public void increaseStorage(int x) {
        this.storage = this.storage + x;
    }
}

