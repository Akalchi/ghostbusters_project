package dev.ghostbusters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GhostClassTest {

      @Test
    public void testGetId() {
        // Arrange
        int id = 1;
        Ghost ghost = new Ghost(id, null, null, null, null, null);

        // Act & Assert
        assertEquals(id, ghost.getId(), "The ID does not match what is expected");
    }
}
