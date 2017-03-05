package com.pollylocal.creational.factorymethod;

public class JsonDocumentFactory implements DocumentFactory
{
    @Override
    public Document create(String name)
    {
        return new JsonDocument(name);
    }
}
