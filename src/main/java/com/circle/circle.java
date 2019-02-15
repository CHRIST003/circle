package com.circle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wise Christ
 */
public class circle {

    protected double radius;
    protected double diameter;
    protected double area;
    protected double circumference;

    public circle() {

    }//default

    public circle(double r) {
        this.radius = 0.0;

    }

    public void setRadius(double r) {

        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double area(double radius) {
        return (Math.PI * radius * radius);
    }

    public double diameter(double radius) {
        return (2 * radius);
    }

    public double circumference(double radius) {
        return (2 * Math.PI * radius);
    }

    // any class that you define even though it doesn't have an extends in it is a subclass of object
    @Override
    public String toString() {
        return "radius:" + getRadius() + "\n" + "Circumference:" + circumference + "\n" + " Diameter:" + diameter + "\n" + " Area: " + area;
        System.out.println("Radius:"+getRadius()); // taylor add this line just for the radius
    }

}

