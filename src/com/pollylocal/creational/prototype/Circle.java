package com.pollylocal.creational.prototype;

import lombok.ToString;

import static java.lang.Math.PI;

@ToString
public class Circle implements Figure
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public void changeRadius(double delta)
    {
        radius += delta;
    }

    @Override
    public double getArea()
    {
        return PI * radius * radius;
    }

    @Override
    public Circle clone()
    {
        return new Circle(radius);
    }
}
