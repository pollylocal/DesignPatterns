package com.pollylocal.creational.abstractfactory;

import com.pollylocal.creational.abstractfactory.factory.ColaFactory;
import com.pollylocal.creational.abstractfactory.factory.PepsiFactory;

public class MainProgram
{
    public static void main(String[] args)
    {
        new Client(new PepsiFactory()).run();
        new Client(new ColaFactory()).run();
    }
}
