package com.karad;
enum TrafficLight {
    RED(30), GREEN(60), YELLOW(5);

    private int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

public class TestTraffic {
    public static void main(String[] args) {
        for (TrafficLight t : TrafficLight.values()) {
            System.out.println(t + " → " + t.getDuration() + " seconds");
        }
    }
}