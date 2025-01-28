import java.awt.*;
import java.lang.*;

public class Car{
    public final static double trimFactor = 1.25;
    public boolean turboOn;
    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name

    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }





    public static void main(String[]arg){
        Volvo240 Volvo = new Volvo240();
        Saab95 Saab = new Saab95();
        Volvo.startEngine();
        Saab.startEngine();
        Saab.setTurboOn();
        Volvo.incrementSpeed(5);
        Saab.incrementSpeed(5);
        System.out.println(Volvo.getCurrentSpeed());
        System.out.println(Saab.getCurrentSpeed());
    }
}

