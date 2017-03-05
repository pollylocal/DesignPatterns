package com.pollylocal.creational.prototype;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString(exclude = {"defaultCircle", "defaultSquare"})
public class Editor
{
    private List<Figure> figures = new ArrayList<>();

    private final Circle defaultCircle = new Circle(5);
    private final Square defaultSquare = new Square(4);

    public Circle addCircle(){
        Circle circle = defaultCircle.clone();
        figures.add(circle);
        return circle;
    }

    public Square addSquare(){
        Square square = defaultSquare.clone();
        figures.add(square);
        return square;
    }
}
