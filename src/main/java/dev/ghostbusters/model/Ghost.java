package dev.ghostbusters.model;

import java.time.LocalDateTime;

public class Ghost {

    private int id;
    private String name;
    private String classType;
    private String dangerLevel;
    private String specialAbility;
    private LocalDateTime captureDate;

    public Ghost(int id, String name, String classType, String dangerLevel, String specialAbility, LocalDateTime captureDate) {
        this.id = id;
        this.name = name;
        this.classType = classType;
        this.dangerLevel = dangerLevel;
        this.specialAbility = specialAbility;
        this.captureDate = captureDate;
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

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(String dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

    public LocalDateTime getCaptureDate() {
        return captureDate;
    }
 
}

