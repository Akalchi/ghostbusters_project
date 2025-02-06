package dev.ghostbusters;

public class Ghost {

    private int id;

    public Ghost(int id, String name, String classType, String dangerLevel, String specialAbility, Object captureDate) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
