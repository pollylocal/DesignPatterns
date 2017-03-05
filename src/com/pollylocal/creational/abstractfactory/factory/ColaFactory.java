package com.pollylocal.creational.abstractfactory.factory;

import com.pollylocal.creational.abstractfactory.product.bottle.AbstractBottle;
import com.pollylocal.creational.abstractfactory.product.bottle.ColaBottle;
import com.pollylocal.creational.abstractfactory.product.drink.AbstractDrink;
import com.pollylocal.creational.abstractfactory.product.drink.ColaDrink;

public class ColaFactory implements AbstractFactory
{
    @Override
    public AbstractDrink createDrink()
    {
        return new ColaDrink();
    }

    @Override
    public AbstractBottle createBottle()
    {
        return new ColaBottle();
    }
}
