import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Volvo240Test {

    @Test
    void speedTest() {
        Volvo240 volvo = new Volvo240();
        volvo.gas(1);
        assertEquals(1.25, volvo.getCurrentSpeed());
        volvo.brake(1);
        assertEquals(0, volvo.getCurrentSpeed());
    }
    @Test
    void positionTest() {
        Volvo240 v = new Volvo240();
        v.move();
        assertEquals(0, v.x);
        assertEquals(0, v.y);
        v.gas(1);
        v.move();
        assertEquals(0, v.x);
        assertEquals(1.25, v.y);
        v.turnRight();
        v.move();
        assertEquals(1.25, v.x);
        assertEquals(1.25, v.y);
        v.turnRight();
        v.move();
        assertEquals(1.25, v.x);
        assertEquals(0, v.y);
    }
    @Test
    void testCurrentSpeed() {
        Volvo240 v = new Volvo240();
        double tempSpeed = v.getCurrentSpeed();
        for (int n = 0; n < 1000; n++) {
            v.gas(1);
        }
        assertTrue(tempSpeed <= v.getCurrentSpeed());
        assertTrue(v.getCurrentSpeed() <= 100);
    }
}