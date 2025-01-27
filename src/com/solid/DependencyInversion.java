package com.solid;
/*
*  Dependency on abstraction not concretions for flexibility.
*  OR
*  The DI states that high - level modules should not depend on low-level
*  modules. both should depend on abstractions.
* */
class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb is turned on");
    }
    public void turnOff(){
        System.out.println("LightBulb is turned off");
    }
}
class Switch {
    private LightBulb lightBulb;
    public Switch(LightBulb lightBulb){
        this.lightBulb = lightBulb;
    }
    public void flip(boolean on){
        if(on){
            lightBulb.turnOn();
        }else{
            lightBulb.turnOff();
        }
    }
}

/* Based On Solid principles it becomes */
interface Switchable {
    void turnOn();
    void turnOff();
}
class LightBulbs implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("LightBulb is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb is turned off");
    }
}
class Switchs {
    private Switchable switchable;
    public Switchs(Switchable switchable){
        this.switchable = switchable;
    }
    public void flip(boolean on){
        if(on){
            switchable.turnOn();
        }else {
            switchable.turnOff();
        }
    }
}

public class DependencyInversion {
    public static void main(String[] args) {
        Switchable lightBulb = new LightBulbs();
        Switchs lightWitch = new Switchs(lightBulb);
        lightWitch.flip(true);
        lightWitch.flip(false);
    }
}
