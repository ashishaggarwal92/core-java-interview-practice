package com.home.practice.core.java.abstrct.interfac;

public class Car implements Vehicle, Alarm{


// We have to override the method in order to avoid diamond issue
    @Override
    public String turnAlarmOff() {
        return Vehicle.super.turnAlarmOff();
    }
}


interface Vehicle {
    default String turnAlarmOff() {
        return "Turning the alarm off.";
    }
}

interface Alarm {
    default String turnAlarmOff() {
        return "Turning the alarm off.";
    }
}
