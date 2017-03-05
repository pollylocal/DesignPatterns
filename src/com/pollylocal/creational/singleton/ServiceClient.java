package com.pollylocal.creational.singleton;

public class ServiceClient implements NamedService
{

    public static void main(String[] args)
    {

        ServiceRegistry.getInstance().addService(new ServiceClient());
    }

    @Override
    public String getName()
    {
        return "main service";
    }
}
