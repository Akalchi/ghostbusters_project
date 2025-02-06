package dev.ghostbusters;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    
}
