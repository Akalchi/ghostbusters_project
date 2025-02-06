package dev.ghostbusters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.ghostbusters.Model.Ghost;

public class GhostControllerTest {
     private GhostController controller;

    @BeforeEach
    void setUp() {
        controller = new GhostController();
    }

    @Test
    void testCaptureGhost() {
        controller.captureGhost("Espíritu del Pescador", "Clase IV", "Bajo", "Aparecer durante tormentas en la costa");
        List<Ghost> ghosts = controller.filterGhostsByClass("Clase IV");
        assertEquals(1, ghosts.size());
        assertEquals("Espíritu del Pescador", ghosts.get(0).getName());
    }

}
