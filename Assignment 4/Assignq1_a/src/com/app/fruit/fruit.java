

package com.app.fruit;

public abstract class fruit {
    protected String name;
    protected String color;
    protected double weight;
    protected boolean isFresh;

    
    public fruit(String name, String color, double weight, boolean isFresh) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isFresh = isFresh;
    }

    
    public abstract String taste();

    
    public String getName() {
        return name;
    }

    public boolean isFresh() {
        return isFresh;
    }

   
    public void setFresh(boolean isFresh) {
        this.isFresh = isFresh;
    }

    
    @Override
    public String toString() {
        return "Name=" + name + ", Color=" + color + ", Weight=" + weight;
    }
}

