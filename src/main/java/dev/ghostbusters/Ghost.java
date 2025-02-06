package dev.ghostbusters;

public class Ghost {

    private int id;
    private String name;
    private String classType;
    private String dangerLevel;
    private String specialAbility;
    
    public Ghost(int id, String name, String classType, String dangerLevel, String specialAbility, Object captureDate) {
        this.id = id;
        this.name = name;
        this.classType = classType;
        this.dangerLevel = dangerLevel;
        this.specialAbility = specialAbility;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getClassType() {
        return classType;
    }

    public String getDangerLevel() {
        return dangerLevel;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

}
