package com.pollylocal.creational.prototype;

public class PrototypeClient
{
    public static void main(String[] args)
    {
        Editor editor = new Editor();

        editor.addCircle();
        Circle circle = editor.addCircle();
        circle.changeRadius(1);
        editor.addSquare();
        Square square = editor.addSquare();
        square.changeSize(-2);

        System.out.println(editor);

    }
}
