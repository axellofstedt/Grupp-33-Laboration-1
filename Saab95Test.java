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
        saab.brake(1);
        assertEquals(0, saab.getCurrentSpeed());
    }
}