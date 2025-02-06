package dev.ghostbusters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class GhostClassTest {

      @Test
    public void testGetId() {
        int id = 1;
        Ghost ghost = new Ghost(id, "Name", "Class", "Level", "Ability", LocalDateTime.now());
        assertEquals(id, ghost.getId());
    }

    @Test
    public void testGetName() {
        String name = "Espíritu";
        Ghost ghost = new Ghost(1, name, "Class", "Level", "Ability", LocalDateTime.now());
        assertEquals(name, ghost.getName());
    }
}
