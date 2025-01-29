import java.awt.*;

public class Car implements Movable {
    protected int nrDoors;
    protected double enginePower;
    protected double currentSpeed;
    protected Color color;
    protected String modelName;
    private int direction = 0;
    double x, y = 0;

    public void move() {
        switch (direction) {
            case 0:
                y += getCurrentSpeed();
                break;
            case 1:
                x += getCurrentSpeed();
                break;
            case 2:
                y -= getCurrentSpeed();
                break;
            case 3:
                x -= getCurrentSpeed();
                break;
        }
    }

    public void turnLeft() {
        direction--;
    }

    public void turnRight() {
        direction++;
    }

    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor() {
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

    public static void main(String[] args) {
        Volvo240 v = new Volvo240();
        v.move();
        v.gas(5);
        System.out.println(v.getCurrentSpeed());
        v.move();
        System.out.println(v.x + " " + v.y);
        v.turnRight();
        v.move();
        System.out.println(v.x + " " + v.y);
        v.turnRight();
        v.move();
        System.out.println(v.x + " " + v.y);
    }
}
