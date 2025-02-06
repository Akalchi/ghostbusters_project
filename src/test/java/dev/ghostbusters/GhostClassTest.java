package dev.ghostbusters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class GhostClassTest {

    private static final LocalDateTime LocalDateTime = null;
    
        @Test
        void testGhostClass() {
            // Arrange: Datos de prueba
            int id = 1;
            String name = "Espíritu del Pescador";
            String classType = "Clase IV";
            String dangerLevel = "Bajo";
            String specialAbility = "Aparece durante tormentas";
            LocalDateTime captureDate = LocalDateTime;

        Ghost ghost = new Ghost(id, name, classType, dangerLevel, specialAbility, captureDate);

        assertEquals(id, ghost.getId());
        assertEquals(name, ghost.getName());
        assertEquals(classType, ghost.getClassType());
        assertEquals(dangerLevel, ghost.getDangerLevel());
        assertEquals(specialAbility, ghost.getSpecialAbility());
        assertEquals(captureDate, ghost.getCaptureDate());
    }
}

