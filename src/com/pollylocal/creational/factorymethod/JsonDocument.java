package com.pollylocal.creational.factorymethod;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class JsonDocument implements Document
{
    private final String name;
    private final Map<String, String> fields = new HashMap<>();


    public JsonDocument(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void addField(String name, String value)
    {
        fields.put(name, value);
    }

    @Override
    public String toString()
    {
        return fields.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .collect(Collectors.joining(",\n", "{\n", "\n}"));
    }
}
