package dev.ghostbusters.Controller;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import dev.ghostbusters.Model.Ghost;

public class GhostController {
    private final List<Ghost> ghosts = new ArrayList<>();
    private int nextId = 1;

    public void captureGhost(String name, String classType, String dangerLevel, String specialAbility) {
        Ghost ghost = new Ghost(nextId++, name, classType, dangerLevel, specialAbility, java.time.LocalDate.now());
        ghosts.add(ghost);
    }

    public boolean releaseGhostById(int id) {
        boolean removed = ghosts.removeIf(ghost -> ghost.getId() == id);
        return removed;
    }

    public List<Ghost> filterGhostsByClass(String classType) {
        return ghosts.stream()
                .filter(ghost -> ghost.getClassType().equalsIgnoreCase(classType))
                .collect(Collectors.toList());
    }

    public List<Ghost> filterGhostsByDate(LocalDate date) {
        return ghosts.stream()
                .filter(ghost -> ghost.getCaptureDate().equals(date))
                .collect(Collectors.toList());
    }

    public List<Ghost> getGhosts() {
        return ghosts;
    }

}


