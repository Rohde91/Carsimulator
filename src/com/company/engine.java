package com.company;

public class engine {
    boolean running;

    public void startEngine(){
        running = true;
        System.out.println("Starting engine.");
    }
    public void stopEngine(){
        running = false;
        System.out.println("Stopping engine.");
    }

    public void isRunning() {
        if (running == true){
            System.out.println("Car is running.");
        }
        else {
            System.out.println("Car is not running.");
        }
    }
}
