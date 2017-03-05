package com.pollylocal.creational.abstractfactory;

import com.pollylocal.creational.abstractfactory.factory.AbstractFactory;
import com.pollylocal.creational.abstractfactory.product.bottle.AbstractBottle;
import com.pollylocal.creational.abstractfactory.product.drink.AbstractDrink;

public class Client
{
    private AbstractBottle abstractBottle;
    private AbstractDrink abstractDrink;
    public Client(AbstractFactory abstractFactory){
        this.abstractBottle = abstractFactory.createBottle();
        this.abstractDrink = abstractFactory.createDrink();
    }

    public void run(){
        abstractBottle.interactWithDrink(abstractDrink);
    }
}
