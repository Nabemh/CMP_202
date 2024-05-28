package Polymorphism;

public class Physics {
    float calculateVelocity(float distance, int time) {
        return distance/time;
    }
    float calculateVelocity(float initialVelocity, float acceleration, int time) {
        return initialVelocity + (acceleration * time);
    }
    public static void main(String[] args) {
        Physics calculate = new Physics();
        System.out.println(calculate.calculateVelocity(30, 12));
        System.out.println(calculate.calculateVelocity(23, 10, 20));
    }
}