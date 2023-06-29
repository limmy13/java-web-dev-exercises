package exercises.technology;

public class SmartPhone extends Computer{

    private int numOfSelfies;

    public SmartPhone(int storage, int ram, boolean hasKeyboard, boolean hasMouse) {
        super(storage, ram, hasKeyboard, hasMouse);
        this.numOfSelfies = numOfSelfies + 1;
    }

    public void takeSelfie() {
        this.numOfSelfies = this.numOfSelfies + 1;
    }

    public int getNumOfSelfies() {
        return this.numOfSelfies;
    }
}
