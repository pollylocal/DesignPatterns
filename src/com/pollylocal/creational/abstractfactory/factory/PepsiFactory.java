package com.pollylocal.creational.abstractfactory.factory;

import com.pollylocal.creational.abstractfactory.product.bottle.AbstractBottle;
import com.pollylocal.creational.abstractfactory.product.bottle.PepsiBottle;
import com.pollylocal.creational.abstractfactory.product.drink.AbstractDrink;
import com.pollylocal.creational.abstractfactory.product.drink.PepsiDrink;

public class PepsiFactory implements AbstractFactory
{
    @Override
    public AbstractDrink createDrink()
    {
        return new PepsiDrink();
    }

    @Override
    public AbstractBottle createBottle()
    {
        return new PepsiBottle();
    }
}
