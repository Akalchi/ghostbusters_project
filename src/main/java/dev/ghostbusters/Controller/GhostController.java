package dev.ghostbusters.Controller;

import java.util.ArrayList;
import java.util.List;

import dev.ghostbusters.Model.Ghost;

public class GhostController {
    private final List<Ghost> ghosts = new ArrayList<>(); // Lista de fantasmas
    private int nextId = 1;

    public void captureGhost(String name, String classType, String dangerLevel, String specialAbility) {
        Ghost ghost = new Ghost(nextId++, name, classType, dangerLevel, specialAbility, java.time.LocalDate.now());
        ghosts.add(ghost);
    }










    




    public List<Ghost> getGhosts() {
        return ghosts;
    }

    public int getNextId() {
        return nextId;
    }
}


