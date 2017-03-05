package com.pollylocal.creational.abstractfactory.factory;

import com.pollylocal.creational.abstractfactory.product.bottle.AbstractBottle;
import com.pollylocal.creational.abstractfactory.product.drink.AbstractDrink;

public interface AbstractFactory
{
    AbstractDrink createDrink();
    AbstractBottle createBottle();
}
