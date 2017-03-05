package com.pollylocal.creational.abstractfactory.product.bottle;

import com.pollylocal.creational.abstractfactory.product.drink.AbstractDrink;

public class ColaBottle implements AbstractBottle
{
    @Override
    public void interactWithDrink(AbstractDrink abstractDrink)
    {
        System.out.println("Coca-Cola bottle interact with " + abstractDrink.getName());
    }
}
