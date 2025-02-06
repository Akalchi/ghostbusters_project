package dev.ghostbusters;

public class Ghost {

    private int id;
    private String name;
    
    public Ghost(int id, String name, String classType, String dangerLevel, String specialAbility, Object captureDate) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

}
