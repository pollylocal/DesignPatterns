package com.pollylocal.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public final class ServiceRegistry
{
    private static final ServiceRegistry INSTANCE = new ServiceRegistry();
    private final Map<String, NamedService> serviceMap = new HashMap<>();

    public static ServiceRegistry getInstance()
    {
        return INSTANCE;
    }

    private ServiceRegistry()
    {
    }

    public void addService(NamedService service)
    {
        String name = service.getName();
        System.out.println("Registered service with name " + name);
        serviceMap.put(name, service);
    }

}
