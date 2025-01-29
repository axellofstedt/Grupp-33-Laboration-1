import static org.junit.jupiter.api.Assertions.*;

class Saab95Test {

    @org.junit.jupiter.api.Test
    void setTurboOn() {
    }

    @org.junit.jupiter.api.Test
    void setTurboOff() {
    }



    @org.junit.jupiter.api.Test
    void testSpeeds() {
        Saab95 saab = new Saab95();
        saab.gas(1);
        assertEquals(1.25, saab.getCurrentSpeed());
        assertThrows(IllegalArgumentException.class, () -> saab.gas(2));
        saab.brake(1);
        assertEquals(0, saab.getCurrentSpeed());
    }

    @org.junit.jupiter.api.Test
    void positionTest() {
        Saab95 s = new Saab95();
        s.move();
        assertEquals(0, s.x);
        assertEquals(0, s.y);
        s.gas(1);
        s.move();
        assertEquals(0, s.x);
        assertEquals(1.25, s.y);
        s.turnRight();
        s.move();
        assertEquals(1.25, s.x);
        assertEquals(1.25, s.y);
        s.turnRight();
        s.move();
        assertEquals(1.25, s.x);
        assertEquals(0, s.y);
    }

    @org.junit.jupiter.api.Test
    void testCurrentSpeed() {
        Saab95 s = new Saab95();
        double tempSpeed = s.getCurrentSpeed();
        for (int n = 0; n < 1000; n++) {
            s.gas(1);
        }
        assertTrue(tempSpeed <= s.getCurrentSpeed());
        assertTrue(s.getCurrentSpeed() <= 125);
    }
}