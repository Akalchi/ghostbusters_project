package dev.ghostbusters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import dev.ghostbusters.Controller.GhostController;
import dev.ghostbusters.Model.Ghost;

public class GhostControllerTest {

    private GhostController ghostController;

    @BeforeEach
    public void setUp() {
        ghostController = new GhostController();
    }

    @Test
    public void testCaptureGhost() {
        ghostController.captureGhost("Espíritu del Pescador de Lastres", "Clase IV", "Bajo", "Aparecer durante tormentas en la costa");
    
        List<Ghost> capturedGhosts = ghostController.getGhosts();  
    
        assertEquals(1, capturedGhosts.size());
        assertEquals("Espíritu del Pescador de Lastres", capturedGhosts.get(0).getName());
    }

    @Test
    public void testReleaseGhostById(){
        ghostController.captureGhost("Espíritu del Pescador de Lastres", "Clase IV", "Bajo", "Aparecer durante tormentas en la costa");
        List<Ghost> allGhosts = ghostController.getGhosts();
        Ghost ghostToRelease = allGhosts.stream()
        .filter(ghost -> ghost.getClassType().equalsIgnoreCase("Clase IV")) .findFirst().orElse(null);
        assertNotNull(ghostToRelease);
        assertTrue(ghostController.releaseGhostById(ghostToRelease.getId()));
        assertFalse(ghostController.releaseGhostById(ghostToRelease.getId()));
    }
        
}
