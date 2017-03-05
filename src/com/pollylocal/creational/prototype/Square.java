package com.pollylocal.creational.prototype;

import lombok.ToString;

@ToString
public class Square implements Figure
{
    private double size;

    public Square(double size)
    {
        this.size = size;
    }

    public void changeSize(double delta)
    {
        this.size += delta;
    }

    @Override
    public double getArea()
    {
        return size * size;
    }

    @Override
    public Square clone()
    {
        return new Square(size);
    }
}
