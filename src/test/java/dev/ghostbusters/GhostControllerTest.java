package dev.ghostbusters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
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
        public void testReleaseGhostById() {
    
           this.ghostController.captureGhost("Espíritu del Pescador de Lastres", "Clase IV", "Bajo", "Aparecer durante tormentas en la costa");
    
           Ghost ghostToRelease = this.ghostController.getGhosts().stream()
            .filter(ghost -> ghost.getClassType().equalsIgnoreCase("Clase IV"))
            .findFirst()
            .orElse(null);
    
           Assertions.assertNotNull(ghostToRelease);
    
           Assertions.assertTrue(this.ghostController.releaseGhostById(ghostToRelease.getId()));
    
           Assertions.assertFalse(this.ghostController.releaseGhostById(ghostToRelease.getId()));
        }
    
          @Test
        public void testFilterGhostsByClass() {
    
            ghostController.captureGhost("Ghost 1", "Class IV", "High", "Invisibility");
            ghostController.captureGhost("Ghost 2", "Class IV", "Low", "Screaming");
            ghostController.captureGhost("Ghost 3", "Class VI", "High", "Big damage");
    
            List<Ghost> classAGhosts = ghostController.filterGhostsByClass("Class IV");
    
            assertEquals(2, classAGhosts.size());
            assertTrue(classAGhosts.stream().anyMatch(ghost -> ghost.getName().equals("Ghost 1")));
            assertTrue(classAGhosts.stream().anyMatch(ghost -> ghost.getName().equals("Ghost 2")));
        }
    
        @Test
        public void testFilterGhostsByDate() {
    
            ghostController.captureGhost("Ghost 1", "Class IV", "High", "Invisibility");
            ghostController.captureGhost("Ghost 2", "Class IV", "Low", "Screaming");
    
            List<Ghost> ghostsOnToday = ghostController.filterGhostsByDate(LocalDate.now());


        assertEquals(2, ghostsOnToday.size());
        assertTrue(ghostsOnToday.stream().anyMatch(ghost -> ghost.getName().equals("Ghost 1")));
        assertTrue(ghostsOnToday.stream().anyMatch(ghost -> ghost.getName().equals("Ghost 2")));
    }





   
}
