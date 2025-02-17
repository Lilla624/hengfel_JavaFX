package com.example;

public class Henger {
    Integer id;
    Double radius;
    Double length;
    Double surface;

    public Henger(Integer id, Double radius, Double length, Double surface) {
        this.id = id;
        this.radius = radius;
        this.length = length;
        this.surface = surface;
    }

    public Henger(Double radius, Double length, Double surface) {
        this.radius = radius;
        this.length = length;
        this.surface = surface;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Double getRadius() {
        return radius;
    }
    public void setRadius(Double radius) {
        this.radius = radius;
    }
    public Double getLength() {
        return length;
    }
    public void setLength(Double length) {
        this.length = length;
    }
    public Double getSurface() {
        return surface;
    }
    public void setSurface(Double surface) {
        this.surface = surface;
    }
}
