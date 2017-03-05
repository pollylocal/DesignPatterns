package com.pollylocal.creational.abstractfactory.product.bottle;

import com.pollylocal.creational.abstractfactory.product.drink.AbstractDrink;

public class PepsiBottle implements AbstractBottle
{
    @Override
    public void interactWithDrink(AbstractDrink abstractDrink)
    {
        System.out.println("Pepsi bottle interact with " + abstractDrink.getName());
    }
}
